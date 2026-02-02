import java.time.LocalDate;

import java.time.LocalDate;

// 부모 클래스: 모든 동물의 공통 속성
class Animal {
    String name;
    String idNumber;
    LocalDate admissionDate;
    Doctor assignedDoctor;
    LocalDate dischargeDate;
    Owner owner;
    int visitCount;

    Animal(String name, String idNumber, Owner owner, Doctor doctor) {
        this.name = name;
        this.idNumber = idNumber;
        this.owner = owner;
        this.assignedDoctor = doctor;
        this.admissionDate = LocalDate.now();
        this.visitCount = 0;
    }
}

