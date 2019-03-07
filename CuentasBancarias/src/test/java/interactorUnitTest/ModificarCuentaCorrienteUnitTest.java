package interactorUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import interactor.ModificarCuentaCorriente;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

class ModificarCuentaCorrienteUnitTest {

	@Test
	public void modificarCuentaCorriente_numeroCuentaNoExiste_CuentaModificada() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();
		elRepositorio.existeNumero = false;
		elRepositorio.resultado = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("1000", elCliente,1);

		ModificarCuentaCorriente modificarCuentaCorriente = new ModificarCuentaCorriente(elRepositorio);

		boolean resultado = modificarCuentaCorriente.ModificarCuentaCorriente(laCuentaCorriente);
		assertTrue(resultado);

	}

	@Test
	public void modificarCuentaCorriente_numeroCuentaExiste_CuentaNoModificada() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();
		elRepositorio.existeNumero = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("1000", elCliente,1);

		ModificarCuentaCorriente modificarCuentaCorriente = new ModificarCuentaCorriente(elRepositorio);

		boolean resultado = modificarCuentaCorriente.ModificarCuentaCorriente(laCuentaCorriente);
		assertFalse(resultado);

	}

	class RepositorioCuentaCorriente implements ICuentaCorrienteRepositorio {
		public boolean existeNumero;
		public boolean resultado;

		@Override
		public boolean guardarCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			return false;
		}

		@Override
		public boolean modificarCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			return resultado;
		}

		@Override
		public boolean existeCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			return false;
		}

		@Override
		public boolean crearCuentaCorriente(CuentaCorriente cuentaCorrienteNuevo) {
			return false;
		}

		@Override
		public boolean existeCuentaCorrientePorNumero(String nCuentaCorriente) {
			return existeNumero;
		}

		@Override
		public boolean extraerDineroCuentaCorriente() {
			return false;
		}

		@Override
		public CuentaCorriente devuelveCuentaPorId(Integer idCuenta) {
			Cliente clienteDb = Cliente.instancia(1, "perez", "pepe", "1234", "San Rafael");
			CuentaCorriente cuentaCorrienteDb= CuentaCorriente.instancia("1000", clienteDb, 1);
			return cuentaCorrienteDb;
		}

	}
}
