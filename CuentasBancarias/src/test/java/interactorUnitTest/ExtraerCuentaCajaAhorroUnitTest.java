package interactorUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaAhorroUseCase;
import interactor.ExtraerDineroCajaDeAhorroUseCase;
import interactor.DepositarDineroCajaAhorroUseCase;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;


class ExtraerCuentaCajaAhorroUnitTest {

	@Test
	public void ExtraerDineroCajaAhorro_extraccionExitosa() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro(); 
		elRepositorio.resultado = false;
		elRepositorio.extraccion = true;
		
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaAhorro laCuenta = CuentaCajaAhorro.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroUseCase extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroUseCase(elRepositorio);
		DepositarDineroCajaAhorroUseCase depositarDineroCajaAhorro = new DepositarDineroCajaAhorroUseCase(elRepositorio);
		depositarDineroCajaAhorro.DepositarDineroCuentaCajaAhorro(laCuenta, 1000);
		extraerDineroCajaAhorro.ExtraerDineroCuentaCajaDeAhorro(laCuenta, 500);
		
		
		assertEquals(500.0, laCuenta.getSaldo(), 2);
		
	}
	
	@Test
	public void ExtraerDineroCajaAhorro_extraccionTotalExitosa() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro(); 
		elRepositorio.resultado = false;
		elRepositorio.extraccion = true;
		
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaAhorro laCuenta = CuentaCajaAhorro.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroUseCase extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroUseCase(elRepositorio);
		DepositarDineroCajaAhorroUseCase depositarDineroCajaAhorro = new DepositarDineroCajaAhorroUseCase(elRepositorio);
		depositarDineroCajaAhorro.DepositarDineroCuentaCajaAhorro(laCuenta, 1000);
		extraerDineroCajaAhorro.ExtraerDineroCuentaCajaDeAhorro(laCuenta, 1000);
		
		
		assertEquals(0.0, laCuenta.getSaldo(), 2);
		
	}
	
	@Test
	public void ExtraerDineroCajaAhorro_extraccionFallida_montoInsuficiente() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro(); 
		elRepositorio.resultado = false;
		elRepositorio.extraccion = true;
		
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaAhorro laCuenta = CuentaCajaAhorro.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroUseCase extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroUseCase(elRepositorio);
		DepositarDineroCajaAhorroUseCase depositarDineroCajaAhorro = new DepositarDineroCajaAhorroUseCase(elRepositorio);
		depositarDineroCajaAhorro.DepositarDineroCuentaCajaAhorro(laCuenta, 500);
		extraerDineroCajaAhorro.ExtraerDineroCuentaCajaDeAhorro(laCuenta, 1000);
		
		
		assertEquals(500.0, laCuenta.getSaldo(), 2);
		
	}
	
	class RepositorioCuentaCajaDeAhorro implements ICuentaCajaAhorroRepositorio{

		public boolean resultado;
		public boolean extraccion;
		
		@Override
		public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean ExtraerDineroCajaAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
			// TODO Auto-generated method stub
			return extraccion;
		}

		@Override
		public boolean guardarCambiosCuenta(CuentaCajaAhorro laCuenta) {
			// TODO Auto-generated method stub
			return true;
		}
	}

}
