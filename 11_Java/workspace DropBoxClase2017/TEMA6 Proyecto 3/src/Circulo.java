
public class Circulo extends FiguraGeometrica implements Figura2D, Dibujable {

	private int x, y;
	private int radio;
	private String color;

	public Circulo(int x, int y, int radio, String color) {

		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

	@Override
	public double area() {

		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {

		return 2 * Math.PI * radio;
	}

	@Override
	public void Dibujar() {
		System.out.println("Dibujando un circulo.");

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

}
