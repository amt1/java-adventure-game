package Characters.Players;

import Artifacts.Weapons.WeaponType;

public enum Role {
    WARRIOR ("Warrior", WeaponType.SWORD),
    WIZARD ("Wizard", WeaponType.STAFF),
    CLERIC ("Cleric", WeaponType.BOOK),
    SHAMAN("Shaman", WeaponType.STAFF)
;
    private final String name;
    private final WeaponType defaultWeapon;


    Role(String name, WeaponType defaultWeapon) {
        this.name = name;
        this.defaultWeapon = defaultWeapon;
    }

    public String getName() {return name; }

    public WeaponType getDefaultWeapon() { return defaultWeapon;}

}
