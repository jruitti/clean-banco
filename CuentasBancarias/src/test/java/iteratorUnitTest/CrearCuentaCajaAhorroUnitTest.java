package iteratorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaAhorroUseCase;
import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaDeAhorroRepositorio;

class CrearCuentaCajaAhorroUnitTest {

	@Test
	void crearCuentaCajaAhorro_CuentaCajaAhorroNoExiste_CuentaCreado() {
		ICuentaCajaDeAhorroRepositorio elRepositorioCuentaCajaAhorro = new CrearCuentaCajaAhorroUseCase();
		Cliente elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678-4","San Martin 100");
		CuentaCajaAhorro laCuentaCajaAhorro = CuentaCajaAhorro.instancia(elCliente);
		
		CrearCuentaCajaAhorroUseCase crearCrearCuentaCajaAhorroUseCase = new CrearCuentaCajaAhorroUseCase(elRepositorioCuentaCajaAhorro); 
		
		boolean resultado = crearCrearCuentaCajaAhorroUseCase.crearCuentaCajaAhorro(laCuentaCajaAhorro);
		assertTrue(resultado);

	}

}
