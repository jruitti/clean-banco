package modelo;

public class CuentaCorriente extends Cuenta {
	private double descubierto= 0.0;
	
	private CuentaCorriente(String numero, Cliente titular) {
		super(numero, titular);
		
	}
	
	public static CuentaCorriente instancia(String numero, Cliente titular) {
		
		if(numero == null || titular == null)
			return null;
		else
			return new CuentaCorriente(numero,titular);
					
	}
	public boolean extraer(double monto) {
		
		
		if(super.getSaldo() < monto && this.descubierto >= -1000) {
			monto-=super.getSaldo();
			super.setSaldo(0.0);
			descubierto -= monto;
			if(descubierto < -1000) {
				descubierto = 0.0;
			}
		}
		else
			return super.extraer(monto);
		
		return false;
	}

	public double getDescubierto() {
		return descubierto;
	}

	
	
	

}
