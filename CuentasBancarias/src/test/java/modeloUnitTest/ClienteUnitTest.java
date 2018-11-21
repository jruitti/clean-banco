package modeloUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import modelo.Cliente;

public class ClienteUnitTest {
	@Test
	public void instanciarCliente_clienteCompleto_IntanciaCliente() {
		Cliente elCliente;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		assertNotNull(elCliente);
	}

	@Test
	public void instanciarCliente_clienteIncompleto_NoInstanciaCliente() {
		Cliente elCliente;
		elCliente=Cliente.instancia(1,null,null,null,"San Martin 100");
		assertNull(elCliente);  
	}
	
	@Test
	public void instanciarCliente_clienteIncompletoSinError_InstanciaCliente() {
		Cliente elCliente;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678",null);
		assertNotNull(elCliente);  
	}
	@Test
	public void modificarCliente_ModificarNombre_clienteSeModificaSinError() {
		Cliente elCliente;
		String ApellidoNuevo="Soria";
		Integer idComprobacion=1;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678",null);
		elCliente.modicarCliente(idComprobacion,ApellidoNuevo);
		assertEquals(ApellidoNuevo, elCliente.getApellido());;  
	}
	public void modificarCliente_ModificarPorId_IdNoExisteClienteSeModifica() {
		Cliente elCliente;
		String ApellidoNuevo="Soria";
		Integer idComprobacion=1;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678",null);
		elCliente.modicarCliente(idComprobacion,ApellidoNuevo);
		assertEquals(ApellidoNuevo, elCliente.getApellido());;  
	}
	@Test
	public void consultarCliente_ClienteSiExiste() {
		boolean consulta;
		
		Cliente elCliente;
		boolean cuilDevuelto;
		String cuilConsultado;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		cuilConsultado="20-12345678";
		cuilDevuelto=elCliente.consultarClientePorCuil(elCliente,cuilConsultado);
		assertTrue(cuilDevuelto);

		
	}
	
	@Test
	public void consultarCliente_ClienteNoExiste() {
		boolean consulta;
		
		Cliente elCliente;
		boolean cuilDevuelto;
		String cuilConsultado;
		elCliente=Cliente.instancia(1,"Perez","Juan","20-12345678","San Martin 100");
		cuilConsultado="20-1234567";
		cuilDevuelto=elCliente.consultarClientePorCuil(elCliente,cuilConsultado);
		assertFalse(cuilDevuelto);

		
	}


}
