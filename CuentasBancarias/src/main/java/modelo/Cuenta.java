package modelo;

public class Cuenta {
	private String numero;
	private Cliente titular;
	private double saldo=0;

	
	public Cuenta(String numero, Cliente titular) {

		super();
		this.numero = numero;
		this.titular = titular;
		 
	}
	
	
	public String getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}
	public void depositar(double montoDepositar) {
		this.saldo += montoDepositar;
	}
	public boolean extraer(double monto) {
		
		boolean resultado=true;
		this.saldo -= monto;
		return resultado;
	
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}

