package repositorio;

import modelo.CuentaCajaAhorro;

public interface ICuentaCajaAhorroRepositorio {
	public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

	public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);
	public boolean ExtraerDineroCajaAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

	public boolean guardarCambiosCuenta(CuentaCajaAhorro laCuenta);

}
