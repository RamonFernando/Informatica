package EjemplosPDF_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PlayBack extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayBack playBack = new PlayBack();
	}

	public PlayBack() {
		super("Playback");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout();
		setLayout(layout);

		JButton btnPlay = new JButton("Play");
		add(btnPlay);

		JButton btnStop = new JButton("Stop");
		add(btnStop);

		JButton btnPausa = new JButton("Pausa");
		add(btnPausa);

		setVisible(true);
	}
}
