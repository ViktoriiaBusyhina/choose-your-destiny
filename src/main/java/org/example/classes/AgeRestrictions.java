package org.example.classes;

import java.util.Random;

public enum AgeRestrictions {

    AGE_SMAL("1-20"),
    AGE_ADULT("20-40"),
    AGE_OLD("40-60");

    private String limit;


    AgeRestrictions(String limit) {
        this.limit = limit;
    }

    public String getLimit() {
        return limit;
    }

    public static AgeRestrictions getRandomAgeLimit() {
        Random random = new Random();
        AgeRestrictions[] values = AgeRestrictions.values();
        return values[random.nextInt(values().length)];
    }
}
