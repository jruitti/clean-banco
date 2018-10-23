package interactor;

import modelo.CuentaCajaDeAhorroComun;
import repositorio.ICuentaCajaDeAhorroComunRepositorio;

public class CrearCuentaCajaDeAhorroComunUseCase {
	private ICuentaCajaDeAhorroComunRepositorio elRepositorio;

	public CrearCuentaCajaDeAhorroComunUseCase(ICuentaCajaDeAhorroComunRepositorio elRepositorio) {
		super();
		this.elRepositorio = elRepositorio;
	}
	public boolean crearCuientaCajaDeAhorroComun(CuentaCajaDeAhorroComun cuentaComun) {
		CuentaCajaDeAhorroComun cuentaNueva = new CuentaCajaDeAhorroComun(cuentaComun.getNumero(),
				cuentaComun.getTitular(), cuentaComun.getSaldo());
		
		return elRepositorio.crearCuentaCajaDeAhorroComun(cuentaNueva);
	}

}
