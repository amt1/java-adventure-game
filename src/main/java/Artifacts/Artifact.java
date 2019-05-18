package Artifacts;

import Interfaces.ICanBeFound;
import Interfaces.ICanBeSold;

public abstract class Artifact implements ICanBeFound, ICanBeSold {

    protected int value = 0;
    protected String finderMsg = "";
    protected String description = "";

    public Artifact(){

    }
    public String getFinderMsg(){
        return finderMsg;
    }
    public void showFinderMsg(){
        System.out.println(finderMsg);
    }
    public int getValue(){
        return value;
    }
}
