import java.util.ArrayList;

public class Receptionist {
    private ArrayList<Appointment> appointments;
    private ArrayList<Patient> patients;

    public Receptionist() {
        this.appointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    
    public void scheduleAppointment(Patient patient, Doctor doctor, String date, String time) {
        int appointmentId = generateAppointmentId();

        Appointment appointment = new Appointment(appointmentId, date, time, patient, doctor);
        appointments.add(appointment);
    }

    
    public String viewAppointments() {
        StringBuilder result = new StringBuilder();
        for (Appointment appointment : appointments) {
            result.append(appointment.getDetails()).append("\n------------------------------\n");
        }
        return result.toString();
    }

    
    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    
    public void viewAdmittedPatients() {
        for (Patient patient : patients) {
            System.out.println(patient.getDetails());
            System.out.println("------------------------------");
        }
    }

    private int generateAppointmentId() {
        return appointments.size() + 1;
    }
}
