package negocio;

public class Campo {

	private int codigo;
	private int area;
	private Pastura pastura;
	private Animal animal;
	
	public Campo(int codigo, int area) {
		this.codigo = codigo;
		this.area = area;
	}

	public int cantidadCabezas(){
		return (int)(this.area / animal.getSuperficieNecesaria(pastura)); 
	}
	
	public Pastura getPastura() {
		return pastura;
	}

	public void setPastura(Pastura pastura) {
		this.pastura = pastura;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getArea() {
		return area;
	}

	public boolean tieneAnimal(Animal animal) {
		return this.animal.tieneCodigo(animal.getCodigo());
	}

	public double precioHacienda() {
		return ((int)(this.area / animal.getSuperficieNecesaria(pastura))) * animal.getPrecio(); 

	}
}
