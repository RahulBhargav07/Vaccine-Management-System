package src.vaccination.system.facilities;

import src.vaccination.system.exceptions.*;

public class Hospital extends AbstractVaccinationSite implements Vaccinable {
    private int beds;

    public Hospital(String name, String location, int beds) {
        super(name, location);
        if (beds < 0) {
            throw new IllegalArgumentException("Bed count cannot be negative");
        }
        this.beds = beds;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hospital: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Available Beds: " + beds);
    }

    @Override
    public void vaccinate() throws VaccinationException {
        if (beds < 10) {
            throw new VaccinationException("Not enough beds for vaccination at " + getName());
        }
        System.out.println("Hospital vaccination performed at " + getName());
    }

    public int getBeds() {
        return beds;
    }

    @Override
    public String toString() {
        return super.toString() + " [Beds: " + beds + "]";
    }
}