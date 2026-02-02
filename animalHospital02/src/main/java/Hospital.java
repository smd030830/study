class Hospital {
    int currentTime;
    Animal[] patients;
    Nurse nurse;

    Hospital(Nurse nurse) {
        this.nurse = nurse;
        this.patients = new Animal[5];
    }

    void setTime(int time) { this.currentTime = time; }

    // 동물 약 주rl
    void administerMedicineToAll() {
        System.out.println("\n투약 업무");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "회차 투약");
            for (Animal a : patients) {
                if (a != null) nurse.giveMedicine(a);
            }
        }
    }

    void processVisitation(Owner owner, Animal animal) {
        if (nurse.allowVisitation(owner, animal, currentTime)) {
            animal.visitCount++;
            System.out.println(owner.name + "님이 " + animal.name + " 면회");
        } else {
            System.out.println("면회 조건에 부합");
        }
    }
}