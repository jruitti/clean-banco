package modeloUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Cliente;
import modelo.CuentaCorriente;

public class CuentaCorrienteUnitTest {

	@Test
	public void CuentaCorriente_instanciaCorrecta() {
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente, 1);
		assertNotNull(laCuentaCorriente);
	}

	@Test
	public void CuentaCorriente_instanciaIncorrecta() {
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia(null, elCliente, null);
		assertNull(laCuentaCorriente);
	}

	@Test
	public void Extraer_MontoDescubiertoDisponible_PermiteExtraer() {
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente, null);
		laCuentaCorriente.depositar(600);
		laCuentaCorriente.extraer(1600);

		assertEquals(-1000.0, laCuentaCorriente.getSaldo(), 2);
	}

	@Test
	public void Extraer_MontoDescubiertoDisponible_NoPermiteExtraer() {
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678", "San Martin 100");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente, null);
		laCuentaCorriente.depositar(600);
		laCuentaCorriente.extraer(1601);

		assertEquals(600.0, laCuentaCorriente.getSaldo(), 2);
	}

	@Test
	public void modificarCuentaCorriente_CuentaCorrienteModificada() {
		Cliente elCliente = Cliente.instancia(1, "Ortiz", "Andres", "20-37415482-7", "Castro y Bazan 124");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente,1);
		Cliente elClienteNuevo = Cliente.instancia(2, "Flores", "Ivan", "19-324453424-2", "Nolasco");
		laCuentaCorriente.modificarCuentaCorriente("001", elClienteNuevo);
		assertEquals("Flores", laCuentaCorriente.getTitular().getApellido());

	}

	@Test
	public void modificarCuentaCorriente_CuentaCorrienteNoModificada() {
		Cliente elCliente = Cliente.instancia(1, "Ortiz", "Andres", "20-37415482-7", "Castro y Bazan 124");
		CuentaCorriente laCuentaCorriente = CuentaCorriente.instancia("001", elCliente,1);
		Cliente elClienteNuevo = Cliente.instancia(2, "Flores", "Ivan", "19-324453424-2", "Nolasco");
		laCuentaCorriente.modificarCuentaCorriente("002", elClienteNuevo);
		assertEquals("Ortiz", laCuentaCorriente.getTitular().getApellido());

	}

}
