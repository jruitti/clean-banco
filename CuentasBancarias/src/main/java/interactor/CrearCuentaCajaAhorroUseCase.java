package interactor;

import static org.junit.Assert.assertTrue;

import modelo.CuentaCajaAhorro;
import repositorio.IClienteRepositorio;
import repositorio.ICuentaCajaDeAhorroRepositorio;

public class CrearCuentaCajaAhorroUseCase {
	
	private ICuentaCajaDeAhorroRepositorio elRepositorio;

	public CrearCuentaCajaAhorroUseCase(ICuentaCajaDeAhorroRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	public boolean CrearCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		CuentaCajaAhorro cuentaAhorroNuevo = new CuentaCajaAhorro(cuentaCajaAhorro.getNumero(),
				cuentaCajaAhorro.getTitular(),cuentaCajaAhorro.getSaldo());
		return elRepositorio.crearCuentaCajaDeAhorro(cuentaAhorroNuevo);
	}

	

}
