package natanfdecastro.tarea3oo_lenguajes;

public class CitaMedico extends Cita{
    
    private Medico medico;

    public CitaMedico(Medico medico, String fecha, String Hora){
        
        super();
	this.setInfo("", "");
        this.medico = medico;
                
    }
    public Medico getMedico(){ return medico; }
    
    @Override
    public String impInforme(){
        
        return "Nombre Paciente: " + this.getMedico() +
               "Fecha Cita: " + this.getFecha() +
               "Hora Cita: " + this.getHora();
         
    };   
}
