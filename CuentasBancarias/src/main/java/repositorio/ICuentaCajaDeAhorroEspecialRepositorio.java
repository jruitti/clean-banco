package repositorio;

import modelo.CuentaCajaAhorro;
import modelo.CuentaCajaDeAhorroEspecial;

public interface ICuentaCajaDeAhorroEspecialRepositorio {
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaAhorro persCuentaCajaDeAhorroEspecial);
	public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta);
	
}
