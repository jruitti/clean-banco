package interactor;

import modelo.CuentaCajaAhorro;
import repositorio.ICuentaCajaAhorroRepositorio;

public class DepositarDineroCajaAhorroUseCase {
	private ICuentaCajaAhorroRepositorio elRepositorio;
	
	public DepositarDineroCajaAhorroUseCase (ICuentaCajaAhorroRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}
	
	public boolean DepositarDineroCuentaCajaAhorro(CuentaCajaAhorro laCuenta, double monto) {
		laCuenta.depositar(monto);
		elRepositorio.guardarCambiosCuenta(laCuenta);
		return true;
	}
	

}
