package repositorio;

import modelo.CuentaCorriente;

public interface ICuentaCorrienteRepositorio {
	public boolean guardarCuentaCorriente(CuentaCorriente pCuentaCorriente);
	public boolean modificarCuentaCorriente(CuentaCorriente pCuentaCorriente);
	public boolean existeCuentaCorriente(CuentaCorriente pCuentaCorriente);
	public boolean existeCuentaCorrientePorNumero(String nCuentaCorriente);
	boolean crearCuentaCorriente(CuentaCorriente cuentaCorrienteNuevo);

}
