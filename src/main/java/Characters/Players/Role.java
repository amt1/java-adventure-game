package Characters.Players;

public enum Role {
    WARRIOR ("Warrior"),
    MAGIC_USER ("Magic User"),
    CLERIC ("Cleric")
;
    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {return name; }

}
