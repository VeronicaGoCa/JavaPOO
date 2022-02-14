package javaExcepciones;

import javax.swing.JFrame;

public class ErrorTiempoEjecucionIOException {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(300,300,300,300);
		
		PanelImagen panel = new PanelImagen();
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
