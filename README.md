# Vaccine-Management-System

A Java application for managing vaccination facilities, medical staff, patients, and vaccination records.

## Features

- **Facility Management**: Track vaccination centers, hospitals, and clinics
- **Personnel Management**: Manage doctors and nurses
- **Patient Records**: Store patient information and medical history
- **Vaccination Tracking**: Record vaccine administration and appointments
- **Data Persistence**: Save and load system data to/from files

## Class Structure

### Main Components

1. **Facilities Package**:
   - `Vaccinable` (Interface)
   - `AbstractVaccinationSite` (Abstract class)
   - `VaccinationCenter`, `Hospital`, `Clinic` (Concrete implementations)

2. **Entities Package**:
   - `Person` (Base class)
   - `Patient`, `Doctor`, `Nurse` (Subclasses)
   - `Vaccine`, `VaccinationRecord`, `Appointment`

3. **Exceptions Package**:
   - `VaccinationException` (Custom exception)

4. **Utils Package**:
   - `FileUtils` (File I/O operations)

5. **Main Classes**:
   - `VaccinationManagementSystem` (Core system logic)
   - `VaccinationSystemApp` (Main application class)

## How to Use

1. **Running the Application**:
   ```bash
   javac vaccination/system/VaccinationSystemApp.java
   java vaccination.system.VaccinationSystemApp
