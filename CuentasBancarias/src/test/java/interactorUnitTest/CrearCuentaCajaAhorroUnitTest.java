package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearClienteUseCase;
import interactor.CrearCuentaCajaAhorroUseCase;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

class CrearCuentaCajaAhorroUnitTest {

	@Test
	void crearCuentaCajaAhorro_CuentaCajaAhorroNoExiste_CuentaCreado() {
		RepositorioCliente elRepositorio = new RepositorioCliente();
		elRepositorio.existeCliente = false;
		ICuentaCajaAhorroRepositorio elRepositorioCuentaCajaAhorro = new RepositorioCuentaCajaDeAhorro();
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaAhorro laCuentaCajaAhorro = CuentaCajaAhorro.instancia("1", elCliente, 1);

		CrearCuentaCajaAhorroUseCase crearCrearCuentaCajaAhorroUseCase = new CrearCuentaCajaAhorroUseCase(
				elRepositorioCuentaCajaAhorro);
		boolean resultado = crearCrearCuentaCajaAhorroUseCase.CrearCuentaCajaAhorro(laCuentaCajaAhorro);
		assertTrue(resultado);

	}

	@Test
	void crearCuentaCajaAhorro_CuentaCajaAhorroExiste_CuentaNoCreado() {
		RepositorioCuentaCajaDeAhorro elRepositorio = new RepositorioCuentaCajaDeAhorro();
		elRepositorio.existeCuenta = true;

		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaAhorro laCuentaCajaAhorro = CuentaCajaAhorro.instancia("1", elCliente, 1);

		CrearCuentaCajaAhorroUseCase crearCrearCuentaCajaAhorroUseCase = new CrearCuentaCajaAhorroUseCase(
				elRepositorio);
		boolean resultado = crearCrearCuentaCajaAhorroUseCase.CrearCuentaCajaAhorro(laCuentaCajaAhorro);
		assertFalse(resultado);
	}

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
	public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro) {
		return false;
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
		return false;
	}

	@Override
	public CuentaCajaAhorro devuelveCuentaPorId(Integer idCuenta) {
		return null;
	}

}