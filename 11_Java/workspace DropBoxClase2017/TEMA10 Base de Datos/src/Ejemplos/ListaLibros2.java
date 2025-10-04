package Ejemplos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ListaLibros2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntamos el nombre del autor que queremos consultar.
		System.out.print("Autor? ");
		String autor = entrada.nextLine();

		// Mostramos los libros escritos por ese autor.
		listar(autor);

	}

	private static void listar(String autor) {

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
			String sql = "select * from libros where autor='" + autor + "'";

			// Enviamos la consulta y guardamos los resultados en un
			// objeto ResultSet.
			ResultSet resultados = stmt.executeQuery(sql);

			// Vamos recorriendo el ResultSet y mostrando los datos de
			// cada fila de la tabla Libros.
			System.out.println("Libros en la tienda");
			System.out.println("=================================\n");

			while (resultados.next()) {
				System.out.println("Título: " + resultados.getString("titulo"));
				System.out.println("Autor: " + resultados.getString("autor"));
				System.out.println("Precio: " + resultados.getString("precio")
						+ " €\n");
			}

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
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
