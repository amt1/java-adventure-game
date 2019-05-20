package LanguageStrings;

import Interfaces.IKnowWords;

// I don't know if this way will work
public enum English  implements IKnowWords {
    HELLO("Hello")
    ;
    // English language strings could go here

    private final String msg;

    English(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public String sayHello(){
        return HELLO.msg;
    }
}
