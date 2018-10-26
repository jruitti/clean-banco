package modelo;

import java.time.LocalDateTime;

public class Movimiento {
	private LocalDateTime fechaYHoraDelMoviento;
	private double montoDelMovimiento;
	
	protected Movimiento(double montoDelMovimiento) {
		this.fechaYHoraDelMoviento = LocalDateTime.now();
		this.montoDelMovimiento = montoDelMovimiento;
	}
	
	public LocalDateTime getFechaYHoraDelMoviento() {
		return fechaYHoraDelMoviento;
	}

	public double getMontoDelMovimiento() {
		return montoDelMovimiento;
	}

}
