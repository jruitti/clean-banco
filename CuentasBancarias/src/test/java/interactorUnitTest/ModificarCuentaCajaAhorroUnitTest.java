package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.ModificarCuentaCajaAhorroUseCase;
import interactor.ModificarCuentaCorriente;
import interactorUnitTest.ModificarCuentaCorrienteUnitTest.RepositorioCuentaCorriente;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import modelo.CuentaCorriente;
import repositorio.ICuentaCajaAhorroRepositorio;

class ModificarCuentaCajaAhorroUnitTest {

	@Test
	void ModificarCuentaCajaAhorro_NumeroCuentaNoExiste_CuentaModificada() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro();
		elRepositorio.existeNumeroCuenta = false;
		elRepositorio.resultado = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaAhorro cuentaCajaAhorro = CuentaCajaAhorro.instancia("1000", elCliente,1);

		ModificarCuentaCajaAhorroUseCase modificarCuentaCorriente = new ModificarCuentaCajaAhorroUseCase(elRepositorio);

		boolean resultado = modificarCuentaCorriente.ModificarCuentaCajaAhorro(cuentaCajaAhorro);
		assertTrue(resultado);
	}

	@Test
	void ModificarCuentaCajaAhorro_NumeroCuentaExiste_CuentaNoModificada() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro();
		elRepositorio.existeNumeroCuenta = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaAhorro cuentaCajaAhorro = CuentaCajaAhorro.instancia("1000", elCliente,1);

		ModificarCuentaCajaAhorroUseCase modificarCuentaCorriente = new ModificarCuentaCajaAhorroUseCase(elRepositorio);

		boolean resultado = modificarCuentaCorriente.ModificarCuentaCajaAhorro(cuentaCajaAhorro);
		assertFalse(resultado);
	}

	class RepositorioCuentaCajaDeAhorro implements ICuentaCajaAhorroRepositorio {

		public boolean resultado;
		public boolean extraccion;
		public boolean existeCuenta;
		public boolean existeNumeroCuenta;

		@Override
		public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
			return true;
		}

		@Override
		public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
			return resultado;
		}

		@Override
		public boolean ExtraerDineroCajaAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
			return extraccion;
		}

		@Override
		public boolean guardarCambiosCuenta(CuentaCajaAhorro laCuenta) {
			return true;
		}

		@Override
		public boolean existeCuentaCajaDeAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
			return existeCuenta;
		}

		@Override
		public boolean existeNumeroCuentaCajaAhorro(String numeroCuenta) {
			return existeNumeroCuenta;
		}

		@Override
		public CuentaCajaAhorro devuelveCuentaPorId(Integer idCuenta) {
			Cliente clienteDb = Cliente.instancia(1, "perez", "pepe", "1234", "San Rafael");
			CuentaCajaAhorro cuentaCajaAhorroDb= CuentaCajaAhorro.instancia("1000", clienteDb, 1);
			return cuentaCajaAhorroDb;
		}
	}
}
