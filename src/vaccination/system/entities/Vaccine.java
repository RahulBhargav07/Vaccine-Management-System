package src.vaccination.system.entities;

public class Vaccine {
    private String name;
    private String manufacturer;
    private int dosesRequired;

    public Vaccine(String name, String manufacturer, int dosesRequired) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Vaccine name cannot be empty");
        }
        if (manufacturer == null || manufacturer.trim().isEmpty()) {
            throw new IllegalArgumentException("Manufacturer cannot be empty");
        }
        if (dosesRequired <= 0) {
            throw new IllegalArgumentException("Doses required must be positive");
        }
        this.name = name;
        this.manufacturer = manufacturer;
        this.dosesRequired = dosesRequired;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDosesRequired() {
        return dosesRequired;
    }

    public void displayInfo() {
        System.out.println("Vaccine: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Doses Required: " + dosesRequired);
    }

    @Override
    public String toString() {
        return name + " by " + manufacturer + " (" + dosesRequired + " doses)";
    }
}