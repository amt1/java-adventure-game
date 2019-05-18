package Artifacts.Treasure;

import Artifacts.Artifact;

public class Treasure extends Artifact {

    int count=0;
    String name;
    String fullName;
    int modifier;
    TreasureType type;

    public Treasure ( TreasureType type, int count){
        this.type = type;
        this.count = count;
        this.name = type.getName();
        this.fullName = count + " " + name;
        if (count > 1) fullName += "s";
        this.value = type.getValue() * count;
        this.finderMsg = "You've found " + fullName + ", worth " + value + "! ";
        this.modifier = type.getModifier();
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getModifier() {
        return modifier;
    }

    public TreasureType getType(){
        return type;
    }
}
