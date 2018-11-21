package interactor;


import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class ModificarCuentaCajaDeAhorroEspecial {
	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public ModificarCuentaCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean modificarCuentaCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial) {
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecialDB = elRepositorio.devuelveCuentaPorId(cuentaCajaDeAhorroEspecial.getIdCuenta());
		
		if (cuentaCajaDeAhorroEspecial.getNumero().equals(cuentaCajaDeAhorroEspecialDB.getNumero())||!elRepositorio.existeNumeroCuentaCajaDeAhorroEspecial(cuentaCajaDeAhorroEspecial.getNumero())) {
			cuentaCajaDeAhorroEspecialDB.modificarDatosDb(cuentaCajaDeAhorroEspecial);
			return elRepositorio.modificarCuentaCajaDeAhorroEspecial(cuentaCajaDeAhorroEspecialDB);
		}
		return false;
		
	}
}
