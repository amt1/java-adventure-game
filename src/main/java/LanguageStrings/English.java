package LanguageStrings;

import Interfaces.IKnowWords;

public class English  implements IKnowWords {

    public English(){

    }

    // if I can find out how to get the filename from a variable I can inherit all these
    // functions from an abstract class and ony store them once

    public String sayHello(){
        return EnglishStrings.HELLO.getMsg();
    }
}
