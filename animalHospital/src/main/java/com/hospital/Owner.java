package animalHospital.src.main.java.com.hospital;

class Owner {
    String name;

    Owner(String name) {
        this.name = name;
    }

    // 주인이 면회를 신청하는 행위
    void requestVisit(AnimalPatient patient, Hospital hospital) {
        hospital.processVisitation(this, patient);
    }
}
