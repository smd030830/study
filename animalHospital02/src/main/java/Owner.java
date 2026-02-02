class Owner {
    String name;
    Owner(String name) { this.name = name; }

    //면회
    void visit(Animal animal, Hospital hospital) {
        hospital.processVisitation(this, animal);
    }
}
