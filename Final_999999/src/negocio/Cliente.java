package negocio;

import java.util.ArrayList;
import java.util.List;

import view.ClienteView;

public class Cliente {

	private String cuit;
	private String nombre;
	private List<Campo> campos;
	
	public Cliente(String cuit, String nombre) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.campos = new ArrayList<>();
	}

	public String getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Campo> getCampos() {
		return campos;
	}
	
	public void addCampo(int codigo, int area, Pastura pastura, Animal animal){
		Campo campo = new Campo(codigo, area);
		campo.setAnimal(animal);
		campo.setPastura(pastura);
		campos.add(campo);
	}

	public boolean tieneCuit(String cuit) {
		return this.cuit == cuit;
	}

	public int cantidadCabezasAnimal(Animal animal) {
		int cantidadCabezas = 0;
		for(Campo campo : campos)
			if(campo.tieneAnimal(animal))
				cantidadCabezas += campo.cantidadCabezas();
			return cantidadCabezas;
	}
	
	public double precioHaciendaEnPie(){
		double precioHacienda = 0.0;
		for(Campo campo : campos)
			precioHacienda += campo.precioHacienda();
		return precioHacienda;
		
	}
	
	public ClienteView toView(){
		return new ClienteView(cuit, nombre);
	}
}
