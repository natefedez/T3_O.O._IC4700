package natanfdecastro.tarea3oo_lenguajes;

/**
 *
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion
 * Kevin Rojas - Natan Fernandez
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MedicinaGeneral a = new MedicinaGeneral();
                
                Medico doctor1 = new Especialista("Juan", "Perez", 117200930, "juanperez@medicomail.com");
                
                doctor1.getNombre();
		
		
		
	}

}
