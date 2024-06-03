package negocio;

import view.PasturaView;

public class Pastura {

	private int codigo;
	private String nombre;
	private float rendimientoCalorico;
	
	public Pastura(int codigo, String nombre, float rendimientoCalorico) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.rendimientoCalorico = rendimientoCalorico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getRendimientoCalorico() {
		return rendimientoCalorico;
	}

	public void setRendimientoCalorico(float rendimientoCalorico) {
		this.rendimientoCalorico = rendimientoCalorico;
	}

	public boolean tieneCodigo(int codigoPastura) {
		return this.codigo == codigoPastura;
	}
	
	public PasturaView toView(){
		return new PasturaView(codigo, nombre);
	}
}
