
import java.util.ArrayList;

public class Paciente extends Usuario {

	private MedicinaGeneral medicoCabecera;
	private ExpedienteMedico expedienteMedico;
        
        public Paciente(){};
        
        public Paciente(String nombre, String apellido, int cedula, String correoElectronico){
           
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
            this.correoElectronico = correoElectronico;
            
        } 
        
        
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
