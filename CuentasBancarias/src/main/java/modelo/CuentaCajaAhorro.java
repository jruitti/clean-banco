package modelo;

public class CuentaCajaAhorro extends Cuenta {

	private CuentaCajaAhorro(String numero, Cliente titular,Integer idCueenta) {
		super(numero, titular,idCueenta);
	}

	public static CuentaCajaAhorro instancia(String numero, Cliente titular,Integer idCuenta) {
		if ((numero != null) && (titular != null)&&(idCuenta!=null)) {
			return new CuentaCajaAhorro(numero, titular, idCuenta);
		}
		return null;
	}
	

	public CuentaCajaAhorro modificarCuentaCajaAhorro(CuentaCajaAhorro cuentaModificar, Cliente clienteNuevo,
			String numeroCuil) {
		if (numeroCuil == (cuentaModificar.getNumero())) {
			cuentaModificar.setTitular(clienteNuevo);
		}
		return cuentaModificar;
	}

	public void modificarDatosDb(CuentaCajaAhorro cuentaCajaAhorro) {
		this.setNumero(cuentaCajaAhorro.getNumero());
		
	}
}