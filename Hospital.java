import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private Receptionist receptionist;

    
    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.receptionist = new Receptionist();
    }

    
    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    public void dischargePatient(Patient patient) {
        patients.remove(patient);
    }

    
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
}
