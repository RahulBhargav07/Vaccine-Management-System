package src.vaccination.system.facilities;

import src.vaccination.system.exceptions.*;

public class Clinic extends AbstractVaccinationSite implements Vaccinable {
    private boolean isPrivate;

    public Clinic(String name, String location, boolean isPrivate) {
        super(name, location);
        this.isPrivate = isPrivate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clinic: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Type: " + (isPrivate ? "Private" : "Public"));
    }

    @Override
    public void vaccinate() throws VaccinationException {
        if (isPrivate) {
            System.out.println("Private clinic vaccination at " + getName() + " (may require payment)");
        } else {
            System.out.println("Public clinic vaccination at " + getName());
        }
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type: " + (isPrivate ? "Private" : "Public") + "]";
    }
}