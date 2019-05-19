package Artifacts.Weapons;

public enum WeaponSuffixes {
    FRAGILITY("Fragility", 0, 0, -50, -100),
    STRENGTH("Strength", 100, 0, 20, 100),
    DESIGNERLABELS("Designer Labels", 0, 0, 0, 1000),
    BATTLE("Battle", 50, 2, 0, 100),
    PLASTIC("Plastic", -20, 0, -30, -10),
    LEGEND("Legend", 500, 2, -20, 700),
    COMPASSION("Compassion", 0, -10, 0, 0),
    BLOODTHIRSTINESS("Bloodthirstiness", 75, -1, 0, 300 ),
    DOOM("Doom", -25, 0, 0, -100),
    ;
    private final int index;
    private final String name;
    private final int modifyAttackStrength;  // add to base
    private final int modifyAccuracy;  // multiply by base
    private final int modifyWear;  // add to wear
    private final int value; // add to value


    private WeaponSuffixes(String name, int modifyAttackStrength, int modifyAccuracy, int modifyWear, int value) {
        this.modifyAttackStrength = modifyAttackStrength;
        this.modifyAccuracy = modifyAccuracy;
        this.modifyWear = modifyWear;
        this.index = ordinal();
        this.name = name;
        this.value = value;

    }

    public String getName() {return name; }

    public int modifyAttackStrength() {
        return modifyAttackStrength;
    }

    public int modifyAccuracy() {
        return modifyAccuracy;
    }

    public int modifyWear() {
        return modifyWear;
    }

    public int getValue() {return value;}

}
