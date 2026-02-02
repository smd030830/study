package com.hospital;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class AnimalPatient {
    public enum Species { CAT, PARROT, BIG_DOG, SMALL_DOG, RABBIT } //동물 종류

    private String name; //이름
    private Species species; //종
    private String id; //id
    private LocalDate comeDate; //입원날짜
    private LocalDate dischargeDate;//토;원날짜
    private String ownerName; // 주인이름
    private String doctorName; //의사이름
    private int visitCount; //방문횟수

    //환자 정보
    public AnimalPatient(String name, Species species, String id, String ownerName) {
        this.name = name;
        this.species = species;
        this.id = id;
        this.ownerName = ownerName;
        this.visitCount = 0;
    }
}