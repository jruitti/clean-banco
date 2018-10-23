package repositorio;

import modelo.Cuenta;
import modelo.CuentaCajaDeAhorroComun;

public interface ICuentaCajaDeAhorroComunRepositorio {
	public boolean crearCuentaCajaDeAhorroComun(CuentaCajaDeAhorroComun persCuentaCajaDeAhorroComun);
	public boolean modificarCuentaCajaDeAhorroComun(CuentaCajaDeAhorroComun persCuentaCajaDeAhorroComun);
	

}
