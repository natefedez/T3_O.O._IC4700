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
		ArrayList<PersonalAdministrativo> empleadosAdministrativos = new ArrayList<PersonalAdministrativo>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		
		
		Especialista medico1 = new Especialista("Juan", "Perez", 117200930, "juanperez@medicomail.com", Especialidad.ALERGOLOGO);
		MedicinaGeneral medicoGeneral1 = new MedicinaGeneral("Pedro", "Perez", 20016518, "pedroperez@medicomail.com");

		
		empleadosMedico.add(medicoGeneral1);
		empleadosMedico.add(medico1);
		
		Paciente paciente1 = new Paciente("Nombre", "Apellido", 20519, "correo@correos.com");
		
		ExpedienteMedico expediente1 = new ExpedienteMedico();
		expediente1.addCita( new CitaPaciente(paciente1, "7/2", "10:00"));
		expediente1.addCita( new CitaPaciente(paciente1, "8/2", "10:00"));
		expediente1.addCita( new CitaPaciente(paciente1, "9/2", "10:00"));
		expediente1.addCita( new CitaPaciente(paciente1, "10/2", "10:00"));
		
		expediente1.addMedicamentos("Medicamento 1");
		expediente1.addMedicamentos("Medicamento 2");
		expediente1.addMedicamentos("Medicamento 3");
		expediente1.addMedicamentos("Medicamento 4");
		
		expediente1.addPadecimientos("Padecimiento 1");
		expediente1.addPadecimientos("Padecimiento 2");
		
		paciente1.addExpedienteMedico(expediente1);
		
		pacientes.add(paciente1);
		
		PersonalAdministrativo personal1 = new PersonalAdministrativo("Administrador", "Nuevo", 20519, "correoAdministrativo@correos.com");
		empleadosAdministrativos.add(personal1);
		
		
		for(int i = 0; i < empleadosMedico.size() ; ++i) System.out.println("\n" + empleadosMedico.get(i).impInforme());
		for(int i = 0; i < pacientes.size() ; ++i) System.out.println("\n" + pacientes.get(i).impInforme());
		for(int i = 0; i < empleadosAdministrativos.size() ; ++i) System.out.println("\n" + empleadosAdministrativos.get(i).impInforme());
		
		
	}

}
