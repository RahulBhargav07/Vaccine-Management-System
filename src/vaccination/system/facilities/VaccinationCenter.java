package src.vaccination.system.facilities;

import src.vaccination.system.exceptions.*;

public class VaccinationCenter extends AbstractVaccinationSite implements Vaccinable {
    private int capacity;

    public VaccinationCenter(String name, String location, int capacity) {
        super(name, location);
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vaccination Center: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Daily Capacity: " + capacity);
    }

    @Override
    public void vaccinate() throws VaccinationException {
        if (capacity <= 0) {
            throw new VaccinationException("No vaccination capacity available at " + getName());
        }
        System.out.println("Vaccination performed at " + getName());
        capacity--;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " [Capacity: " + capacity + "]";
    }
}