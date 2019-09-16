import java.util.ArrayList;

/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */
 

public class Main {
    
        //Clase principal

	public static void main(String[] args) {
		
		
		ArrayList<Medico> empleadosMedico = new ArrayList<Medico>();
		
		
		Especialista medico1 = new Especialista("Juan", "Perez", 117200930, "juanperez@medicomail.com", Especialidad.ALERGOLOGO);
		MedicinaGeneral medicoGeneral1 = new MedicinaGeneral("Pedro", "Perez", 20016518, "pedroperez@medicomail.com");

		
		empleadosMedico.add(medicoGeneral1);
		empleadosMedico.add(medico1);
		
		
		for(int i = 0; i < empleadosMedico.size() ; ++i) System.out.println(empleadosMedico.get(i).impInforme());
		
		
	}

}
