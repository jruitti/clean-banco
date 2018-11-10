package interactorUnitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import interactor.ModificarClienteUseCase;
import interactor.ModificarCuentaCorriente;
import interactorUnitTest.ModificarCuentaCorrienteUnitTest.RepositorioCuentaCorriente;
import modelo.Cliente;
import modelo.CuentaCorriente;
import repositorio.IClienteRepositorio;

public class ModificarClienteUnitTest {

	@Test
	public void modificarClientePorId_IdNoExiste_SeModificaCliente() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeId = true;

		Cliente elCliente = Cliente.instancia(1, "Pez", "Javier", "1234", "San Jose");
		ModificarClienteUseCase modificarCliente = new ModificarClienteUseCase(elRepositorio);

		boolean resultado = modificarCliente.modificarCliente(elCliente);
		assertTrue(resultado);
	}

	@Test
	public void modificarClientePorId_IdExiste_NoSeModificaCliente() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeId = false;

		Cliente elCliente = Cliente.instancia(1, "Pez", "Javier", "1234", "San Jose");
		ModificarClienteUseCase modificarCliente = new ModificarClienteUseCase(elRepositorio);

		boolean resultado = modificarCliente.modificarCliente(elCliente);
		assertFalse(resultado);
	
	}

	class ClienteRepositorio implements IClienteRepositorio {
		public boolean existeId;
		public boolean resultado;

		@Override
		public boolean guardarCliente(Cliente persCliente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeCliente(Cliente persCliente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean modificarCliente(Cliente persCliente) {
			return resultado;
		}

		@Override
		public boolean consultarCliente(Cliente persCliente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeClientePorId(Integer idCliente) {
			return existeId;
		}
	}

}