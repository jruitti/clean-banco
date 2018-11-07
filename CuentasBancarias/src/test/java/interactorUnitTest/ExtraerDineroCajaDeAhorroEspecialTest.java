package interactorUnitTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import interactor.ExtraerDineroCajaDeAhorroEspecial;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;

import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;
public class ExtraerDineroCajaDeAhorroEspecialTest {
	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_NoExtrajoEnElMes_PermiteExtraer() {
		RepositorioCuentaCajaAhorroEspecial elRepositorio = new RepositorioCuentaCajaAhorroEspecial(); 
		elRepositorio.resultado = false;
		elRepositorio.extraccion = true;
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaDeAhorroEspecial laCuenta = CuentaCajaDeAhorroEspecial.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(elRepositorio);
		
		assertTrue(extraerDineroCajaAhorro.ExtraerDineroCuentaCorriente(laCuenta, 1000));
		
	}
	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_NoExtrajoEnElMes_NoPermiteExtraerMontoInsuficiente() {
		RepositorioCuentaCajaAhorroEspecial elRepositorio = new RepositorioCuentaCajaAhorroEspecial(); 
		elRepositorio.resultado = false;
		elRepositorio.extraccion = false;
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaDeAhorroEspecial laCuenta = CuentaCajaDeAhorroEspecial.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(elRepositorio);
		
		assertFalse(extraerDineroCajaAhorro.ExtraerDineroCuentaCorriente(laCuenta, 1000));
		
	}
	
	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_NoExtrajoEnElMes_NoPermiteExtraerYaSacoEnElMes() {
		RepositorioCuentaCajaAhorroEspecial elRepositorio = new RepositorioCuentaCajaAhorroEspecial(); 
		elRepositorio.resultado = true;
		
		Cliente elCliente = Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaDeAhorroEspecial laCuenta = CuentaCajaDeAhorroEspecial.instancia("1000", elCliente);
		
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(elRepositorio);
		
		assertFalse(extraerDineroCajaAhorro.ExtraerDineroCuentaCorriente(laCuenta, 1000));
		
	}
	
	@Test
	public void ExtraerDineroCajaDeAhorroEspecial_ExtrajoEnElMes_NoPermiteExtraer() {
		
	}
	
	class RepositorioCuentaCajaAhorroEspecial implements ICuentaCajaDeAhorroEspecialRepositorio{
		public boolean resultado;
		public boolean extraccion;
		@Override
		public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean consultarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
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
		public boolean consultarExtraccionMesEnCurso(CuentaCajaDeAhorroEspecial laCuenta) {
			return resultado;
		}
		@Override
		public boolean ExtraerDineroCajaAhorroEspecial(float dinero) {
			// TODO Auto-generated method stub
			return extraccion;
		}

		
		
	}
}
