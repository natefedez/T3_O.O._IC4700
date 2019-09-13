import java.util.ArrayList;

public class Paciente extends Usuario{

	private MedicinaGeneral medicoCabecera;
	private ExpedienteMedico expedienteMedico;
	
	
	public boolean referirEspecialista(Especialista doctor, String hora, String fecha) {
		
		Cita cita = medicoCabecera.referir(doctor, this, hora, fecha);
		
		if(cita == null) {
			return false;
		} else {
			expedienteMedico.addCita(cita);
			return true;
		}
	}
	
	public ArrayList<Cita> getAgenda(){
		return expedienteMedico.getHistorialCitas();
	}
	
}
