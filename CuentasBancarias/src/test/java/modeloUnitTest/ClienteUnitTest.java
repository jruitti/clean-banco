package modeloUnitTest;

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
	 
	


}
