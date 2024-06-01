package ar.edu.UADE.controladores;

import ar.edu.UADE.modelo.Grupo;
import ar.edu.UADE.modelo.ModeloVista1;
import ar.edu.UADE.modelo.Persona;
import ar.edu.UADE.vistas.Vista1;

public class Principal {
	
	public static void main(String [] args) {
		Grupo grupo1=new Grupo("Grupo 1");
		Grupo grupo2=new Grupo("Grupo 2");
		
		Persona persona1=new Persona("Gabriel","Batistuta");
		Persona persona2=new Persona("Hernan","Crespo");
		Persona persona3=new Persona("Claudio","Caniggia");
		Persona persona4=new Persona("Diego","Simeone");
		
		grupo1.agregarPersona(persona1);
		grupo1.agregarPersona(persona2);
		grupo2.agregarPersona(persona3);
		grupo2.agregarPersona(persona4);
		
		ModeloVista1 modelo=new ModeloVista1();
		
		modelo.addGrupo(grupo1);
		modelo.addGrupo(grupo2);
		
		/*--------Se instancia un objeto de la vista----------*/
		Vista1 vista1=new Vista1(modelo);
		
		/*--------Se la hace visible----------*/
		vista1.setVisible(true);
		
		/*--------Se le da un tamaño----------*/
		vista1.setSize(600, 600);
		
		/*--------Se le da una posicion----------*/
		vista1.setLocationRelativeTo(null);
		
		
	}

}
