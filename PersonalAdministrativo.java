package natanfdecastro.tarea3oo_lenguajes;
import java.util.ArrayList;

public class PersonalAdministrativo extends Usuario{
		
	private ArrayList<Cita> accederAgenda (Medico medico){
		return medico.getAgenda();
	}
	
	private ArrayList<Cita> accederAgendaPaciente (Paciente paciente){
		return paciente.getAgenda();
	}
}
