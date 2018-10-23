package modelo;

public class Cliente {

	private int idCliente;
	private String apellido;
	private String nombre;
	private String cUIL;
	private String direccion;

	private Cliente(int idCliente, String apellido, String nombre, String cUIL, String direccion) {
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.cUIL = cUIL;
		this.direccion = direccion;
	}

	
	public static Cliente instancia(Integer idCliente, String apellido, String nombre, String cuil, String direccion) {
		if (apellido == null || nombre == null || cuil == null) {
			return null;
		} else {
			return new Cliente(idCliente, apellido, nombre, cuil, direccion);
		}
	} 

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCuil() {
		return cUIL;
	}

	public String getDireccion() {
		return direccion;
	}
}