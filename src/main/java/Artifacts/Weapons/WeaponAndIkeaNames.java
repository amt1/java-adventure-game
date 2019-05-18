package Artifacts.Weapons;

public enum WeaponAndIkeaNames {
    POANG("Poang", 50),
    BILLY("Billy", 20),
    SMASKIG("Smaskig", 100),
    DUKTIG("Duktig", 30),
    NYBAKAD("Nybakad", 85),
    LACK("Lack", 10),
    GNEDBY("Gnedby", 15),
    SONGESAND("Songesand", 90),
    HEMNES("Hemnes", 45),
    FORNUFT("Fornuft", 5);

    private final int index;
    private final String name;
    private final int value;

    private WeaponAndIkeaNames(String name, int value) {
        this.index = ordinal();
        this.name = name;
        this.value = value;
    }

    public String getName() {return name; }

    public int getValue() {return value;}

}
