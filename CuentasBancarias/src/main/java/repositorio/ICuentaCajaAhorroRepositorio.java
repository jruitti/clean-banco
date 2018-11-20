package repositorio;

import modelo.CuentaCajaAhorro;

public interface ICuentaCajaAhorroRepositorio {
	public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);
	public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro cuentaCajaAhorro);
	public boolean ExtraerDineroCajaAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);
	public boolean existeCuentaCajaDeAhorro(CuentaCajaAhorro cuentaCajaAhorro);
	public boolean guardarCambiosCuenta(CuentaCajaAhorro laCuenta);
	public boolean existeNumeroCuentaCajaAhorro(String numeroCuenta);
	public CuentaCajaAhorro devuelveCuentaPorId(Integer idCuenta);

}
