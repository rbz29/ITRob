public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String contactInfo;

    
    public Patient(int patientId, String name, int age, String contactInfo) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }


    public String getDetails() {
        return "Patient ID: " + patientId +
                "\nName: " + name +
                "\nAge: " + age +
                "\nContact Info: " + contactInfo;
    }
}


