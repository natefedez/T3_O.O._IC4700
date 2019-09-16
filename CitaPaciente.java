package natanfdecastro.tarea3oo_lenguajes;


public class CitaPaciente extends Cita{
    
    private Paciente paciente;
    
    CitaPaciente(Paciente paciente, String fecha, String hora){
        
        super();
        this.setInfo("", "");
        this.paciente = paciente;
    
    }
    
    public Paciente getPaciente(){ return paciente; }
    
    @Override
    public String impInforme(){
        
        return "Nombre Paciente: " + this.getPaciente() +
               "Fecha Cita: " + this.getFecha() +
               "Hora Cita: " + this.getHora();
         
    };    

    
}
