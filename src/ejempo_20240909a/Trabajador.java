/* 
Ejercicio de Programación: Gestión de Trabajadores

Descripción del Problema:
Debes crear una clase Trabajador que represente a un empleado de una empresa. 
Cada trabajador tiene un nombre, una fecha de inicio de trabajo y un salario base. 
Además, se requiere implementar métodos para calcular diferentes aspectos relacionados con la experiencia laboral del trabajador.

Implementa un método llamado calcularDiasVacaciones() que calcule los días de vacaciones 
de un trabajador en función de su experiencia laboral. Por cada año de experiencia, el trabajador recibe 7 días adicionales de vacaciones.

Crea un método llamado calcularAumentoSalarial() que determine el aumento salarial
de un trabajador en función de su experiencia laboral. Por cada año de experiencia, el trabajador recibe un aumento de salario de 1000 pesos.

Implementa un método llamado calcularIndemnizacionDespido(int salarioBase) 
que calcule la indemnización por despido de un trabajador en función de su experiencia laboral 
y su salario base. La indemnización se calcula multiplicando la cantidad de años trabajados por el salario base del trabajador.

Crea la clase Trabajador con los atributos necesarios y los métodos especificados.
Utiliza la clase LocalDate de Java para representar la fecha de inicio de trabajo de un trabajador.
Asegúrate de manejar adecuadamente los tipos de datos y los cálculos necesarios en cada método.
*/

/*
 * 20240909 - 20240909
 * viktor.korshunov@davinci.edu.ar
 * viktor@korshunov.ar
 */

package ejempo_20240909a;
// import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

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
		
		LocalDate hoy = LocalDate.now();
		
		Period period = Period.between(inicioDeTrabajo, hoy);
		
		
		
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
