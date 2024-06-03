package view;

import java.util.List;
import negocio.Cliente;
import view.ClienteView;

public class ClienteViewModel {
	public List<ClienteView> clientes;
	
	public ClienteViewModel(List<ClienteView> _clientes) {
		clientes = _clientes;
	}
	
	public List<ClienteView> GetClientes() {
		return clientes;
	}
}
