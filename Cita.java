
public abstract class Cita implements InformeImpreso{
    
	private String fecha;
	private String hora;

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
