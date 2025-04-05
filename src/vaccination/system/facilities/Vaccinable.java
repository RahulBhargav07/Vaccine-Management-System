package src.vaccination.system.facilities;

import src.vaccination.system.exceptions.VaccinationException;

public interface Vaccinable {
    void vaccinate() throws VaccinationException;
}