package modelo;

public class Cuenta {
	private String numero;
	private Cliente titular;
	private double saldo;

	protected Cuenta(String numero, Cliente titular) {

		this.numero = numero;
		this.titular = titular;
		saldo = 0;

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
		boolean resultado = false;
		if (monto >= this.saldo) {
			this.saldo -= monto;
			resultado = true;
		}
		return resultado;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
