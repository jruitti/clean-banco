package repositorio;

import modelo.CuentaCajaDeAhorroComun;
import modelo.CuentaCajaDeAhorroEspecial;

public interface ICuentaCajaDeAhorroEspecialRepositorio {
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroComun persCuentaCajaDeAhorroEspecial);
	
}