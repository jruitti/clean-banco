package repositorio;

import java.util.List;

import modelo.Cliente;

public interface IClienteRepositorio {
	public boolean guardarCliente(Cliente persCliente);

	public boolean verificarCliente(Cliente persCliente);

	public boolean modificarCliente(Cliente persCliente);

	public boolean verificarClientePorCuil(String cuilClienteConsultado);
	
	public boolean verificarCliente(String cuilCliente, String apellido, String nombre );

	public boolean verificarClientePorId(Integer idCliente);

	public Cliente devolverClientePorId(Integer idCliente);
	
	public List<Cliente> devolverClientesPorApellido(String apellido);

}
