package Characters;

import Artifacts.Treasure.Treasure;
import Artifacts.Treasure.TreasureType;
import Interfaces.ICanBeFound;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class GameCharacter implements ICanBeFound {

    protected double hitPoints = 1;
    protected double attackStrength = 1;
    protected double luck = 1;
    protected ArrayList<Treasure> treasure;
    protected HashMap<TreasureType, Integer> treasureTally;
    protected String name = "";
    protected String finderMsg = "";
    protected boolean isAlive = true;
    protected boolean isDead = false;
    protected boolean isUndead = false;
    protected double hostility = 0;


    public GameCharacter(String name){
        this.name = name;
        this.finderMsg = name + " is here. ";
    }

    public String getName(){
        return name;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(double attackStrength) {
        this.attackStrength = attackStrength;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public void setTreasure(ArrayList<Treasure> treasure) {
        this.treasure = treasure;
    }

    public HashMap<TreasureType, Integer> getTreasureTally() {
        return treasureTally;
    }

    public void setTreasureTally(HashMap<TreasureType, Integer> treasureTally) {
        this.treasureTally = treasureTally;
    }

    public String getFinderMsg(){
        return finderMsg;
    }
    public void showFinderMsg(){
        System.out.println(finderMsg);
    }

    public void die() {
        hitPoints = 0;
        isAlive = false;
        isDead = true;
        isUndead = false;
    }

    public boolean isAlive() {
        isAlive = (hitPoints > 0);
        return isAlive;
    }
    public boolean isDead() {
        isDead = ((hitPoints <= 0) && (isUndead == false));
        return isDead;
    }

    public boolean isUndead() {
        return isUndead;
    }
    // being very specific here in case I want to add 'undead' later!

    public double getHostility() {
        return hostility;
    }

    public void setHostility(double hostility) {
        this.hostility = hostility;
    }
}
