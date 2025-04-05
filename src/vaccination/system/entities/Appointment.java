package src.vaccination.system.entities;

import java.util.Objects;

import src.vaccination.system.facilities.AbstractVaccinationSite;

public class Appointment {
    private String date;
    private String time;
    private AbstractVaccinationSite location;

    public Appointment(String date, String time, AbstractVaccinationSite location) {
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException("Date cannot be empty");
        }
        if (time == null || time.trim().isEmpty()) {
            throw new IllegalArgumentException("Time cannot be empty");
        }
        this.date = date;
        this.time = time;
        this.location = Objects.requireNonNull(location, "Location cannot be null");
    }

    // ... (existing methods remain the same)

    @Override
    public String toString() {
        return "Appointment at " + location.getName() + " on " + date + " at " + time;
    }
}