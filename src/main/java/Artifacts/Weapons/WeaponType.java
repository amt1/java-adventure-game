package Artifacts.Weapons;

public enum WeaponType {
    AXE("Axe",50, 0.5, 10, 50),
    SWORD("Sword",10, 1.0, 5, 100),
    CLUB("Club",100, 0.1, 20, 20),
    STAFF("Staff", 10, 0.7, 5, 10)
    ;


    private final int baseAttackStrength;
    private final double baseAccuracy;
    private final int baseWear;
    private final String name;
    private final int value;

    WeaponType(String name, int baseAttackStrength, double baseAccuracy, int baseWear, int value) {
        this.baseAttackStrength = baseAttackStrength;
        this.baseAccuracy = baseAccuracy;
        this.baseWear = baseWear;
        this.name = name;
        this.value = value;
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

    public int getValue() {return value;}

    }
