package view;

public class AnimalView {
	
	private int codigo;
	private String raza;
	
	public AnimalView(int codigo, String raza) {
		this.codigo = codigo;
		this.raza = raza;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String toString(){
		return this.raza;
	}
}
