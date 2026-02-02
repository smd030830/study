package animalHospital.src.main.java.com.hospital;

class Hospital {
    int currentTime;
    AnimalPatient[] patients;
    Nurse hospitalNurse;

    Hospital(Nurse nurse) {
        this.hospitalNurse = nurse;
        this.patients = new AnimalPatient[5]; //일단 최대 5마리 수용
    }

    //환자 입원
    void admit(AnimalPatient patient, int index) {
        patients[index] = patient;
        System.out.println(patient.type + " " + patient.name + " 환자가 입원");
    }

    //매일 3번 투약
    void dailyMedicineWork() {
        System.out.println("\n투약 시작 (1일 3회)");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "회차 투약");
            for (AnimalPatient p : patients) {
                if (p != null) hospitalNurse.giveMedicine(p);
            }
        }
    }

    // 면회
    void processVisitation(Owner owner, AnimalPatient patient) {
        System.out.print("[" + owner.name + "님의 " + patient.name + " 면회 신청");
        if (hospitalNurse.canAllowVisit(owner, patient, currentTime)) {
            patient.visitCount++;
            System.out.println("결과: 면회가 승인");
        }
    }
}
