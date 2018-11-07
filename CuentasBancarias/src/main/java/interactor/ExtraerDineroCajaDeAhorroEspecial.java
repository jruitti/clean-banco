package interactor;

import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;

public class ExtraerDineroCajaDeAhorroEspecial {
		private ICuentaCajaDeAhorroEspecialRepositorio elRepositorio;

		public ExtraerDineroCajaDeAhorroEspecial(ICuentaCajaDeAhorroEspecialRepositorio elRepositorio) {
			super();
			this.elRepositorio = elRepositorio;
		}
		
		public boolean ExtraerDineroCuentaCorriente(CuentaCajaDeAhorroEspecial laCuenta, float dinero) {
			if(!elRepositorio.consultarExtraccionMesEnCurso(laCuenta)) {
				if(elRepositorio.ExtraerDineroCajaAhorroEspecial(dinero)) {
					return true;
				}
				return false;
			}
			return false;
		}
		
		
}
