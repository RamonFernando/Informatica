
public class Rectangulo extends FiguraGeometrica implements Figura2D, Dibujable {

	private int base;
	private int altura;
	private String color;

	public Rectangulo() {

	}

	public Rectangulo(int base, int altura, String color) {
		super();
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	@Override
	public double area() {

		return base * altura;
	}

	@Override
	public double perimetro() {

		return 2 * base + 2 * altura;
	}

	@Override
	public void Borrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Mover() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Colorear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Dibujar() {
		System.out.println("Dibujando un rectangulo.");
	}

}
