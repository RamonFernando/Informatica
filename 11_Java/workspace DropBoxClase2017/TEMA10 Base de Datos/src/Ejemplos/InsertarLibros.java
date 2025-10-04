package Ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarLibros {

	public static void main(String[] args) {
		listar();
	}

	private static void listar() {

		// Creamos los objetos que nos permitirán conectar con la BD y
		// enviarle consultas SQL.
		Connection conn = null;
		Statement stmt = null;

		try {

			// Cargamos el driver de conexión con la BD MySQL.
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// Datos de conexión a la BD Libreria.
			String usuario = "root";
			String password = "12345678";
			String url = "jdbc:mysql://localhost/Libreria";

			// Obtenemos una conexión a la BD con las credenciales
			// anteriores.
			conn = DriverManager.getConnection(url, usuario, password);

			// Creamos un objeto Statement que nos servirá para ejecutar
			// consultas sql.
			stmt = conn.createStatement();

			// Creamos una consulta SQL.
			String sql = "insert into libros "
					+ "values(1008, 'El Conde Lucanor', 'Don Juan Manuel', 5, 3)";

			// Enviamos la consulta y guardamos los resultados en un
			// objeto ResultSet.
			boolean insertado = stmt.execute(sql);

			// Comprobamos si se ha hecho el cambio en la BD.
			mostrar(stmt);

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Cerramos los objetos de la BD. El ResultSet se cerrará
			// automáticamente cuando cerremos el Statement.
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void mostrar(Statement st) throws SQLException {

		String sql = "select * from libros";

		ResultSet resultados = st.executeQuery(sql);

		// Vamos recorriendo el ResultSet y mostrando los datos de
		// cada fila de la tabla Libros.
		System.out.println("Libros en la tienda");
		System.out.println("=================================\n");

		while (resultados.next()) {

			System.out.println("Título: " + resultados.getString("titulo"));
			System.out.println("Autor: " + resultados.getString("autor"));
			System.out.println("Precio: " + resultados.getString("precio"));

		}

	}
}
