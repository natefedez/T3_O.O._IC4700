package natanfdecastro.tarea3oo_lenguajes;

public class Especialista extends Medico {
	
	private Especialidad tipoEspecialidad;
	
	public Especialista (Especialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}

    public Especialista(String nombre, String apellido, int cedula, String correoElectronico) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        
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

     @Override
    public String impInforme(){
        
        return "Nombre Especialista: " + this.getNombre() +
               "Tipo Especialidad: " + this.getEspecialidad() +
               "Cedula Especialista: " + this.getCedula() +
               "Correo Electrónico Especialista: " + this.getCorreoElectronico();
         
    }; 
	
}
