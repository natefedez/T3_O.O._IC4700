package natanfdecastro.tarea3oo_lenguajes;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class CitaMedico extends Cita{
    
    // Clase CitaMedico hereda atributos de clase abstracta Cita
    
    private Medico medico; // Atributo privado medico

    public CitaMedico(Medico medico, String fecha, String Hora){
        
        //Constructor objeto CitaMedico
        
        super(); // Extiende contruccion de atributos en Clase Cita
	this.setInfo("", ""); // Asigna los atributos Fecha y Hora provenientes de Cita a CitaMedico
        this.medico = medico; // Asigna medico al objeto
                
    }
    public Medico getMedico(){ return medico; } // get para atributo medico en CitaMedico
    
    @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase CitaPaciente
    public String impInforme(){
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de CitaPaciente
        
        return "Nombre Paciente: " + this.getMedico() + // Retorna atributo nombre de objeto en CitaMedico
               "Fecha Cita: " + this.getFecha() +       // Retorna atributo Fecha de objeto en CitaMedico 
               "Hora Cita: " + this.getHora();          // Retorna atributo Hora de objeto en CitaMedico
         
    };   
}
