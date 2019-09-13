
public class Cita {
	private Paciente paciente;
	private Medico medico;
	private String fecha;
	private String hora;
	
	public Cita(Paciente paciente, Medico medico, String fecha, String hora) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.hora = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}
	
	
}
