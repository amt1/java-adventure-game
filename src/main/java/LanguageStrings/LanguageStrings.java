package LanguageStrings;

import Interfaces.IKnowWords;

public class LanguageStrings {

    Translation language;
    String languageName;
    IKnowWords thingsToSay;

    public LanguageStrings(Translation language){
        this.language = language;
        this.languageName = language.getName();
        this.thingsToSay = new English();
    }

    public Translation getLanguage() {
        return language;
    }

    public void setLanguage(Translation language) {
        this.language = language;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String hello(){
        return thingsToSay.sayHello();
    }
}
