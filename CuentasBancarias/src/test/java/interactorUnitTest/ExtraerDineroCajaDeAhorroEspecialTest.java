package interactorUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Test;

import interactor.ExtraerDineroCajaDeAhorroEspecial;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;

import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;

public class ExtraerDineroCajaDeAhorroEspecialTest {
	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_NoExtrajoEnElMes_PermiteExtraer() {
		RepositorioCuentaCajaAhorroEspecial elRepositorio = new RepositorioCuentaCajaAhorroEspecial();
		elRepositorio.resultado = true;
		LocalDate ultimaExtraccion = LocalDate.of(2018, 10, 12);
		LocalDate fechaActual = LocalDate.of(2018, 11, 10);
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaDeAhorroEspecial laCuenta = CuentaCajaDeAhorroEspecial.instancia("1000", elCliente,1);
		laCuenta.actualizarFechaUltima(ultimaExtraccion);
		laCuenta.depositar(1000);
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(
				elRepositorio);

		assertTrue(extraerDineroCajaAhorro.ExtraerDineroCuentaCajaDeAhorroEspecial(laCuenta, 500, fechaActual));
		assertEquals(500.0, laCuenta.getSaldo(), 2);
		assertEquals(fechaActual, laCuenta.getUltimoExtraccion());

	}

	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_NoExtrajoEnElMes_NoPermiteExtraerMontoInsuficiente() {
		RepositorioCuentaCajaAhorroEspecial elRepositorio = new RepositorioCuentaCajaAhorroEspecial();
		elRepositorio.resultado = true;
		LocalDate ultimaExtraccion = LocalDate.of(2018, 10, 12);
		LocalDate fechaActual = LocalDate.of(2018, 10, 14);
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		
		CuentaCajaDeAhorroEspecial laCuenta = CuentaCajaDeAhorroEspecial.instancia("1000", elCliente,1);
		laCuenta.actualizarFechaUltima(ultimaExtraccion);
		laCuenta.depositar(1000);
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(
				elRepositorio);

		assertFalse(extraerDineroCajaAhorro.ExtraerDineroCuentaCajaDeAhorroEspecial(laCuenta, 1000, fechaActual));
		assertEquals(1000.0, laCuenta.getSaldo(), 2);
		assertEquals(ultimaExtraccion, laCuenta.getUltimoExtraccion());
	}





	class RepositorioCuentaCajaAhorroEspecial implements ICuentaCajaDeAhorroEspecialRepositorio {
		public boolean resultado;
		
		@Override
		public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta) {
			// TODO Auto-generated method stub
			return false;
		}

		
		

		

		@Override
		public boolean actualizarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial laCuenta) {
			
			return resultado;
		}

		@Override
		public CuentaCajaDeAhorroEspecial devuelveCuentaPorId(Integer idCuenta) {
			// TODO Auto-generated method stub
			return null;
		}

		

		@Override
		public boolean existeNumeroCuentaCajaDeAhorroEspecial(String numeroCuenta) {
			// TODO Auto-generated method stub
			return false;
		}

	}
}
