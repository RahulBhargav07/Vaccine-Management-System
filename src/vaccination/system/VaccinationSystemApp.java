package src.vaccination.system;

import src.vaccination.system.entities.*;
import src.vaccination.system.exceptions.*;
import src.vaccination.system.facilities.*;

public class VaccinationSystemApp {
    public static void main(String[] args) {
        try {
            VaccinationManagementSystem system = new VaccinationManagementSystem();
            
            // Create and add vaccines
            Vaccine pfizer = new Vaccine("Pfizer-BioNTech", "Pfizer", 2);
            Vaccine moderna = new Vaccine("Moderna", "Moderna Inc.", 2);
            system.addVaccine(pfizer);
            system.addVaccine(moderna);
            
            // Create and add medical staff
            Doctor drSmith = new Doctor("John Smith", 45, "DOC123", "Immunology");
            Nurse nurseBrown = new Nurse("Sarah Brown", 32, "NUR456", "Morning");
            system.addMedicalStaff(drSmith);
            system.addMedicalStaff(nurseBrown);
            
            // Create and add patients
            String[] history1 = {"Allergies: None", "Conditions: None"};
            String[] history2 = {"Allergies: Penicillin", "Conditions: Asthma"};
            Patient patient1 = new Patient("Alice Johnson", 30, "PAT789", history1);
            Patient patient2 = new Patient("Bob Williams", 17, "PAT012", history2);
            system.addPatient(patient1);
            system.addPatient(patient2);
            
            // Create and add vaccination facilities
            VaccinationCenter center = new VaccinationCenter("City Vaccination Hub", "Main Square", 100);
            Hospital hospital = new Hospital("General Hospital", "North District", 250);
            Clinic clinic = new Clinic("Community Clinic", "West District", false);
            system.addVaccinationSite(center);
            system.addVaccinationSite(hospital);
            system.addVaccinationSite(clinic);
            
            // Create and add records
            VaccinationRecord record1 = new VaccinationRecord(patient1, pfizer, "2023-05-15");
            system.addRecord(record1);
            
            // Generate report
            system.generateReport();
            
            // Save data
            system.saveDataToFile("vaccination_data.txt");
            
            // Demonstrate operations
            demonstrateOperations(system);
            
        } catch (Exception e) {
            System.err.println("System error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static void demonstrateOperations(VaccinationManagementSystem system) {
        System.out.println("\n=== Demonstration of Operations ===");
        
        // Get first vaccination site
        AbstractVaccinationSite site = system.getVaccinationSites().get(0);
        System.out.println("First vaccination site: " + site.getName());
        
        // Try vaccinating
        try {
            if (site instanceof Vaccinable) {
                ((Vaccinable)site).vaccinate();
            }
        } catch (VaccinationException e) {
            System.out.println("Vaccination failed: " + e.getMessage());
        }
    }
}