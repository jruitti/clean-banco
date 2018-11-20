package modeloUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;

public class CuentaCajaDeAhorroEspecialUnitTest {

	@Test
	public void instanciarCuentaCajaDeAhorroEspecial_CuentaCompleta_InstanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", clienteCuenta, 1);
		assertNotNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void instanciarCuentaCajaDeAhorroEspecial_CuentaNoCompleta_NoInstanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", null, null);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void instanciarCuentaCajaAhorro_CuentaSinNumero_NoInstanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia(null, clienteCuenta, null);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void instanciarCuentaCajaDeAhorroEspecial_CuentaSinDatos_NoInstanciaCuentaCajaDeAhorroEspecial() {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia(null, null, null);
		assertNull(cuentaCajaDeAhorroEspecial);
	}

	@Test
	public void ExtraerCajaDeAhorroEspecialUnaSolaVezAlMes_NoExtrajoEnElMes_PermiteExtraer() {
		LocalDate ultimaExtraccion = LocalDate.of(2018, 10, 12);
		LocalDate fechaActual = LocalDate.of(2018, 11, 10);
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", clienteCuenta, 1);
		cuentaCajaDeAhorroEspecial.actualizarFechaUltima(ultimaExtraccion);
		cuentaCajaDeAhorroEspecial.depositar(1000);
		cuentaCajaDeAhorroEspecial.extraer(500, fechaActual);

		assertEquals(500.0, cuentaCajaDeAhorroEspecial.getSaldo(), 2);

	}

	@Test
	public void ExtraerCajaDeAhorroEspecialUnaSolaVezAlMes_ExtrajoEnElMes_NoPermiteExtraer() {
		LocalDate ultimaExtraccion = LocalDate.of(2018, 10, 12);
		LocalDate fechaActual = LocalDate.of(2018, 10, 14);
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial;
		Cliente clienteCuenta = Cliente.instancia(2, "Perez", "Pepe", "12345", "Santa Rosa 321");
		cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("123456789", clienteCuenta, 1);
		cuentaCajaDeAhorroEspecial.actualizarFechaUltima(ultimaExtraccion);
		cuentaCajaDeAhorroEspecial.depositar(1000);
		cuentaCajaDeAhorroEspecial.extraer(500, fechaActual);

		assertEquals(1000.0, cuentaCajaDeAhorroEspecial.getSaldo(), 2);
	}

	@Test
	public void ModificarCuentaCajaDeAhorroEspecial_CajaDeAhorroEspecialModificada() {
<<<<<<< HEAD
		Cliente nuevoCliente = Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B° Las Torres");
		String numeroCuentaAModificar = "15428541";

		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796",
				nuevoCliente, 1);
=======
		Cliente nuevoCliente= Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "Bï¿½ Las Torres");
		String numeroCuentaAModificar="15428541";
		
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796", nuevoCliente);
>>>>>>> master
		cuentaCajaDeAhorroEspecial.modificarCajaAhorroEspecial(cuentaCajaDeAhorroEspecial, numeroCuentaAModificar);

		assertEquals(cuentaCajaDeAhorroEspecial.getNumero(), numeroCuentaAModificar);
	}

}
