package natanfdecastro.tarea3oo_lenguajes;
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

    @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase Medico
    public String impInforme(){
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de Medico
        
        return "Nombre Medico: " + this.getNombre() + // Retorna atributo nombre de objeto en Medico
        ", Apellido Paciente: " + this.getApellido()+ // Retorna atributo apellido de objeto en Medico
        ", Cédula Paciente: " + this.getCedula()+     // Retorna atributo cedula de objeto en Medico
        ", Correo Eletrónico: " + this.getCorreoElectronico(); // Retorna atributo Correo Electronico de objeto en Medico
        
        };     
    
}
