package src.vaccination.system.facilities;

public abstract class AbstractVaccinationSite {
    protected String name;
    protected String location;

    public AbstractVaccinationSite(String name, String location) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }
        this.name = name;
        this.location = location;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + " (" + location + ")";
    }
}