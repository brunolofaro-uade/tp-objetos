package ar.edu.UADE.modelo;

public class Persona {
	
	private String nombre, apellido;
	private static int contador=1;
	private int id;
	
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		id=contador;
		contador++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
