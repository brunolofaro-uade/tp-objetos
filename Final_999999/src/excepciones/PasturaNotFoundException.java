package excepciones;

public class PasturaNotFoundException extends Exception {

	private static final long serialVersionUID = 8595649292048958342L;

	public PasturaNotFoundException(String mensaje){
		super(mensaje);
	}
}
