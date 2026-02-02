public class HospitalMain {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        Hospital hospital = new Hospital(nurse);
        Doctor doctor = new Doctor("최의사");
        Owner owner = new Owner("박주인");

        hospital.patients[0] = new Cat("치즈", "C01", owner, doctor);
        hospital.patients[1] = new Big_dog("장군", "D01", owner, doctor);
        hospital.patients[2] = new Rabbit("쫑긋", "R01", owner, doctor);

        //투약
        hospital.administerMedicineToAll();

        //면회
        System.out.println("\n면회");

        hospital.setTime(14); // 오후 2시 (거절)
        owner.visit(hospital.patients[0], hospital);

        hospital.setTime(16); // 오후 4시 (승인)
        owner.visit(hospital.patients[0], hospital);

        hospital.setTime(18); // 오후 6시 (이미 1회 면회 완료)
        owner.visit(hospital.patients[0], hospital);
    }
}