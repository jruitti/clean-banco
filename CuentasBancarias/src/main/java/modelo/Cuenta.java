package modelo;


import java.util.LinkedList;

public class Cuenta {
	private String numero;
	private Cliente titular;
	private double saldo;
	private Integer idCuenta;
	private LinkedList<Movimiento> listaMovimiento= new LinkedList<Movimiento>();
	
	protected Cuenta(String numero, Cliente titular, Integer idCuenta) {

		this.numero = numero;
		this.titular = titular;
		this.idCuenta=idCuenta; 
		this.saldo=0;
		
	}
	
	public String getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public Integer getIdCuenta() {
		return idCuenta;
	}


	public LinkedList<Movimiento> getListaMovimiento() {
		return listaMovimiento;
	}


	public void depositar(double montoDepositar) {
		if(montoDepositar > 0) {
			listaMovimiento.add(new Deposito(montoDepositar));
			this.saldo += montoDepositar;
		}
		
	}
	/*el metodo depositar deberia devolver un boolean, que al tener una condicion, puede que no se cumpla*/
	public boolean extraer(double monto) {
		boolean resultado=false;
		if( (monto<= this.saldo) ){
			this.saldo -= monto;
			resultado=true;
			listaMovimiento.add(new Extraccion(monto));
		}
		return resultado;
	
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
	public void setTitular(Cliente nuevoTitular) {
		this.titular = nuevoTitular;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numero = numeroCuenta;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public void setListaMovimiento(LinkedList<Movimiento> listaMovimiento) {
		this.listaMovimiento = listaMovimiento;
	}
	
	
}

