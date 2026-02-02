package com.hospital;

public class Nurse {
    public void giveMedicine(AnimalPatient patient) {
        System.out.println(patient.getName() + "(" + patient.getId() + ")에게 약을 먹입니다. (1일 3회 중 1회)");
    }

    public void checkVisit(AnimalPatient patient, String visitor, int hour) {
        if (hour >= 15 && hour <= 20 && visitor.equals(patient.getOwnerName()) && patient.getVisitCount() < 1) {
            patient.setVisitCount(1);
            System.out.println("면회 승인: " + visitor + " 입장");
        } else {
            System.out.println("면회 불가: 조건(시간, 소유자 여부, 횟수)을 확인하세요.");
        }
    }
}