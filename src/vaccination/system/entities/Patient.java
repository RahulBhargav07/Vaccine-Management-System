package src.vaccination.system.entities;

import src.vaccination.system.facilities.Vaccinable;
import src.vaccination.system.exceptions.VaccinationException;

public class Patient extends Person implements Vaccinable {
    private String[] medicalHistory;

    public Patient(String name, int age, String id, String[] medicalHistory) {
        super(name, age, id);
        this.medicalHistory = medicalHistory != null ? medicalHistory : new String[0];
    }

    public String getName(){
        return name;
    }

    public void displayMedicalHistory() {
        System.out.println("Medical History for " + name + ":");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    @Override
    public void vaccinate() throws VaccinationException {
        if (age < 18) {
            throw new VaccinationException("Patient " + name + " is too young for vaccination");
        }
        System.out.println(name + " has been vaccinated");
    }

    public String[] getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public String toString() {
        return super.toString() + " [Medical Records: " + medicalHistory.length + "]";
    }
}