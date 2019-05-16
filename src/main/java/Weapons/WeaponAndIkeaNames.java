package Weapons;

public enum WeaponAndIkeaNames {
    POANG("Poang"),
    BILLY("Billy"),
    SMASKIG("Smaskig"),
    DUKTIG("Duktig"),
    NYBAKAD("Nybakad"),
    LACK("Lack"),
    GNEDBY("Gnedby"),
    SONGESAND("Songesand"),
    HEMNES("Hemnes"),
    FORNUFT("Fornuft");

    private final int index;
    private final String name;

    private WeaponAndIkeaNames(String name) {
        this.index = ordinal();
        this.name = name;
    }

    public String getName() {return name; }

}
