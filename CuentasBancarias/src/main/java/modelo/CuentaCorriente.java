package modelo;

public class CuentaCorriente extends Cuenta {
	private double descubierto = 0.0;

	private CuentaCorriente(String numero, Cliente titular) {
		super(numero, titular);

	}

	public static CuentaCorriente instancia(String numero, Cliente titular) {

		if (numero != null && titular != null)
			return new CuentaCorriente(numero, titular);
		else
			return null;

	}

	public boolean extraer(double monto) {
	double auxiliar = monto - (super.getSaldo());
	
	if(auxiliar > 0 && (descubierto + auxiliar) <= 1000) {
		monto -= super.getSaldo();
		super.setSaldo(0.0);
		descubierto += monto;
		return true;
	}else {
		if(auxiliar < 0) {
			return super.extraer(monto);
			
		}
	}
		return false;

	}

	public double getDescubierto() {
		return descubierto;
	}

	
	public  void modificarCuentaCorriente(String numeroCuenta, Cliente elClienteNuevo) {
		if(super.getNumero() == numeroCuenta)
			super.setTitular(elClienteNuevo);
			
		
	}

}
