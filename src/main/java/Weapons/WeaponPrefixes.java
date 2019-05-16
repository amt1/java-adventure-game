package Weapons;

public enum WeaponPrefixes {
    DULL("Dull", 0, 0.2, 0),
    RADIOACTIVE("Radioactive", 100, 2.0, -5),
    GOLDEN("Golden", 0, 1.5, -2),
    BATTLE("Battle", 50, 2.0, 0),
    FISHERPRICE("Fisher-Price", -20, 0.5, -10),
    MYTHICAL("Mythical", 500, 2.0, -50),
    TOOKIND("Too Kind", 0, 0, 0),
    BLOODTHIRSTY("Bloodthirsty", 75, 0.8, 0 ),
    HEROIC("Heroic", 25, 1, 0),
;
    private final int index;
    private final String name;
    private final int modifyAttackStrength;  // add to base
    private final double modifyAccuracy;  // multiply by base
    private final int modifyWear;  // add to wear

    private WeaponPrefixes(String name, int modifyAttackStrength, double modifyAccuracy, int modifyWear) {
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
