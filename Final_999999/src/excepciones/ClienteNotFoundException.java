package excepciones;

public class ClienteNotFoundException extends Exception {

	private static final long serialVersionUID = -2398374319383175076L;

	public ClienteNotFoundException(String mensaje){
		super(mensaje);
	}
}
