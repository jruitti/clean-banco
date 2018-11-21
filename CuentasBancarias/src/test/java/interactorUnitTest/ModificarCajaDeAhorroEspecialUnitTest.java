package interactorUnitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.Cliente;
import modelo.CuentaCajaAhorro;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;
import interactor.ModificarCuentaCajaDeAhorroEspecial;

 public class ModificarCajaDeAhorroEspecialUnitTest {

	@Test
	public void modificarCuentaCajaDeAhorroEspecial_numeroCuentaNoExiste_CuentaModificada() {
		boolean resultado;
		RepositorioCuentaCajaDeAhorroEspecial elRepositorio = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorio.existeNumeroCuenta = false;
		elRepositorio.resultado = true;

		
		Cliente nuevoCliente = Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B� Las Torres");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796",
				nuevoCliente,1);

		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecial = new ModificarCuentaCajaDeAhorroEspecial(
				elRepositorio);
		resultado = modificarCajaDeAhorroEspecial.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial);

		assertTrue(resultado);
	}

	@Test
	public void modificarCuentaCajaDeAhorroEspecial_numeroCuentaExiste_CuentaNoModificada() {
		boolean resultado;
		RepositorioCuentaCajaDeAhorroEspecial elRepositorio = new RepositorioCuentaCajaDeAhorroEspecial();
		elRepositorio.existeNumeroCuenta = true;

		
		Cliente nuevoCliente = Cliente.instancia(4, "Alive", "Luciano", "20-35064541-2", "B� Las Torres");
		CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("15428796",
				nuevoCliente,1);

		ModificarCuentaCajaDeAhorroEspecial modificarCajaDeAhorroEspecialUseCase = new ModificarCuentaCajaDeAhorroEspecial(
				elRepositorio);
		resultado = modificarCajaDeAhorroEspecialUseCase.modificarCuentaCajaAhorroEspecial(cuentaCajaDeAhorroEspecial);

		assertFalse(resultado);
	}
	
	class RepositorioCuentaCajaDeAhorroEspecial implements ICuentaCajaDeAhorroEspecialRepositorio{
		public boolean existeNumeroCuenta;
		public boolean resultado;
		@Override
		public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean existeCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
			// TODO Auto-generated method stub
			return resultado;
		}

		@Override
		public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean actualizarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial laCuenta) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public CuentaCajaDeAhorroEspecial devuelveCuentaPorId(Integer idCuenta) {
			Cliente clienteDb = Cliente.instancia(1, "perez", "pepe", "1234", "San Rafael");
			CuentaCajaDeAhorroEspecial cuentaCajaDeAhorroEspecialDb= CuentaCajaDeAhorroEspecial.instancia("1000", clienteDb, 1);
			return cuentaCajaDeAhorroEspecialDb;
		}

		@Override
		public boolean existeNumeroCuentaCajaDeAhorroEspecial(
				String numeroCuenta) {
			// TODO Auto-generated method stub
			return existeNumeroCuenta;
		}
	}

}
