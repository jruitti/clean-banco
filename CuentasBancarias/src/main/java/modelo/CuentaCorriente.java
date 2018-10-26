package modelo;

public class CuentaCorriente extends Cuenta {
	private double descubierto= 0.0;
	
	private CuentaCorriente(String numero, Cliente titular) {
		super(numero, titular);
		
	}
	
	public static CuentaCorriente instancia(String numero, Cliente titular) {
		
		if(numero != null || titular != null)
			return new CuentaCorriente(numero,titular);
		else
			return null;
					
	}
	public boolean extraer(double monto) {
		
		/*revisar logica, puede extraer mas de lo que se puede obtener entre el monto y el saldo descubierto. 
		 dejo una opcion
		
		if( (super.getSaldo()+ descubierto) >= monto) {
			if( (super.getSaldo() < monto) || ( (super.getSaldo()+descubierto) >= monto) ) {
				descubierto = super.getSaldo()-monto;
				super.setSaldo(0);
				return true;
			}
			else {
				double resultado = super.getSaldo()-monto;
				super.setSaldo(resultado);
				return true;
			}
		}
		return false;
		*/

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
