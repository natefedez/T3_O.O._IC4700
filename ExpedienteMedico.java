package natanfdecastro.tarea3oo_lenguajes;
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
        
        // Implementación de interfaz imprimir informe
        // Retorna String de datos de ExpedienteMedico de Paciente
        
        return "Expediente";
        
    };
	
}
