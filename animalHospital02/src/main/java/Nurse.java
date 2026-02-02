class Nurse {
    // 약 투약
    void giveMedicine(Animal animal) {
        System.out.println("대상: " + animal.name + " (ID: " + animal.idNumber + ")");
    }

    // 면회 허락
    boolean allowVisitation(Owner owner, Animal animal, int currentTime) {
        if (animal.owner != owner) return false;
        if (currentTime < 15 || currentTime > 20) return false;
        if (animal.visitCount >= 1) return false;
        return true;
    }
}