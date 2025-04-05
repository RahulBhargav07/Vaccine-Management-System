package src.vaccination.system.entities;

public class Nurse extends Person {
    private String shift;

    public Nurse(String name, int age, String id, String shift) {
        super(name, age, id);
        if (shift == null || shift.trim().isEmpty()) {
            throw new IllegalArgumentException("Shift cannot be empty");
        }
        this.shift = shift;
    }

    // ... (existing methods remain the same)

    @Override
    public String toString() {
        return super.toString() + " [Shift: " + shift + "]";
    }
}