package Artifacts.Weapons;

public enum WeaponType {
    AXE("Axe",50, 5, 10, 50),
    SWORD("Sword",10, 10, 5, 100),
    CLUB("Club",100, 3, 20, 20),
    STAFF("Staff", 10, 7, 5, 10),
    BOOK("Book", 1,10,5, 80),
    BOW("Bow", 30, 20, 15, 100)
    ;


    private final int baseAttackStrength;
    private final int baseAccuracy;
    private final int baseWear;
    private final String name;
    private final int value;

    WeaponType(String name, int baseAttackStrength, int baseAccuracy, int baseWear, int value) {
        this.baseAttackStrength = baseAttackStrength;
        this.baseAccuracy = baseAccuracy;
        this.baseWear = baseWear;
        this.name = name;
        this.value = value;
    }

    public int getBaseAttackStrength() {
        return baseAttackStrength;
    }

    public int getBaseAccuracy() {
        return baseAccuracy;
    }

    public int getBaseWear() {
        return baseWear;
    }

    public String getName() {return name; }

    public int getValue() {return value;}

    }
