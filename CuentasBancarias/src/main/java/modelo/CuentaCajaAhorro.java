package modelo;

public class CuentaCajaAhorro extends Cuenta {

	private CuentaCajaAhorro(String numero, Cliente titular) {
		super(numero, titular);
	}

	public static CuentaCajaAhorro instancia(String numero, Cliente titular) {
		if ((numero != null) && (titular != null)) {
			return new CuentaCajaAhorro(numero, titular);
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
}