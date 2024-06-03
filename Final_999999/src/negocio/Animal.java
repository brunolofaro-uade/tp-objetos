package negocio;

import view.AnimalView;

public class Animal {

	private static float[] metrosCuadradosNecesarios = {1f, 1.2f, 0.9f, 1.15f};
	private int codigo;
	private String raza;
	private float precio;
	
	public Animal(int codigo, String raza, float precio) {
		this.codigo = codigo;
		this.raza = raza;
		this.precio = precio;
	}

	public float getSuperficieNecesaria(Pastura pastura) {
		return metrosCuadradosNecesarios[pastura.getCodigo()];
	}

	public int getCodigo() {
		return codigo;
	}

	public String getRaza() {
		return raza;
	}

	public float getPrecio(){
		return precio;
	}
	
	public boolean tieneCodigo(int codigoAnimal) {
		return this.codigo == codigoAnimal;
	}
	
	public AnimalView toView(){
		return new AnimalView(codigo, raza);
	}
}
