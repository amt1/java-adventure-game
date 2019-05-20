package LanguageStrings;

import Interfaces.IKnowWords;

public class English  implements IKnowWords {

    public English(){

    }

    public String sayHello(){
        return EnglishStrings.HELLO.getMsg();
    }
}
