package repositorio;

import modelo.Cliente;

public interface IClienteRepositorio {
	public boolean guardarCliente(Cliente persCliente);
	public boolean existeCliente(Cliente persCliente);
	public boolean modificarCliente(Cliente persCliente);
	public boolean consultarCliente(Cliente persCliente);
	public boolean existeClientePorId(Integer idCliente);

}
