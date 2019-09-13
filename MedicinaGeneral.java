import java.util.ArrayList;

public class MedicinaGeneral extends Medico{

	public Cita pedirCita(Paciente paciente, String hora, String fecha) {
		return asignarCita(paciente, hora, fecha);
	}
	
	public boolean consultarAgenda(String hora, String fecha, Medico medico) {
		return medico.citaReservada(hora, fecha);
	}
	
	public Cita referir(Especialista medico, Paciente paciente, String hora, String fecha) {
		return medico.asignarCita(paciente, hora, fecha);
	}
	
	private ArrayList<Cita> accederAgenda(Medico medico) {
		return medico.getAgenda();
	}
	
}
