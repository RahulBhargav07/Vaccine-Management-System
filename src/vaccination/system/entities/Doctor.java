package src.vaccination.system.entities;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String id, String specialization) {
        super(name, age, id);
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
        this.specialization = specialization;
    }

    // ... (existing methods remain the same)

    @Override
    public String toString() {
        return super.toString() + " [Specialization: " + specialization + "]";
    }
}