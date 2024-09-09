package ejempo_20240909a;
// import java.util.Date;
import java.time.LocalDate;

public class Trabajador {
	String nombre;
	LocalDate inicioDeTrabajo;
	double salarioBase;
	
	Trabajador (String nombre, LocalDate inicioDeTrabajo, double salarioBase){
		this.nombre = nombre;
		this.inicioDeTrabajo = inicioDeTrabajo;
		this.salarioBase = salarioBase;
	}
	
	int calcularDiasVacaciones() { // TBD
		int calcularDiasVacaciones = 0;
		LocalDate hoy = LocalDate.now(null);
		
		
		return calcularDiasVacaciones; 
	}
	
	double calcularAumentoSalarial() {
		double calcularAumentoSalarial = 0.0;
		
		return calcularAumentoSalarial;
	}
	
	double calcularIndemnizacionDespido (int salarioBase) {
		double calcularIndemnizacionDespido = 0.0;
		
		return calcularIndemnizacionDespido;		
	}
	
}
