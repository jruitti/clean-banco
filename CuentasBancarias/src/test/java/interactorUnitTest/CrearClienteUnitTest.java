package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearClienteUseCase;
import modelo.Cliente;
import repositorio.IClienteRepositorio;

class CrearClienteUnitTest {
	@Test
	public void crearCliente_ClienteNoExiste_ClienteCreado() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.resultado = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");

		CrearClienteUseCase crearClienteUseCase = new CrearClienteUseCase(elRepositorio);

		boolean resultado = crearClienteUseCase.crearCliente(elCliente);

		assertTrue(resultado);
	}

	@Test
	public void crearCliente_ClienteExiste_ClienteNoCreado() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeCliente = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");

		CrearClienteUseCase crearClienteUseCase = new CrearClienteUseCase(elRepositorio);

		boolean resultado = crearClienteUseCase.crearCliente(elCliente);
		assertFalse(resultado);
	}

}

class RepositorioCliente implements IClienteRepositorio {

	public boolean resultado;
	public boolean existeCliente;
	public boolean existeId;
	public boolean clientePorCuil;

	@Override
	public boolean guardarCliente(Cliente pCliente) {
		return resultado;
	}

	@Override
	public boolean modificarCliente(Cliente persCliente) {
		return false;
	}

	@Override
	public boolean existeCliente(Cliente persCliente) {
		return existeCliente;
	}

	@Override
	public boolean existeClientePorId(Integer idCliente) {	
		return existeId;
	}

	@Override
	public boolean consultarClientePorCuil(String cuilClienteConsultado) {
		return clientePorCuil;
	}

	@Override
	public boolean verificarCliente(String cuilCliente, String apellido, String nombre) {
		// TODO Auto-generated method stub
		return existeCliente;
	}
}