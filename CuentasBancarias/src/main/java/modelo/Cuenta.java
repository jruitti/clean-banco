package modelo;

public class Cuenta {
	private String numero;
	private Cliente titular;
	private double saldo=0;
	public Cuenta(String numero, Cliente titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo; 
	}
	public String getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}
	public boolean extraer(double monto) {
		
		boolean resultado=true;
		this.saldo -= monto;
		return resultado;
	
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}

