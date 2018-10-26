package modelo;

public class CuentaCajaAhorro extends Cuenta {

	public CuentaCajaAhorro(String numero, Cliente titular) {
		super(numero, titular);
	}

	public static CuentaCajaAhorro instancia(String numero, Cliente titular) {
		if ( (titular != null)|| (titular !=null) ){
			return new CuentaCajaAhorro(numero, titular);			
		}
		return null;

	}

}
