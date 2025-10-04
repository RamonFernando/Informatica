package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private static final double PI = 3.141592;

	public Cilindro() {
		// TODO Auto-generated constructor stub
	}

	public Cilindro(int altura, int radio) {
		super();
		this.altura = altura;
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getArea() {
		return 2 * PI * radio * (altura + radio);
	}

	public double getVolumen() {
		double volumen = PI * radio * radio * altura;

		return volumen;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", radio=" + radio + ", PI=" + PI
				+ "]";
	}

}
