import java.util.ArrayList;

public class MedicinaGeneral extends Medico{

	public boolean pedirCita(Paciente paciente) {
		this.citas.add(new Cita());
		
		return true;
	}
	
	public boolean consultarAgenda(String hora, String fecha, Medico medico) {
		
		
		return true;
	}
	
	private ArrayList<Cita> accederAgenda(Medico medico){
		
		return medico.citas;
	}
	
	
}
