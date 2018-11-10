package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaAhorroUseCase;
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
		
		ExtraerDineroCajaDeAhorroEspecial extraerDineroCajaAhorro = new ExtraerDineroCajaDeAhorroEspecial(elRepositorio);
		
		assertTrue(extraerDineroCajaAhorro.ExtraerDineroCuentaCorriente(laCuenta, 1000));
		
	}

}
