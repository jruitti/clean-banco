package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaAhorroUseCase;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

class CrearCuentaCajaAhorroUnitTest {

	@Test
	void crearCuentaCajaAhorro_CuentaCajaAhorroNoExiste_CuentaCreado() {
		ICuentaCajaAhorroRepositorio elRepositorioCuentaCajaAhorro = new RepositorioCuentaCajaDeAhorro();
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaAhorro laCuentaCajaAhorro = CuentaCajaAhorro.instancia("1", elCliente);
		CrearCuentaCajaAhorroUseCase crearCrearCuentaCajaAhorroUseCase = new CrearCuentaCajaAhorroUseCase(elRepositorioCuentaCajaAhorro); 
		boolean resultado = crearCrearCuentaCajaAhorroUseCase.CrearCuentaCajaAhorro(laCuentaCajaAhorro);
		assertTrue(resultado);

	}

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