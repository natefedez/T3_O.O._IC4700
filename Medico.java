package natanfdecastro.tarea3oo_lenguajes;
import java.util.ArrayList;

public abstract class Medico extends Usuario{
    protected ArrayList<Cita> citas = new ArrayList<Cita>();
    protected int numeroIndicador;
    
    public Cita asignarCita(Paciente paciente, String hora, String fecha) {
    	
    	if(citaReservada(hora, fecha)) {
    		Cita nuevaCita = new Cita(paciente, this, fecha, hora);
    		citas.add(nuevaCita);
    		return nuevaCita;
    	} else {
    		return null;
    	}
    }
    
    public ArrayList<Cita> getAgenda(){
    	return (ArrayList<Cita>) citas.clone();
    }
    
    public boolean citaReservada(String hora, String fecha) {
    	//Determina si una exista ya existe en la agenda
    	return true;
    }
    
}
