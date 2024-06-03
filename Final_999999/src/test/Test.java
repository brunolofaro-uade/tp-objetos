package test;

import controlador.Sistema;
import excepciones.AnimalNoExisteException;
import excepciones.ClienteNotFoundException;
import excepciones.PasturaNotFoundException;
import gui.InterfazPrincipal;
import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		InterfazPrincipal gui = new InterfazPrincipal();
		gui.setVisible(true);
		gui.setSize(400,250);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated method stub
		Sistema s = Sistema.getInstance();
		try {
			s.agregarCampo("Cuit:12-3456789-1", 1, 2480, 2, 2);
			s.agregarCampo("Cuit:62-3456789-6", 2, 2550, 3, 8);
			s.agregarCampo("Cuit:22-3456789-2", 1, 2480, 1, 4);
			s.agregarCampo("Cuit:62-3456789-6", 2, 3550, 3, 8);
			s.agregarCampo("Cuit:12-3456789-1", 1, 2480, 1, 5);
			s.agregarCampo("Cuit:62-3456789-6", 2, 3550, 3, 8);
			s.agregarCampo("Cuit:52-3456789-5", 1, 2480, 2, 7);
			s.agregarCampo("Cuit:72-3456789-7", 2, 1550, 1, 9);
			//System.out.println("Campos agregados a los clientes");
			//System.out.println("Cantidad de Cabezas cliente Cuit:12-3456789-1 " + s.obtenerCabezasPorCliente("Cuit:12-3456789-1", 5));
			//System.out.println("Valor de Hacienda del cliente Cuit:62-3456789-6 " + s.obtenerValorHaciendaPorCliente("Cuit:62-3456789-6"));
			
		} catch (ClienteNotFoundException e) {
			e.printStackTrace();
		} catch (PasturaNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AnimalNoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
