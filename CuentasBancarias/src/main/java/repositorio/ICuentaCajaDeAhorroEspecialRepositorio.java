package repositorio;

import modelo.CuentaCajaDeAhorroEspecial;


public interface ICuentaCajaDeAhorroEspecialRepositorio {
	
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean consultarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta);
	
	
}
