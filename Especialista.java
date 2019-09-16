/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class Especialista extends Medico {
	
	private Especialidad tipoEspecialidad;
	
    public Especialista(String nombre, String apellido, int cedula, String correoElectronico, Especialidad tipoEspecialidad) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.tipoEspecialidad = tipoEspecialidad;
        
    }
    
    public Especialidad getEspecialidad(){ return tipoEspecialidad; }
    @Override
    public String getNombre(){ return nombre; }
    @Override
    public String getApellido(){ return apellido; }
    @Override
    public int getCedula(){ return cedula; }
    @Override
    public String getCorreoElectronico(){ return correoElectronico; }

     @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase CitaPaciente
    public String impInforme(){
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de Especialista
        
        return "Nombre Especialista: " + this.getNombre() + " " + this.getApellido() +  // Retorna atributo nombre de objeto en Especialista
               "Tipo Especialidad: " + this.getEspecialidad() + // Retorna atributo Especialidad de objeto en Espealista 
               "Cedula Especialista: " + this.getCedula() +     // Retorna atributo cedula de objeto en Especialista
               "Correo Electrónico Especialista: " + this.getCorreoElectronico(); // Retorna atributo Correo Electronico de objeto en Especialista
         
    }; 
	
}
