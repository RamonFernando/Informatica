package RepasoExamenT9;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

public class RepasoByteAByte extends JFrame {

	JButton btnEjecutar;
	JTextArea txtSalida;

	public RepasoByteAByte() {
		super("Copia de Bytes");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar BarraHerrammientas = new JToolBar();

		btnEjecutar = new JButton(new ImageIcon("iconos/38.png"));
		btnEjecutar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutar();
				
			}

			
		});

		
		
		txtSalida = new JTextArea(1,1);
		txtSalida.setLineWrap(true);
		txtSalida.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(txtSalida,
				JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(BarraHerrammientas,BorderLayout.NORTH);
		BarraHerrammientas.add(btnEjecutar);
		add(scrollPane,BorderLayout.CENTER);
		
		
		
		setResizable(true);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RepasoByteAByte();

	}
	private void ejecutar() {
		
		txtSalida.append("Creando Stream");
		
		try {
			FileInputStream entrada = new FileInputStream("ficheros/Texto.txt");
			FileOutputStream salida = new FileOutputStream("ficheros/Texto_copia.txt");
			
			boolean eof = false;
			int caracter = 0;
			
			txtSalida.append("\nCopiando Archivo");
			while (!eof) {
				caracter = entrada.read();
				if (eof) {
					
				}
				
				if (caracter == -1) {
					eof = true;
					System.out.print(caracter);
				}else {
					// txtSalida.append("\nArchivo Copiado");
					System.out.println("Archivo Copiado");
					System.out.print(caracter);
					salida.write(caracter);
					
				}
			}
			txtSalida.append("\nFinalizado");
			entrada.close();
			salida.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
