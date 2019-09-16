/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

import java.util.ArrayList;

public class PersonalAdministrativo extends Usuario {
		
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
    
        //listaAgenda.forEach((cita) -> {
        
            return "Agenda";
    
    };
}
