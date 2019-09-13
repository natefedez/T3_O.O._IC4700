import java.util.ArrayList;

public class ExpedienteMedico {
	private ArrayList<Cita> historialCitas;
	private ArrayList<String> padecimientos;
	private ArrayList<String> medicamentos;
	
	
	public ArrayList<Cita> getHistorialCitas() {
		return historialCitas;
	}
	public void setHistorialCitas(ArrayList<Cita> historialCitas) {
		this.historialCitas = historialCitas;
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
