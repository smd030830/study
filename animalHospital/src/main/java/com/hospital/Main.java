package animalHospital.src.main.java.com.hospital;

public class Main {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        Hospital hospital = new Hospital(nurse);
        Doctor doctor = new Doctor("이국종");

        Owner ownerA = new Owner("김철수");
        AnimalPatient cat = new AnimalPatient("냥이", "고양이", "CAT-01", ownerA, doctor);
        AnimalPatient rabbit = new AnimalPatient("토순이", "토끼", "RAB-02", ownerA, doctor);

        //입원
        hospital.admit(cat, 0);
        hospital.admit(rabbit, 1);

        //투약
        hospital.dailyMedicineWork();

        //면회
        System.out.println("\n면회");

        //오전 10시 (시간 외)
        hospital.currentTime = 10;
        ownerA.requestVisit(cat, hospital);

        //오후 16시 (정상)
        hospital.currentTime = 16;
        ownerA.requestVisit(cat, hospital);

        //오후 17시 (근데 이미 1번 했음)
        hospital.currentTime = 17;
        ownerA.requestVisit(cat, hospital);
    }
}