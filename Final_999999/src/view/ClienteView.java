package view;

public class ClienteView {
	
	private String cuit;
	private String nombre;
	
	public ClienteView(String cuit, String nombre) {
		this.cuit = cuit;
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString(){
		return this.cuit + " " + this.nombre;
	}
}
