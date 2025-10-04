package practicas;

public class Hilo implements Runnable {

	@Override
	public void run() {

		String nombreHilo = Thread.currentThread().getName();
		System.out.println("Iniciando el hilo " + nombreHilo);

		for (int i = 0; i <= 50; i++) {
			System.out.println(i + " " + nombreHilo);
		}

	}

}
