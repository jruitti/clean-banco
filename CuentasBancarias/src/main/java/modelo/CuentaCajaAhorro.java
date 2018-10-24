package modelo;

public class CuentaCajaAhorro extends Cuenta {

	public CuentaCajaAhorro(String numero, Cliente titular, double saldo) {
		super(numero, titular, saldo);
	}

	public static CuentaCajaAhorro instancia(String numero, Cliente titular, double saldo) {
		if (titular == null) {
			return null;
		} 
		if(saldo < 0) {
			return null;
		}
		if(numero == null) {
			return null;
		}
		else {
			return new CuentaCajaAhorro(numero, titular, saldo);
		}
	}

}
