import javax.swing.JOptionPane;

public class hospitalmanagementsystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Receptionist receptionist = hospital.getReceptionist();

        try {
            String[] options = {"Make an appointment", "Remove an appointment", "View an appointment", "Exit"};

            while (true) {
                int choice = JOptionPane.showOptionDialog(
                        null,
                        "Welcome To Our Health Care Department\nHere to make an appointment?",
                        "Health Care System",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]
                );

                switch (choice) {
                    case 0:
                        makeAppointment(hospital, receptionist);
                        break;
                    case 1:
                        removeAppointment(receptionist);
                        break;
                    case 2:
                        viewAppointment(receptionist);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Exiting the Health Care System. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }

    private static void makeAppointment(Hospital hospital, Receptionist receptionist) {
        JOptionPane.showMessageDialog(null, "Enter patient information:");

        String patientIdStr = JOptionPane.showInputDialog("Patient ID:");
        int patientId = Integer.parseInt(patientIdStr);

        String patientName = JOptionPane.showInputDialog("Patient Name:");

        String patientAgeStr = JOptionPane.showInputDialog("Patient Age:");
        int patientAge = Integer.parseInt(patientAgeStr);

        String contactInfo = JOptionPane.showInputDialog("Contact Info:");

        Patient newPatient = new Patient(patientId, patientName, patientAge, contactInfo);

        String availableDoctorsMessage = "Available Doctors:\n1. Surgeon\n2. Medicine Doctor\n3. LabExaminer";
        JOptionPane.showMessageDialog(null, availableDoctorsMessage);

        String doctorChoiceStr = JOptionPane.showInputDialog("Enter the number corresponding to the doctor's specialization:");
        int doctorChoice = Integer.parseInt(doctorChoiceStr);
        Doctor selectedDoctor;

        switch (doctorChoice) {
            case 1:
                selectedDoctor = new Surgeon(101, "Dr. Smith");
                break;
            case 2:
                selectedDoctor = new MedicineDoctor(102, "Dr. Johnson");
                break;
            case 3:
                selectedDoctor = new LabExaminer(103, "Dr. James");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice. Exiting...");
                return;
        }

        String appointmentDate = JOptionPane.showInputDialog("Enter date for the appointment (YYYY-MM-DD):");
        String appointmentTimeString = JOptionPane.showInputDialog("Enter the time (hh:mm):");

        receptionist.scheduleAppointment(newPatient, selectedDoctor, appointmentDate, appointmentTimeString);

        String scheduledAppointmentMessage = "Scheduled Appointment:\n" + receptionist.viewAppointments();
        JOptionPane.showMessageDialog(null, scheduledAppointmentMessage);
    }

    private static void removeAppointment(Receptionist receptionist) {
        JOptionPane.showMessageDialog(null, "Removing an appointment.");
    }

    private static void viewAppointment(Receptionist receptionist) {
        JOptionPane.showMessageDialog(null, "Viewing an appointment... should be showing here");
    }
}
