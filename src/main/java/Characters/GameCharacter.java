package Characters;

import Artifacts.Treasure.Treasure;
import Artifacts.Treasure.TreasureType;
import Interfaces.ICanBeFound;
import java.util.HashMap;

public abstract class GameCharacter implements ICanBeFound {

    protected double hitPoints = 1;
    protected double attackStrength = 1;
    protected double luck = 1;
    protected double mana = 1;
    protected double intelligence = 1;
    protected HashMap<TreasureType, Integer> treasureTally;
    protected String name = "";
    protected String fullName = "";
    protected String finderMsg = "";
    protected boolean isAlive = true;
    protected boolean isDead = false;
    protected boolean isUndead = false;
    protected double hostility = 0;


    public GameCharacter(String name){
        this.name = name;
        this.fullName = this.name;
        this.finderMsg = this.fullName + " is here. ";
        this.treasureTally = new HashMap<>();
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
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


    public void updateTreasureCount(TreasureType ttype, int numberChange){
        Integer count = numberChange;
        if (treasureTally.containsKey(ttype)) count = treasureTally.get(ttype) + numberChange;
        if (count <= 0 ) {
            treasureTally.remove(ttype);
        } else {
            treasureTally.put(ttype, count);
        }
    }

    public int countTreasureType( TreasureType ttype){
        int count = 0;
        if (treasureTally.containsKey(ttype)) count = treasureTally.get(ttype);
        return count;
    }

    public void listTreasureTypes() {
        treasureTally.forEach((key,value) -> System.out.println(key + " = " + value));
    }

    public boolean removeTreasure(TreasureType ttype, int count) {
        if (countTreasureType(ttype) >= count) {
            updateTreasureCount(ttype, (-1 * count));
               return true;
        }
        return false;
    }

    public void addTreasure(Treasure treasure) {
        updateTreasureCount( treasure.getType(), treasure.getCount());
    }

    public int countTypesOfTreasure(){
        return treasureTally.size();
    }

}
