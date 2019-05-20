package LanguageStrings;

import Interfaces.IKnowWords;

public enum Translation {
    ENGLISH("English"),
    KLINGON("Klingon");

    private final String name;

    Translation(String name){

        this.name = name;
    }

    public String getName() {return name; }

}

// still trying to decide whether language strings should be in an enum or a class

