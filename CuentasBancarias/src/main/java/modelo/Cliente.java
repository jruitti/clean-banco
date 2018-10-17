package modelo;

public class Cliente {

	private int idCliente;
	private String apellido;
	private String nombre;
	private String cUIL;
	private String direccion;

	public Cliente(int idCliente, String apellido, String nombre, String cUIL, String direccion) {
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.cUIL = cUIL;
		this.direccion = direccion;
	}

	public static Cliente Intancia(int idCliente, String apellido, String nombre, String CUIL, String direccion) {
		
		return new Cliente(idCliente,apellido,nombre,CUIL,direccion);
	}

}
