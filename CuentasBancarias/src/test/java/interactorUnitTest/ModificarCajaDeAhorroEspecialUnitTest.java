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
		elRepositorio.existeCuenta = false;

		String numeroModificar = "15428541";
		Cliente nuevoCliente = Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B° Las Torres");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796",
				nuevoCliente,1);

		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecialUseCase = new ModificarCuentaCajaDeAhorroEspecial(
				elRepositorio);
		resultado = modificarCajaDeAhorroEspecialUseCase.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial, numeroModificar);

		assertTrue(resultado);
	}

	@Test
	public void modificarCuentaCajaDeAhorroEspecial_numeroCuentaExiste_CuentaNoModificada() {
		boolean resultado;
		RepositorioCuentaCajaDeAhorroEspecial elRepositorio = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorio.existeCuenta = true;

		String numeroModificar = "15428541";
		Cliente nuevoCliente = Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B° Las Torres");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796",
				nuevoCliente,1);

		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecialUseCase = new ModificarCuentaCajaDeAhorroEspecial(
				elRepositorio);
		resultado = modificarCajaDeAhorroEspecialUseCase.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial, numeroModificar);

		assertFalse(resultado);
	}

}
