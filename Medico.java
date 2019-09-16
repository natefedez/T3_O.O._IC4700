/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

import java.util.ArrayList;

public abstract class Medico extends Usuario {
    public ArrayList<Cita> citas = new ArrayList<Cita>();
    public int numeroIndicador;
    
    
    public Cita asignarCita(Paciente paciente, String hora, String fecha) {
    	
    	if(citaReservada(hora, fecha)) {
    		CitaPaciente nuevaCita = new CitaPaciente(paciente, fecha, hora);
    		citas.add(nuevaCita);
    		return nuevaCita;
    	} else {
    		return null;
    	}
    }
    
    public ArrayList<Cita> getAgenda(){ // get que retorna citas en lista Agenda
    	return (ArrayList<Cita>) citas.clone(); // clone?
    }
    
    public boolean citaReservada(String hora, String fecha) {
    	//Determina si una exista ya existe en la agenda
    	return true;
    }

}
