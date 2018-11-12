package repositorio;

import modelo.Cliente;

public interface IClienteRepositorio {
	public boolean guardarCliente(Cliente persCliente);
	public boolean existeCliente(Cliente persCliente);
	public boolean modificarCliente(Cliente persCliente);
	public boolean consultarClientePorCuil(String cuilClienteConsultado);
	public boolean existeClientePorId(Integer idCliente);

}
