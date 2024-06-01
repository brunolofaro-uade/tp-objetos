package controladores;

import javax.swing.JFrame;

import vistas.Interfaz1;

public class Principal {
	
	public static void main(String[] args) {
		Interfaz1 interfaz1=new Interfaz1();
		interfaz1.setVisible(true);
		interfaz1.setSize(400,250);
		interfaz1.setLocationRelativeTo(null);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
