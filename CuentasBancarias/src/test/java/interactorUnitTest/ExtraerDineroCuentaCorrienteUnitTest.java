package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.ExtraerDineroCuentaCorriente;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

class ExtraerDineroCuentaCorrienteUnitTest {

	@Test
	public void extraerDineroCuentaCorriente_CuentaConSaldo_ExtraccionCompleta() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();

		elRepositorio.extraccion = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("1000", elCliente,1);
		laCuentaCorriente.depositar(500);
		ExtraerDineroCuentaCorriente extraerDineroCuentaCorriente = new ExtraerDineroCuentaCorriente(elRepositorio);

		boolean resultado = extraerDineroCuentaCorriente.ExtraerDineroCuentaCorriente(laCuentaCorriente,1500);

		assertEquals(-1000.0,laCuentaCorriente.getSaldo(),2);

	}

	@Test
	public void extraerDineroCuentaCorriente_CuentaSinSaldo_ExtraccionIncompleta() {
		RepositorioCuentaCorriente elRepositorio = new RepositorioCuentaCorriente();

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("1000", elCliente,1);
		laCuentaCorriente.depositar(500);
		ExtraerDineroCuentaCorriente extraerDineroCuentaCorriente = new ExtraerDineroCuentaCorriente(elRepositorio);

		boolean resultado = extraerDineroCuentaCorriente.ExtraerDineroCuentaCorriente(laCuentaCorriente,7600);

		assertEquals(500,laCuentaCorriente.getSaldo(),2);

	}

	class RepositorioCuentaCorriente implements ICuentaCorrienteRepositorio {

		public boolean extraccion;

		@Override
		public boolean guardarCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean modificarCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeCuentaCorriente(CuentaCorriente pCuentaCorriente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeCuentaCorrientePorNumero(String nCuentaCorriente) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean crearCuentaCorriente(CuentaCorriente cuentaCorrienteNuevo) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean extraerDineroCuentaCorriente() {
			// TODO Auto-generated method stub
			return extraccion;
		}

		@Override
		public CuentaCorriente devuelveCuentaPorId(Integer idCuenta) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
