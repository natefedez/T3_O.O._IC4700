import java.util.ArrayList;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class MedicinaGeneral extends Medico {

    public MedicinaGeneral(String nombre, String apellido, int cedula, String correoElectronico) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        
    }
	
	public Cita pedirCita(Paciente paciente, String hora, String fecha) {
		return asignarCita(paciente, hora, fecha);
	}
	
	public boolean consultarAgenda(String hora, String fecha, Medico medico) {
		return medico.citaReservada(hora, fecha);
	}
	
	public Cita referir(Especialista medico, Paciente paciente, String hora, String fecha) {
		return medico.asignarCita(paciente, hora, fecha);
	}
	
	public ArrayList<Cita> accederAgenda(Medico medico) {
		return medico.getAgenda();
	}

   @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase CitaPaciente
   public String impInforme(){
	   
       // Implementación de interfaz imprimir informe
       // Retorna String de datos de Especialista
    	
       return "Nombre Medico General: " + this.getNombre() + " " + this.getApellido()  +   // Retorna atributo nombre de objeto en MedicoGeneral
              "\n Cedula MedicoGeneral: " + this.getCedula() +     // Retorna atributo cedula de objeto en MedicoGeneral
              "\n Correo Electronico MedicoGeneral: " + this.getCorreoElectronico(); // Retorna atributo Correo Electronico de objeto en MedicoGeneral
        	
   }; 


	
}
