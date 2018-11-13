package interactor;


import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class ModificarCuentaCajaDeAhorroEspecial {
	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public ModificarCuentaCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCuentaCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuentaModificar, Cliente nuevoTitular) {
		if(!elRepositorio.consultarCuentaCajaDeAhorroEspecial(cuentaModificar)) {
			CuentaCajaDeAhorroEspecial nuevaCuenta = CuentaCajaDeAhorroEspecial.instancia(cuentaModificar.getNumero(), nuevoTitular);
			return elRepositorio.modificarCuentaCajaDeAhorroEspecial(nuevaCuenta);
		}
		return false;
		
	}
}
