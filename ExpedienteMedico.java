import java.util.ArrayList;

public class ExpedienteMedico {
	private ArrayList<Cita> historialCitas;
	private ArrayList<String> padecimientos;
	private ArrayList<String> medicamentos;
	
	public ExpedienteMedico() {
		historialCitas = new ArrayList<Cita>();
		padecimientos = new ArrayList<String>();
		medicamentos = new ArrayList<String>();
	}
	
	public ArrayList<Cita> getHistorialCitas() {
		return historialCitas;
	}
	
	public void addCita(Cita cita) {
		historialCitas.add(cita);
	}
	
	public ArrayList<String> getPadecimientos() {
		return padecimientos;
	}
	public void setPadecimientos(ArrayList<String> padecimientos) {
		this.padecimientos = padecimientos;
	}
	public ArrayList<String> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(ArrayList<String> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}
