package Weapons;


import java.util.Random;

public class Weapon  {

    private int attackStrength;
    private double accuracy;
    private int wear;
    private String type;
    private String name;
    private Random rand = new Random();
    private WeaponAndIkeaNames weaponNameInstance;
  //  private WeaponType baseType;



    public Weapon ( WeaponType baseType) {

      //  this.baseType = baseType;
        System.out.println(baseType);
        this.type = baseType.getName();
        this.attackStrength = baseType.getBaseAttackStrength();
        this.accuracy = baseType.getBaseAccuracy();
        this.wear = baseType.getBaseWear();
        int index = rand.nextInt(WeaponAndIkeaNames.values().length);
        this.weaponNameInstance = WeaponAndIkeaNames.values()[index];
        this.name = weaponNameInstance.getName();
    }

    public String getType() {
        return type;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public String getName() {
        return name;
    }
}
