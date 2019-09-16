import java.util.ArrayList;
/**
 * Instituto Tecnológico de Costa Rica
 * Tarea 3 Programacion Orientada a Objetos 
 * Lenguajes de Programacion - Hospital
 * Kevin Rojas (2016081582) - Natan Fernandez (2017105774)
 */

public class ExpedienteMedico implements InformeImpreso{
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
	
	public void addPadecimientos(String padecimiento) {
		padecimientos.add(padecimiento);
	}
	
	public void addMedicamentos(String medicamento) {
		medicamentos.add(medicamento);
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

    @Override // Se sobreescribe método impInforme para interfaz InformeImpreso para clase CitaPaciente
    public String impInforme(){

    	String informe = "Informe de Expediente Medico: \n";
    	informe = informe + "[Historial de Citas] \n";
    	for(int i = 0; i < historialCitas.size() ; ++i) informe = informe + "\n [Cita #" + i + "] "+ historialCitas.get(i) ;
    	
    	informe = informe + "\n\n[Padecimientos] \n";
    	for(int i = 0; i < padecimientos.size() ; ++i) informe = informe + "\n [Padecimiento #" + i + "] "+ padecimientos.get(i);
    	
    	informe = informe + "\n\n[Medicamentos] \n";
    	for(int i = 0; i < medicamentos.size() ; ++i) informe = informe + "\n [Medicamiento #" + i + "] "+ medicamentos.get(i);
    	
        return informe;
        
    };
	
}
