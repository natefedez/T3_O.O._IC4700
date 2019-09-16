package natanfdecastro.tarea3oo_lenguajes;


public abstract class Cita implements InformeImpreso{
    
	protected String fecha;
	protected String hora;

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}
	
	public void setInfo(String fecha, String hora) {
		this.fecha = fecha;
		this.hora = hora;
	}
	
}
