package natanfdecastro.tarea3oo_lenguajes;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public abstract class Usuario implements InformeImpreso {
    
    // Clase abstracta Usuario utilizada como Padre para las clases hijas Medico, Paciente y Personal Administrativo
    
    protected String nombre; // Atributo nombre para usuario
    protected String apellido; // Atributo nombre para apellido
    protected int cedula; // Atributo nombre para cedula
    protected String correoElectronico; // Atributo nombre para correoElectronico
    
}

