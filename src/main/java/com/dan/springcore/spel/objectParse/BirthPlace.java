package com.dan.springcore.spel.objectParse;

import lombok.Data;

@Data
public class BirthPlace {
    private final String nation;
    private final String place;

    public BirthPlace(String nation, String place) {
        this.nation = nation;
        this.place = place;
    }
}
