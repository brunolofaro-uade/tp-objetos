package controladores;

import javax.swing.JFrame;

import interfacesGraficas.Interfaz1;
import interfacesGraficas.Interfaz2;
import interfacesGraficas.Interfaz3;
import interfacesGraficas.Interfaz4;
import interfacesGraficas.Interfaz5;

public class Controlador1 {
	
	public static void main(String[] argas) {
		Interfaz1 interfaz1=new Interfaz1();
		interfaz1.setVisible(true);
		interfaz1.setSize(300,300);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz1.setLocation(0, 0);
		
		Interfaz2 interfaz2=new Interfaz2();
		interfaz2.setVisible(true);
		interfaz2.setSize(300,300);
		interfaz2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz2.setLocation(300, 0);
		
		Interfaz3 interfaz3=new Interfaz3();
		interfaz3.setVisible(true);
		interfaz3.setSize(300,300);
		interfaz3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz3.setLocation(600, 0);
		
		
		Interfaz4 interfaz4=new Interfaz4();
		interfaz4.setVisible(true);
		interfaz4.setSize(300,300);
		interfaz4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz4.setLocation(0, 300);
		
		Interfaz5 interfaz5=new Interfaz5();
		interfaz5.setVisible(true);
		interfaz5.setSize(300,300);
		interfaz5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz5.setLocation(600, 300);
		
		
	}

}
