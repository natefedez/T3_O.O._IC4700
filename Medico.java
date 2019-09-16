
import java.util.ArrayList;

public abstract class Medico extends Usuario {
    public ArrayList<Cita> citas = new ArrayList<Cita>();
    public int numeroIndicador;
    
    public Medico(){};
    
    public Medico(String nombre, String apellido, int cedula, String correoElectronico){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
    
    }
    
    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }
    public int getCedula(){ return cedula; }
    public String getCorreoElectronico(){ return correoElectronico; }
    
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
