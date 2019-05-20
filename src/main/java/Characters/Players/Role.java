package Characters.Players;

import Artifacts.Weapons.WeaponType;

public enum Role {
    WARRIOR ("Warrior", WeaponType.SWORD, 20,20,10,5,0),
    WIZARD ("Wizard", WeaponType.STAFF, 0, -10, 15, 10, 50),
    CLERIC ("Cleric", WeaponType.BOOK, 20, -20, 20, 20, 100),
    SHAMAN("Shaman", WeaponType.STAFF, 30, 0, 15, 50, 80)
;
    private final String name;
    private final WeaponType defaultWeapon;
    private final int modifyHitPoints;
    private final int modifyAttackStrength;
    private final int modifyLuck;
    private final int modifyMana;
    private final int modifyIntelligence;

    Role(String name, WeaponType defaultWeapon, int modifyHitPoints, int modifyAttackStrength, int modifyLuck, int modifyMana, int modifyIntelligence) {
        this.name = name;
        this.defaultWeapon = defaultWeapon;
        this.modifyHitPoints = modifyHitPoints;
        this.modifyAttackStrength = modifyAttackStrength;
        this.modifyLuck = modifyLuck;
        this.modifyMana = modifyMana;
        this.modifyIntelligence = modifyIntelligence;
    }

    public String getName() {return name; }

    public WeaponType getDefaultWeapon() { return defaultWeapon;}

    public int getModifyHitPoints() { return modifyHitPoints; }

    public int getModifyAttackStrength() { return modifyAttackStrength;}

    public int getModifyLuck() { return modifyLuck; }

    public int getModifyMana() { return modifyMana; }

    public int getModifyIntelligence() { return modifyIntelligence; }
}
