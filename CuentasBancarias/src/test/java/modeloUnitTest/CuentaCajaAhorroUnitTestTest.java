package modeloUnitTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import modelo.Cliente;
import modelo.CuentaCajaAhorro;

class CuentaCajaAhorroUnitTestTest {

	@Test
	public void intaciarCuentaCajaAhorro_CuentaCompleta_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;

		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");

		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta, 1000);
		assertNotNull(cuentaCajaAhorro);
	}

	@Test
	public void intaciarCuentaCajaAhorro_CuentaNoCompleta_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", null, 1000);
		assertNull(cuentaCajaAhorro);
	}
	
	@Test
	public void intaciarCuentaCajaAhorro_CuentaSaldoNegativo_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta, -1000);
		assertNull(cuentaCajaAhorro);
	}
	
	@Test
	public void intaciarCuentaCajaAhorro_CuentaSinNuemero_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia(null, clienteCuenta, -1000);
		assertNull(cuentaCajaAhorro);
	}
	

}
