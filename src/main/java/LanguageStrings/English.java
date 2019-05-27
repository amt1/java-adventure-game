package LanguageStrings;

import Interfaces.IKnowWords;

public class English  implements IKnowWords {

    public English(){

    }

    // if I can find out how to get the filename from a variable I can inherit all these
    // functions from an abstract class and only store them once

    public String sayHello(){
        return EnglishStrings.HELLO.getMsg();
    }

    public String attack1(){
        return EnglishStrings.ATTACK1.getMsg();
    }

// functions need to appear in these language files and be prototyped in the interface
}
