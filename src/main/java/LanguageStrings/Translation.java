package LanguageStrings;

import Interfaces.IKnowWords;

public enum Translation {
    ENGLISH("English", English),
//    KLINGON("Klingon", Klingon);

    private final String name;
    private final IKnowWords whichLanguage;

    Translation(String name, IKnowWords whichLanguage){

        this.name = name;
        this.whichLanguage = whichLanguage;
    }

    public String getName() {return name; }

    public IKnowWords getWhichLanguage(){
        return whichLanguage;
    }
}

// still trying to decide whether language strings should be in an enum or a class

