/**
 * 
 */

/**
 * @author Ramon
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Medio me1= new Medio(); // Si la clase es abstracta
		// no se puede crear un objeto de esa clase.
		MP3 mp1 = new MP3();
		Ogg o1 = new Ogg();
		Medio m1 = new MP3();
		m1.reproducir();
		// Convertir
		// Cast
		MP3 m2 = (MP3) m1;
		m2.guardar();
	}

}
