public class Appointment {
    private int appointmentId;
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;

    
    public Appointment(int appointmentId, String date, String time, Patient patient, Doctor doctor) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }

    
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String geTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    public String getDetails() {
        return "Appointment ID: " + appointmentId +
                "\nDate: " + date +
                "\nTime: " + time +
                "\nPatient: " + patient.getName() +
                "\nDoctor: " + doctor.getName() +
                "\nDoctor Specialization: " + doctor.getSpecialization();
    }
}
