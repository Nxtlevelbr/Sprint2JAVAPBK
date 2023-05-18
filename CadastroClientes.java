package classesPBK;

import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
	private List<Cliente> clientes;
	
	public CadastroClientes() {
		clientes = new ArrayList<>();
	}

	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> getClientes(){
		return clientes;
	}
}
