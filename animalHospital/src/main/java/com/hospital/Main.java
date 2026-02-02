package com.hospital;

public class Main {
    public static void main(String[] args) {
        AnimalPatient cat = new AnimalPatient("나비", AnimalPatient.Species.CAT, "C001", "김주인");
        Nurse nurse = new Nurse();

        nurse.giveMedicine(cat);
        nurse.checkVisit(cat, "김주인", 16);
    }
}