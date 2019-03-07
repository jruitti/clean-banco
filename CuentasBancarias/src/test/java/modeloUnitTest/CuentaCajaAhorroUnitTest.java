package modeloUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Cliente;
import modelo.CuentaCajaAhorro;

class CuentaCajaAhorroUnitTest {

	@Test
	public void instanciarCuentaCajaAhorro_CuentaCompleta_IntanciaCorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta,1);
		assertNotNull(cuentaCajaAhorro);
	}

	@Test
	public void instanciarCuentaCajaAhorro_CuentaNoCompleta_IntanciaSinCliente() {
		CuentaCajaAhorro cuentaCajaAhorro;
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", null,1);
		assertNull(cuentaCajaAhorro);
	}

	@Test
	public void instanciarCuentaCajaAhorro_CuentaSinNuemero_IntanciaIncorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia(null, clienteCuenta,1);
		assertNull(cuentaCajaAhorro);
	}

	@Test
	public void instanciarCuentaCajaAhorro_CuentaSinDatos_IntanciaNoCreada() {
		CuentaCajaAhorro newCuentaCajaAhorro = CuentaCajaAhorro.instancia(null, null,null);
		assertNull(newCuentaCajaAhorro);
	}

	@Test
	public void instanciaExtracionCajaAhorro_extracionParcialCorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta,1);
		cuentaCajaAhorro.depositar(2000);
		cuentaCajaAhorro.extraer(1000);
		assertEquals(1000.0, cuentaCajaAhorro.getSaldo(), 2);
	}

	@Test
	public void instanciaExtracionCajaAhorro_extracionTotalCorrecta() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta,1);
		cuentaCajaAhorro.depositar(2000);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(0.0, cuentaCajaAhorro.getSaldo(), 2);
	}

	@Test
	public void instanciaExtracionCajaAhorro_SinSaldoDisponibleCuentaNueva_devuelveCero() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta,1);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(0.0, cuentaCajaAhorro.getSaldo(), 2);
	}

	@Test
	public void instanciaExtracionCajaAhorro_SaldoInsuficiente_devuelveSaldo() {
		CuentaCajaAhorro cuentaCajaAhorro;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaAhorro = CuentaCajaAhorro.instancia("123456789", clienteCuenta,1);
		cuentaCajaAhorro.depositar(1000);
		cuentaCajaAhorro.extraer(2000);
		assertEquals(1000.0, cuentaCajaAhorro.getSaldo(), 2);
	}

	@Test
	public void modificarCuentaCajaAhorro_CuentaCompleta_ModificacionCorrecta() {
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		Cliente clienteNuevo = Cliente.instancia(3, "Perez", "Ramon", "1234", "Santa Lucia 189");
		String numeroCuil = "12344";
		CuentaCajaAhorro cuentaModificar = CuentaCajaAhorro.instancia("12344", clienteCuenta,1);
		cuentaModificar.modificarCuentaCajaAhorro(cuentaModificar, clienteNuevo, numeroCuil);

		assertEquals(
				"12344" + clienteNuevo.getIdCliente() + clienteNuevo.getApellido() + clienteNuevo.getNombre()
						+ clienteNuevo.getCuil() + clienteNuevo.getDireccion(),
				cuentaModificar.getNumero() + cuentaModificar.getTitular().getIdCliente()
						+ cuentaModificar.getTitular().getApellido() + cuentaModificar.getTitular().getNombre()
						+ cuentaModificar.getTitular().getCuil() + cuentaModificar.getTitular().getDireccion());
	}

}
