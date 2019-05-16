package Weapons;

public enum WeaponSuffixes {
    FRAGILITY("Fragility", 0, 1, -50),
    STRENGTH("Strength", 100, 1, 20),
    DESIGNERLABELS("Designer Labels", 0, 1, 0),
    BATTLE("Battle", 50, 2.0, 0),
    PLASTIC("Plastic", -20, 1, -30),
    LEGEND("Legend", 500, 2.0, -20),
    COMPASSION("Compassion", 0, 0, 0),
    BLOODTHIRSTINESS("Bloodthirstiness", 75, 0.8, 0 ),
    DOOM("Doom", -25, 1, 0),
    ;
    private final int index;
    private final String name;
    private final int modifyAttackStrength;  // add to base
    private final double modifyAccuracy;  // multiply by base
    private final int modifyWear;  // add to wear

    private WeaponSuffixes(String name, int modifyAttackStrength, double modifyAccuracy, int modifyWear) {
        this.modifyAttackStrength = modifyAttackStrength;
        this.modifyAccuracy = modifyAccuracy;
        this.modifyWear = modifyWear;
        this.index = ordinal();
        this.name = name;
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

}
