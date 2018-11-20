package interactor;

import java.time.LocalDate;

import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;

public class ExtraerDineroCajaDeAhorroEspecial {
		private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

		public ExtraerDineroCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
			super();
			this.elRepositorio = elRepositorio;
		}
		
		public boolean ExtraerDineroCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial laCuenta, float dinero, LocalDate fecha) {
		
				
				if(laCuenta.extraer(dinero, fecha)) {
					
					return elRepositorio.actualizarCuentaCajaDeAhorroEspecial(laCuenta);
				}
				return false;
			
		
		}
		
		
}
