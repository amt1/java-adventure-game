package Weapons;

public enum WeaponType {
    AXE("Axe",50, 0.5, 10),
    SWORD("Sword",10, 1.0, 5),
    CLUB("Club",100, 0.1, 20)
    ;


    private final int baseAttackStrength;
    private final double baseAccuracy;
    private final int baseWear;
    private final String name;

    WeaponType(String name, int baseAttackStrength, double baseAccuracy, int baseWear) {
        this.baseAttackStrength = baseAttackStrength;
        this.baseAccuracy = baseAccuracy;
        this.baseWear = baseWear;
        this.name = name;
    }

    public int getBaseAttackStrength() {
        return baseAttackStrength;
    }

    public double getBaseAccuracy() {
        return baseAccuracy;
    }

    public int getBaseWear() {
        return baseWear;
    }

    public String getName() {return name; }

    }
