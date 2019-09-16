

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
    
    
    @Override
    public String getNombre(){ return nombre; }
    @Override
    public String getApellido(){ return apellido; }
    @Override
    public int getCedula(){ return cedula; }
    @Override
    public String getCorreoElectronico(){ return correoElectronico; }
	
}
