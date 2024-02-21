public class LabExaminer extends Doctor {
    public LabExaminer(int doctorId, String name) {
        super(doctorId, name, "Lab Examiner");
    }

    @Override
    public String performDuties() {
        return "Conducting lab tests";
    }
}
