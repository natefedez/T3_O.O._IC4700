package natanfdecastro.tarea3oo_lenguajes;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class CitaPaciente extends Cita{
    
    // Clase CitaMedico hereda atributos de clase abstracta Cita
    
    private Paciente paciente; // Atributo privado paciente
    
    CitaPaciente(Paciente paciente, String fecha, String hora){
        
        //Constructor objeto CitaMedico
        
        super(); // Extiende contruccion de atributos en Clase Cita
        this.setInfo("", ""); // Asigna los atributos Fecha y Hora provenientes de Cita a CitaMedico
        this.paciente = paciente; // Asigna paciente al objeto
    
    }
    
    public Paciente getPaciente(){ return paciente; } // get que retorna paciente
    
    @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase CitaPaciente
    public String impInforme(){
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de CitaPaciente
        
        return "Nombre Paciente: " + this.getPaciente() + // Retorna atributo nombre de objeto en CitaPaciente
               "Fecha Cita: " + this.getFecha() +         // Retorna atributo Fecha de objeto en CitaPaciente
               "Hora Cita: " + this.getHora();            // Retorna atributo Hora de objeto en CitaPaciente
         
    };    

    
}
