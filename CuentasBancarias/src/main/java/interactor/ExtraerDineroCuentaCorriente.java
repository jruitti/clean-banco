package interactor;

import modelo.CuentaCorriente;
import repositorio.ICuentaCorrienteRepositorio;

public class ExtraerDineroCuentaCorriente {
	
	private ICuentaCorrienteRepositorio elRepositorio;
	
	public ExtraerDineroCuentaCorriente(ICuentaCorrienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	
	public boolean ExtraerDineroCuentaCorriente(CuentaCorriente pCuentaCorriente) {
		
		if (elRepositorio.extraerDineroCuentaCorriente(1500)) {
			return true;
		}
		return false;
	}

}
