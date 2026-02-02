package animalHospital.src.main.java.com.hospital;

import java.time.LocalDate;

class AnimalPatient {
    String name;
    String type;      // 고양이, 앵무새, 큰개, 작은개, 토끼
    String idNumber;
    LocalDate admissionDate;
    Doctor assignedDoctor;
    LocalDate dischargeDate;
    Owner owner;
    int visitCount;   // 금일 면회 횟수

    AnimalPatient(String name, String type, String idNumber, Owner owner, Doctor doctor) {
        this.name = name;
        this.type = type;
        this.idNumber = idNumber;
        this.owner = owner;
        this.assignedDoctor = doctor;
        this.admissionDate = LocalDate.now();
        this.visitCount = 0;
    }
}