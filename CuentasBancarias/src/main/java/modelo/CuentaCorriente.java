package modelo;

public class CuentaCorriente extends Cuenta {
	private double descubierto= 0.0;
	
	private CuentaCorriente(String numero, Cliente titular) {
		super(numero, titular);
		
	}
	
	public static CuentaCorriente instancia(String numero, Cliente titular) {
		
		if(numero != null && titular!= null)
			return new CuentaCorriente(numero,titular);
		else
			return null;
					
	}
	public boolean extraer(double monto) {
		
		
		
		if( (super.getSaldo()+ descubierto) >= monto) {
			double resultado = super.getSaldo()-monto;
			super.setSaldo(resultado);
			return true;
			}
		else {
			if( (super.getSaldo() < monto) || ( (super.getSaldo()+descubierto) >= monto) ) {
				descubierto = super.getSaldo()-monto;
				super.setSaldo(0);				
				return true;
				
			}
		}
		return false;
		

		
	}

	public double getDescubierto() {
		return descubierto;
	}

	
	
	

}
