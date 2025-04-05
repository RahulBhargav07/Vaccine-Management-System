package src.vaccination.system.entities;

import java.util.Objects;

public class VaccinationRecord {
    private Patient patient;
    private Vaccine vaccine;
    private String date;

    public VaccinationRecord(Patient patient, Vaccine vaccine, String date) {
        this.patient = Objects.requireNonNull(patient, "Patient cannot be null");
        this.vaccine = Objects.requireNonNull(vaccine, "Vaccine cannot be null");
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException("Date cannot be empty");
        }
        this.date = date;
    }

    // ... (existing methods remain the same)

    @Override
    public String toString() {
        return patient.getName() + " vaccinated with " + vaccine.getName() + " on " + date;
    }
}