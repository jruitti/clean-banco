package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaDeAhorroEspecialUseCase;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;

class CrearCuentaCajaDeAhorroEspecialUnitTest {

	@Test
	void crearCuentaCajaDeAhorroEspecial_CuentaCajaDeAhorroEspecialNoExiste_CuentaCreado() {
		RepositorioCuentaCajaDeAhorroEspecial elRepositorioCuentaDeCajaAhorroEspecial = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorioCuentaDeCajaAhorroEspecial.existeCuenta = false;
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaDeAhorroEspecial laCuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("1", elCliente);
		CrearCuentaCajaDeAhorroEspecialUseCase crearCrearCuentaCajaDeAhorroEspecialUseCase = new CrearCuentaCajaDeAhorroEspecialUseCase(
				elRepositorioCuentaDeCajaAhorroEspecial);

		boolean resultado = crearCrearCuentaCajaDeAhorroEspecialUseCase
				.CrearCuentaCajaDeAhorroEspecial(laCuentaCajaDeAhorroEspecial);
		assertTrue(resultado);

	}

	@Test
	void crearCuentaCajaDeAhorroEspecial_CuentaCajaDeAhorroEspecialExiste_CuentaNoCreado() {
		RepositorioCuentaCajaDeAhorroEspecial elRepositorioCuentaDeCajaAhorroEspecial = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorioCuentaDeCajaAhorroEspecial.existeCuenta = true;
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaDeAhorroEspecial laCuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("1", elCliente);
		CrearCuentaCajaDeAhorroEspecialUseCase crearCrearCuentaCajaDeAhorroEspecialUseCase = new CrearCuentaCajaDeAhorroEspecialUseCase(
				elRepositorioCuentaDeCajaAhorroEspecial);

		boolean resultado = crearCrearCuentaCajaDeAhorroEspecialUseCase
				.CrearCuentaCajaDeAhorroEspecial(laCuentaCajaDeAhorroEspecial);
		assertFalse(resultado);

	}

}

class RepositorioCuentaCajaDeAhorroEspecial implements ICuentaCajaDeAhorroEspecialRepositorio {

	public boolean resultado;
	public boolean existeCuenta;

	@Override
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean existeCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return existeCuenta;
	}

	@Override
	public boolean ExtraerDineroCajaAhorroEspecial(float dinero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean consultarCuentaCajaDeAhorro(CuentaCajaDeAhorroEspecial laCuenta) {
		// TODO Auto-generated method stub
		return false;
	}
}
