package interactorUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import interactor.ModificarCuentaCajaDeAhorroEspecial;

public class ModificarCajaDeAhorroEspecialUnitTest {
	
	@Test
	public void modificarCuentaCajaDeAhorroEspecial_numeroCuentaNoExiste_CuentaModificada() {
		boolean resultado;
		RepositorioCuentaCajaDeAhorroEspecial elRepositorio = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorio.existeCuenta=false;
		
		Cliente nuevoCliente= Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B° Las Torres");
		Cliente clienteModificar = Cliente.instancia(5, "Casiva", "Laura", "27-355541350-6", "Paiman Sur");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796", nuevoCliente);
		
		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecialUseCase = new ModificarCuentaCajaDeAhorroEspecial(elRepositorio);
		resultado = modificarCajaDeAhorroEspecialUseCase.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial,clienteModificar);
		
		assertTrue(resultado);
	}
	
	@Test
	public void modificarCuentaCajaDeAhorroEspecial_numeroCuentaExiste_CuentaNoModificada() {
		boolean resultado;
		RepositorioCuentaCajaDeAhorroEspecial elRepositorio = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorio.existeCuenta=true;
		
		Cliente nuevoCliente= Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B° Las Torres");
		Cliente clienteModificar = Cliente.instancia(5, "Casiva", "Laura", "27-355541350-6", "Paiman Sur");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796", nuevoCliente);
		
		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecialUseCase = new ModificarCuentaCajaDeAhorroEspecial(elRepositorio);
		resultado = modificarCajaDeAhorroEspecialUseCase.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial,clienteModificar);
		
		assertFalse(resultado);
	}

}
