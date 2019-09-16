/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

import java.util.ArrayList;

public class Paciente extends Usuario {

	private MedicinaGeneral medicoCabecera;
	private ExpedienteMedico expedienteMedico;
        
        public Paciente(){};
        
        public Paciente(String nombre, String apellido, int cedula, String correoElectronico){
            
            // Constructor para objeto paciente
           
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
            this.correoElectronico = correoElectronico;
            
        } 
        
        public String getNombre(){ return nombre; }
        public String getApellido(){ return apellido; }
        public int getCedula(){ return cedula; }
        public String getCorreoElectronico(){ return correoElectronico; }
        
        
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
        
        @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase Paciente
        public String impInforme(){
            
           // Implementación de interfaz imprimir informe
           // Retorna String de datos de Paciente
        
            return "Nombre Paciente: " + this.getNombre() + // Retorna atributo nombre de objeto en Paciente
           ", Apellido Paciente: " + this.getApellido()+    // Retorna atributo apellido de objeto en Paciente
           ", Cédula Paciente: " + this.getCedula()+        // Retorna atributo cedula de objeto en Paciente
           ", Correo Eletrónico: " + this.getCorreoElectronico(); // Retorna atributo correo Electronico de objeto en Paciente
        
        };        
	
}
