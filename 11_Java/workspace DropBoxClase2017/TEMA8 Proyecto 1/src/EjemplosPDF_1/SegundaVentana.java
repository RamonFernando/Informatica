package EjemplosPDF_1;
import javax.swing.JFrame;

public class SegundaVentana extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SegundaVentana ventana = new SegundaVentana();
	}
	public SegundaVentana(){
		super("Segunda Ventana");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setVisible(true);
	}
}
