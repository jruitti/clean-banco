package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCorrienteUseCase;
import modelo.Cliente;
import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

class CrearCuentaCorrienteUnitTest {

	@Test
	public void crearCuentaCorriente_CuentaCorrienteNoExiste_CuentaCreada() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();
		elRepositorio.existeCuenta = false;
		elRepositorio.resultado = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente);

		CrearCuentaCorrienteUseCase crearCuentaCorriente = new CrearCuentaCorrienteUseCase(elRepositorio);

		boolean resultado = crearCuentaCorriente.CrearCuentaCorriente(laCuentaCorriente);
		assertTrue(resultado);

	}

	@Test
	public void crearCuentaCorriente_CuentaCorrienteYaExiste_CuentaNoCreada() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();
		elRepositorio.existeCuenta = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente);

		CrearCuentaCorrienteUseCase crearCuentaCorriente = new CrearCuentaCorrienteUseCase(elRepositorio);

		boolean resultado = crearCuentaCorriente.CrearCuentaCorriente(laCuentaCorriente);
		assertFalse(resultado);

	}

	class RepositorioCuentaCorriente implements ICuentaCorrienteRepositorio {

		public boolean resultado;
		public boolean existeCuenta;

		@Override
		public boolean crearCuentaCorriente(CuentaCorriente cuentaCorrienteNuevo) {
			return resultado;
		}

		@Override
		public boolean guardarCuentaCorriente(CuentaCorriente pCuentaCorriente) {

			return false;
		}

		@Override
		public boolean modificarCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			return false;
		}

		@Override
		public boolean existeCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			return existeCuenta;
		}

		@Override
		public boolean existeCuentaCorrientePorNumero(String nCuentaCorriente) {
			return false;
		}

		@Override
		public boolean extraerDineroCuentaCorriente() {
			return false;
		}

	}

}
