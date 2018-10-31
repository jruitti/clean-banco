package repositorio;

import modelo.CuentaCorriente;

public interface ICuentaCorrienteRepositorio {
	public boolean guardarCuentaCorriente(CuentaCorriente pCuentaCorriente);
	public boolean modificarCuentaCorriente(CuentaCorriente pCuentaCorriente);
	public boolean existeCuentaCorriente(CuentaCorriente pCuentaCorriente);

	boolean crearCuentaCorriente(CuentaCorriente cuentaCorrienteNuevo);

}
