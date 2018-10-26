package repositorio;

import modelo.CuentaCajaAhorro;

public interface ICuentaCajaDeAhorroRepositorio {
	public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

	public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

}
