package repositorio;

import modelo.CuentaCajaDeAhorroComun;
import modelo.CuentaCorriente;

public interface IcuentaCorrienteRepositorio {
	public boolean crearCuentaCorriente(CuentaCorriente persCuentaCorriente);
	public boolean modificarCuentaCorriente(CuentaCorriente persCuentaCorriente);
	
}
