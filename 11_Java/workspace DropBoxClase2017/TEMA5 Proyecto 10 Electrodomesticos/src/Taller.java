import java.util.Arrays;

public class Taller {

	public Taller() {
		// TODO Auto-generated constructor stub
	}

	private int MAX_LAVADORAS = 20;
	private Lavadoras[] lavadora = new Lavadoras[MAX_LAVADORAS];
	
	public void listaLavadoras() {
		for (int i = 0; i < lavadora.length; i++) {
			if (lavadora[i] != null) {
				System.out.println(lavadora[i].toString());
			}
		}

	}
	public void addLavadoras(Lavadoras lav) {
		for (int i = 0; i < lavadora.length; i++) {
			if (lavadora[i] != null && lavadora[i].getId() == lav.getId()) {
				System.out
						.println("Número del producto (id) Lavadora se encuentra repetido.");
				return;
			}

		}
		for (int i = 0; i < lavadora.length; i++) {
			if (lavadora[i] == null) {
				lavadora[i] = lav;

				System.out.println("Agregando articulo " + lavadora[i]);
				break;
			}
		}
	}
	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadora.length; i++) {
			if (lavadora[i] != null && lavadora[i].getId() == id) {
				System.out.println("Su articulo es: " + lavadora[i]);
				return i;

			}

		}
		return -1;
	}
	public void borrarLavadora(int id) {
		for (int i = 0; i < lavadora.length; i++) {
			int pos = buscaLavadora(id);
			if (pos != -1) {
				lavadora[pos] = null;
				System.out.println("Borrado ariculo " + id);
			}
		}
	}

	public int getMAX_LAVADORAS() {
		return MAX_LAVADORAS;
	}

	public void setMAX_LAVADORAS(int mAX_LAVADORAS) {
		MAX_LAVADORAS = mAX_LAVADORAS;
	}

	public Lavadoras[] getLavadora() {
		return lavadora;
	}

	public void setLavadora(Lavadoras[] lavadora) {
		this.lavadora = lavadora;
	}

}
