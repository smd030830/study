package animalHospital.src.main.java.com.hospital;

class Nurse {
    // 약 주기
    void giveMedicine(AnimalPatient patient) {
        System.out.println("환자: " + patient.name + " (식별번호: " + patient.idNumber + ")에게 약 먹임");
    }

    // 면회 가능 판단
    boolean canAllowVisit(Owner owner, AnimalPatient patient, int currentTime) {
        //주인 확인
        if (patient.owner != owner) {
            System.out.println("결과: 주인이 아님");
            return false;
        }
        //시간 확인 (15시~20시: 임의로 장힘)
        if (currentTime < 15 || currentTime > 20) {
            System.out.println("결과: 면회 시간이 아님 (현재: " + currentTime + "시)");
            return false;
        }
        //횟수 확인
        if (patient.visitCount >= 1) {
            System.out.println("이미 오늘 면회를 함");
            return false;
        }
        return true;
    }
}