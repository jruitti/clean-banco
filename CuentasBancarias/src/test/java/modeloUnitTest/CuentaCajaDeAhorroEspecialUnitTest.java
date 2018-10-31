package modeloUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
class CuentaCajaDeAhorroEspecialUnitTest {


	@Test
	public void intaciarCuentaCajaDeAhorroEspecial_CuentaCompleta_IntanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", clienteCuenta);
		assertNotNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void intaciarCuentaCajaDeAhorroEspecial_CuentaNoCompleta_IntanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", null);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void intaciarCuentaCajaAhorro_CuentaSinNuemero_IntanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia(null, clienteCuenta);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void intaciarCuentaCajaDeAhorroEspecial_CuentaSinDatos_IntanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia(null, null);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	public void ExtraerCajaDeAhorroEspecialUnaSolaVezAlMes() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", clienteCuenta);
		cuentaCajaDeAhorroEspecial.depositar(1000);
		cuentaCajaDeAhorroEspecial.extraer(500);
		cuentaCajaDeAhorroEspecial.extraer(500);
		assertEquals(500.0,cuentaCajaDeAhorroEspecial.getSaldo(),2);
		
	}
}
