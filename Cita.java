/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public abstract class Cita implements InformeImpreso{ // clase abstracta que es utilizada como padre 
    
	private String fecha; // Atributo fecha establecido como privado
	private String hora;  // Atributo hora establecido como privado
	
	public String getFecha() { // get para fecha, puede ser accedido por Cita Medico y CitaPaciente
		return fecha;      // mediante implementación método setInfo en constructores
	}

	public String getHora() {  // get para hora, puede ser accedido por Cita Medico y CitaPaciente
		return hora;       // mediante implementación método setInfo en constructores
	}
	
	public void setInfo(String fecha, String hora) { // Metodo setInfo que permite implementar hora y fecha en clases hijas
		this.fecha = fecha;
		this.hora = hora;
	}
	
}
