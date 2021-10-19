package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos () {
		int cant = 0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				if (this.asientos[i].getClass() == Asiento.class) {
					cant++;
				}
			}			
		}
		return cant;
	}
	
	String verificarIntegridad () {
		if (this.registro != this.motor.registro) {
			return "Las piezas no son originales"; 
		}		
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				if (this.registro != this.asientos[i].registro) {
					return "Las piezas no son originales";
				}
			}			
		}		
		return "Auto original";
	}

}
