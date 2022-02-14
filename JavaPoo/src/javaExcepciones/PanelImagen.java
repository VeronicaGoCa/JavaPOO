package javaExcepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{

	private Image imagen;
	
	public PanelImagen() {
	
		try {
			imagen = ImageIO.read(new File("src/javaExcepciones/rosa.jpg"));
		} catch (IOException e) {
			System.out.println("El archivo no se encuentro");
		}
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagen,  0,  0,  null);
	
   }
}
