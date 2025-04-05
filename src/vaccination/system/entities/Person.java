package src.vaccination.system.entities;

public class Person {
    protected String name;
    protected int age;
    protected String id;

    public Person(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty");
        }
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // ... (existing getters remain the same)

    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + " (ID: " + id + ")";
    }
}