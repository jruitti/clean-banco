package interactor;

import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

public class ExtraerDineroCuentaCorriente {
	
	private ICuentaCorrienteRepositorio elRepositorio;
	
	public ExtraerDineroCuentaCorriente(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	
	public boolean ExtraerDineroCuentaCorriente(CuentaCorriente pCuentaCorriente, double monto) {
		
		if (elRepositorio.extraerDineroCuentaCorriente()) {
			pCuentaCorriente.extraer(monto);
			return true;
		}
		return false;
	}

}
