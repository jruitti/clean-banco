package modeloUnitTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import modelo.Cliente;

public class ClienteUnitTest {
	@Test
	public void instanciarCliente_clienteCompleto_IntanciaCliente() {
		Cliente elCliente;
		elCliente=Cliente.Intancia(1,"Perez","Juan","20-12345678","San Martin 100");
		assertNotNull(elCliente);
	}

}
