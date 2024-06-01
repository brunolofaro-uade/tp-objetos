package ar.edu.UADE.modelo;

import java.util.Hashtable;
import java.util.Set;

public class ModeloVista1 {
	
	private Hashtable<String, Grupo> grupos=new Hashtable<String,Grupo>();
	
	public void addGrupo(Grupo grupo) {
		this.grupos.put(grupo.getNombre(), grupo);
	}
	
	public Grupo getGrupo(String nombre) {
		return this.grupos.get(nombre);
	}
	
	public Set<String> getClavesGrupo() {
		return grupos.keySet();
	}

}
