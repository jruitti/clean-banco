package interactor;

import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;


public class ModificarCuentaCajaDeAhorroEspecial {
	private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

	public ModificarCuentaCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}

	public boolean crearCuentaCajaAhorroEspecial(CuentaCajaDeAhorroEspecial cuenta1) {
		CuentaCajaDeAhorroEspecial nuevaCuenta= new CuentaCajaDeAhorroEspecial(cuenta1.getNumero(),cuenta1.getTitular());
		//Cliente nuevoCliente=Cliente.instancia(elCliente.getIdCliente(), elCliente.getApellido(), elCliente.getNombre(), elCliente.getCuil(), elCliente.getDireccion());
		return elRepositorio.guardarCajaAhorroEspecial(nuevaCuenta);	
	}
}
