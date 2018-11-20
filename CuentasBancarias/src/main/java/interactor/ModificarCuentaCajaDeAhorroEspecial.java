package interactor;


import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class ModificarCuentaCajaDeAhorroEspecial {
	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public ModificarCuentaCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCuentaCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuentaModificar, String numeroModificar) {
		if(!elRepositorio.existeCuentaCajaDeAhorroEspecial(cuentaModificar)) {
			cuentaModificar.modificarCajaAhorroEspecial(cuentaModificar, numeroModificar);
			return elRepositorio.guardarCajaAhorroEspecial(cuentaModificar);
		}
		return false;
		
	}
}
