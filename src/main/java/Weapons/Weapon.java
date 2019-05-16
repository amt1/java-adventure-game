package Weapons;


import java.util.Random;

public class Weapon  {

    private int attackStrength;
    private double accuracy;
    private int wear;
    private int baseAttackStrength;
    private double baseAccuracy;
    private int baseWear;
    private String type;
    private String name;
    private Random rand = new Random();
    private WeaponAndIkeaNames weaponNameInstance;
    private String fullName;
    private String prefix = "";
    private String suffix = "";
    private int index;
    private WeaponPrefixes prefixEnum;
    private WeaponSuffixes suffixEnum;


    public Weapon ( WeaponType baseType) {

        this.type = baseType.getName();
        index = rand.nextInt(WeaponAndIkeaNames.values().length);
        this.name = WeaponAndIkeaNames.values()[index].getName();
        index = rand.nextInt(WeaponPrefixes.values().length);
        this.prefixEnum = WeaponPrefixes.values()[index];
        this.prefix = prefixEnum.getName();
        index = rand.nextInt(WeaponSuffixes.values().length);
        this.suffixEnum = WeaponSuffixes.values()[index];
        this.suffix = suffixEnum.getName();
        this.fullName = name + ", a " + prefix + " " + type + " of " + suffix;
        this.baseAccuracy = baseType.getBaseAccuracy();
        this.baseAttackStrength = baseType.getBaseAttackStrength();
        this.baseWear = baseType.getBaseWear();
        modifyStats();
    }
    // separate out base and modified amounts

    public String getType() {
        return type;
    }

    public int getAttackStrength() {
        return attackStrength;
    }
    public int getBaseAttackStrength() {
        return baseAttackStrength;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public int getWear() {
        return wear;
    }
    public int getBaseWear() {
        return baseWear;
    }
    public double getAccuracy() {
        return accuracy;
    }
    public double getBaseAccuracy() {
        return baseAccuracy;
    }
    public String getFullName(){
        return fullName;
    }

    public void setPrefix(WeaponPrefixes newPrefix){
        this.prefixEnum = newPrefix;
        this.prefix = prefixEnum.getName();
        modifyStats();
    }

    public void setSuffix(WeaponSuffixes newSuffix){
        this.suffixEnum = newSuffix;
        this.suffix = suffixEnum.getName();
        modifyStats();
    }
    public void modifyStats() {
        this.attackStrength = baseAttackStrength + prefixEnum.modifyAttackStrength() + suffixEnum.modifyAttackStrength();
        this.accuracy = (baseAccuracy * prefixEnum.modifyAccuracy()) * suffixEnum.modifyAccuracy();
        this.wear = baseWear + prefixEnum.modifyWear() + suffixEnum.modifyWear();
        if (wear < 1) wear = 1;
    }

    public void wearOut( int number ){
        wear -= number;
    }

    public boolean isWornOut(){
        return (wear <= 0);
    }
}
