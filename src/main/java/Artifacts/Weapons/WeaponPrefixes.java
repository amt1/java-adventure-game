package Artifacts.Weapons;

public enum WeaponPrefixes {
    DULL("Dull", 0, 0.2, 0, -30),
    RADIOACTIVE("Radioactive", 100, 2.0, -5, -50),
    GOLDEN("Golden", 0, 1.5, -2, 500),
    BATTLE("Battle", 50, 2.0, 0, 100),
    FISHERPRICE("Fisher-Price", -20, 0.5, -10, -10),
    MYTHICAL("Mythical", 500, 2.0, -50, 250),
    TOOKIND("Too Kind", 0, 0, 0, 0),
    BLOODTHIRSTY("Bloodthirsty", 75, 0.8, 0 , 300),
    HEROIC("Heroic", 25, 1, 0, 700),
;
    private final int index;
    private final String name;
    private final int modifyAttackStrength;  // add to base
    private final double modifyAccuracy;  // multiply by base
    private final int modifyWear;  // add to wear
    private final int value; // add to value


    private WeaponPrefixes(String name, int modifyAttackStrength, double modifyAccuracy, int modifyWear, int value) {
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
