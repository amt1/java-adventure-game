package LanguageStrings;

import Interfaces.IKnowWords;

public class LanguageStrings {

    Translation language;
    String languageName;
    IKnowWords thingsToSay;

    public LanguageStrings(Translation language){
        this.language = language;
        this.languageName = language.getName();
        if (language == Translation.ENGLISH) this.thingsToSay = new English();
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

//    public void sayHello(){
//        System.out.println(thingsToSay.sayHello());
//    } // example

    public IKnowWords getThingsToSay(){
        return thingsToSay;
    }
    // where does the language go?
    // LanguageStrings myLanguage in character, (it's the user's language though)
    // in dungeon as part of the world, or in the controller?
    // so talking would go eg:
    // player.say(myLanguage.getThingsToSay().sayHello())
    // seems a long way round still
    // think the ICanTalk objects have to have them to use them?
    // dungeon can then have a separate version for room descriptions
    // also ICanBeFound objects have descriptions
}
