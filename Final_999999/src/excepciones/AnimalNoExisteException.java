package excepciones;

public class AnimalNoExisteException extends Exception {

	private static final long serialVersionUID = -6789178285719441073L;

	public AnimalNoExisteException(String mensaje){
		super(mensaje);
	}
}
