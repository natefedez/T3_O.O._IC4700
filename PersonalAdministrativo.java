/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

import java.util.ArrayList;

public class PersonalAdministrativo extends Usuario {
		
	
	
	public PersonalAdministrativo(String nombre, String apellido, int cedula, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correoElectronico = correo;
		
	}

	private ArrayList<Cita> accederAgenda (Medico medico){
		return medico.getAgenda();
	}
	
	private ArrayList<Cita> accederAgendaPaciente (Paciente paciente){
		return paciente.getAgenda();
	}
        
    @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase PersonalAdministrativo
    public String impInforme(){
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de agenda para Paciente y Medico de PersonalAdministrativo
    
        return "Nombre personal administrativo: " + this.getNombre() + // Retorna atributo nombre de objeto en Usuario
        "\n Apellido personal administrativo: " + this.getApellido()+ // Retorna atributo apellido de objeto en Usuario
        "\n Cédula personal administrativo: " + this.getCedula()+     // Retorna atributo cedula de objeto en Usuario
        "\n Correo Eletrónico: " + this.getCorreoElectronico(); // Retorna atributo Correo Electronico de objeto en Usuario
        
    }
};
