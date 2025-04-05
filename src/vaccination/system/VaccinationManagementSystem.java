package src.vaccination.system;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import src.vaccination.system.entities.*;
import src.vaccination.system.facilities.*;
import src.vaccination.system.utils.FileUtils;

public class VaccinationManagementSystem {
    private List<AbstractVaccinationSite> vaccinationSites;
    private List<Person> medicalStaff;
    private List<Patient> patients;
    private List<Vaccine> vaccines;
    private List<VaccinationRecord> records;

    public VaccinationManagementSystem() {
        vaccinationSites = new ArrayList<>();
        medicalStaff = new ArrayList<>();
        patients = new ArrayList<>();
        vaccines = new ArrayList<>();
        records = new ArrayList<>();
    }

    public List<AbstractVaccinationSite> getVaccinationSites() {
        return vaccinationSites;
    }

    public void addVaccinationSite(AbstractVaccinationSite site) {
        vaccinationSites.add(site);
    }

    public void addMedicalStaff(Person staff) {
        medicalStaff.add(staff);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addVaccine(Vaccine vaccine) {
        vaccines.add(vaccine);
    }

    public void addRecord(VaccinationRecord record) {
        records.add(record);
    }

    public void generateReport() {
        System.out.println("\n=== System Report ===");
        System.out.println("Vaccination Sites: " + vaccinationSites.size());
        System.out.println("Medical Staff: " + medicalStaff.size());
        System.out.println("Patients: " + patients.size());
        System.out.println("Vaccines: " + vaccines.size());
        System.out.println("Records: " + records.size());
    }

    public void saveDataToFile(String filename) throws IOException {
        StringBuilder data = new StringBuilder();
        data.append("=== Vaccination System Data ===\n\n");
        
        data.append("Vaccination Sites:\n");
        for (AbstractVaccinationSite site : vaccinationSites) {
            data.append("- ").append(site).append("\n");
        }
        
        data.append("\nMedical Staff:\n");
        for (Person staff : medicalStaff) {
            data.append("- ").append(staff).append("\n");
        }
        
        data.append("\nPatients:\n");
        for (Patient patient : patients) {
            data.append("- ").append(patient).append("\n");
        }
        
        data.append("\nVaccines:\n");
        for (Vaccine vaccine : vaccines) {
            data.append("- ").append(vaccine).append("\n");
        }
        
        data.append("\nRecords:\n");
        for (VaccinationRecord record : records) {
            data.append("- ").append(record).append("\n");
        }
        
        FileUtils.saveToFile(filename, data.toString());
    }
}