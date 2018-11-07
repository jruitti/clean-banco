package modeloUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import modelo.Cliente;
import modelo.CuentaCajaAhorro;

class CuentaCajaAhorroUnitTest {

	@Test
	public void intaciarCuentaCajaAhorro_CuentaCompleta_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta);
		assertNotNull(cuentaCajaAhorro);
	}

	@Test
	public void intaciarCuentaCajaAhorro_CuentaNoCompleta_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", null);
		assertNull(cuentaCajaAhorro);
	}

	@Test
	public void intaciarCuentaCajaAhorro_CuentaSinNuemero_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia(null, clienteCuenta);
		assertNull(cuentaCajaAhorro);
	}

	@Test
	public void intaciarCuentaCajaAhorro_CuentaSinDatos_IntanciaCuentaCajaAhorro() {
		CuentaCajaAhorro newCuentaCajaAhorro = CuentaCajaAhorro.instancia(null, null);
		assertNull(newCuentaCajaAhorro);
	}
	
	@Test
	public void intanciaExtracionCajaAhorro_extracionParcialCorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta);
		cuentaCajaAhorro.depositar(2000);
		cuentaCajaAhorro.extraer(1000);
		assertEquals(1000.0,cuentaCajaAhorro.getSaldo(),2);	
	}
	@Test
	public void intanciaExtracionCajaAhorro_extracionTotalCorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta);
		cuentaCajaAhorro.depositar(2000);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(0.0,cuentaCajaAhorro.getSaldo(),2);	
	}
	@Test
	public void intanciaExtracionCajaAhorro_SinSaldoDisponibleCuentaNueva_devuelveCero() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(0.0,cuentaCajaAhorro.getSaldo(),2);	
	}
	@Test
	public void intanciaExtracionCajaAhorro_SaldoInsuficiente_devuelveSaldo() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta);
		cuentaCajaAhorro.depositar(1000);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(1000.0,cuentaCajaAhorro.getSaldo(),2);	
	}
	
	

}
