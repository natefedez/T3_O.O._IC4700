package natanfdecastro.tarea3oo_lenguajes;
import java.util.ArrayList;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class MedicinaGeneral extends Medico {

	public Cita pedirCita(Paciente paciente, String hora, String fecha) {
		return asignarCita(paciente, hora, fecha);
	}
	
	public boolean consultarAgenda(String hora, String fecha, Medico medico) {
		return medico.citaReservada(hora, fecha);
	}
	
	public Cita referir(Especialista medico, Paciente paciente, String hora, String fecha) {
		return medico.asignarCita(paciente, hora, fecha);
	}
	
	public ArrayList<Cita> accederAgenda(Medico medico) {
		return medico.getAgenda();
	}


	
}
