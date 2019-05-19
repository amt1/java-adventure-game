package Characters.Players;

import Artifacts.Weapons.WeaponType;

public enum PlayerClass {
    BARBARIAN("Barbarian", WeaponType.CLUB, 100, 100, 50, 20, 25),
    DWARF("Dwarf", WeaponType.AXE, 100, 80, 40, 5,100),
    HUMAN("Human", WeaponType.SWORD, 75, 80, 60, 30, 80),
    ELF("Elf", WeaponType.BOW, 100, 50, 80,90,120)
    ;

    private final String name;
    private final WeaponType defaultWeapon;
    private final int baseHitPoints;
    private final int baseAttackStrength;
    private final int baseLuck;
    private final int baseMana;
    private final int baseIntelligence;

    PlayerClass(String name, WeaponType defaultWeapon, int baseHitPoints, int baseAttackStrength, int baseLuck, int baseMana, int baseIntelligence) {
        this.name = name;
        this.defaultWeapon = defaultWeapon;
        this.baseHitPoints = baseHitPoints;
        this.baseAttackStrength = baseAttackStrength;
        this.baseLuck = baseLuck;
        this.baseMana = baseMana;
        this.baseIntelligence = baseIntelligence;
    }

    public String getName() {return name; }

    public WeaponType getDefaultWeapon() { return defaultWeapon;}

    public int getBaseHitPoints() {
        return baseHitPoints;
    }

    public int getBaseAttackStrength() {
        return baseAttackStrength;
    }

    public int getBaseLuck() {
        return baseLuck;
    }

    public int getBaseMana() {
        return baseMana;
    }

    public int getBaseIntelligence() {return baseIntelligence;}

}
