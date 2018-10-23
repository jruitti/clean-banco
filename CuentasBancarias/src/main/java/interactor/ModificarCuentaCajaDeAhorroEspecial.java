package interactor;

import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhoorroEspecialRepositorio;


public class ModificarCuentaCajaDeAhorroEspecial {
	private ICuentaCajaDeAhoorroEspecialRepositorio elRepositorio;

	public ModificarCuentaCajaDeAhorroEspecial(ICuentaCajaDeAhoorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean crearCuentaCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuenta1) {
		CuentaCajaDeAhorroEspecial nuevaCuenta= new CuentaCajaDeAhorroEspecial(cuenta1.getNumero(),cuenta1.getTitular(),cuenta1.getSaldo());
		//Cliente nuevoCliente=Cliente.instancia(elCliente.getIdCliente(), elCliente.getApellido(), elCliente.getNombre(), elCliente.getCuil(), elCliente.getDireccion());
		return elRepositorio.guardarCajaAhorroEspecial(nuevaCuenta);	
	}
}
