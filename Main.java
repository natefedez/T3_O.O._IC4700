
/**
 *
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion
 * Kevin Rojas - Natan Fernandez
 */

public class Main {
    
        //Clase principal

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico a = new MedicinaGeneral();
                
                Medico doctor1 = new Medico("Juan", "Perez", 117200930, "juanperez@medicomail.com");
                
                System.out.println(doctor1.getNombre());
                
                //doctor1.referir();
		
		
		
	}

}
