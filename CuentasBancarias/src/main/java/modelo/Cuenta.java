package modelo;

public class Cuenta {
	private String numero;
	private String titular;
	private double saldo=0;
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo; 
	}
	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
}

