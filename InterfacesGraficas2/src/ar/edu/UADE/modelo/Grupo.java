package ar.edu.UADE.modelo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String nombre;
	private List<Persona> integrantes=new ArrayList<Persona>();
	
	public Grupo(String nombre) {
		this.nombre=nombre;
	}
	
	public void agregarPersona(Persona persona) {
		this.integrantes.add(persona);
	}
	
	public Persona getPersona(int indice) {
		return this.integrantes.get(indice);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	
	

}
