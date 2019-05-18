package Artifacts.Weapons;

public enum WeaponSuffixes {
    FRAGILITY("Fragility", 0, 1, -50, -100),
    STRENGTH("Strength", 100, 1, 20, 100),
    DESIGNERLABELS("Designer Labels", 0, 1, 0, 1000),
    BATTLE("Battle", 50, 2.0, 0, 100),
    PLASTIC("Plastic", -20, 1, -30, -10),
    LEGEND("Legend", 500, 2.0, -20, 700),
    COMPASSION("Compassion", 0, 0, 0, 0),
    BLOODTHIRSTINESS("Bloodthirstiness", 75, 0.8, 0, 300 ),
    DOOM("Doom", -25, 1, 0, -100),
    ;
    private final int index;
    private final String name;
    private final int modifyAttackStrength;  // add to base
    private final double modifyAccuracy;  // multiply by base
    private final int modifyWear;  // add to wear
    private final int value; // add to value


    private WeaponSuffixes(String name, int modifyAttackStrength, double modifyAccuracy, int modifyWear, int value) {
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

    public double modifyAccuracy() {
        return modifyAccuracy;
    }

    public int modifyWear() {
        return modifyWear;
    }

    public int getValue() {return value;}

}
