package Artifacts.Treasure;

public enum TreasureType {
    GOLD("Gold Piece", 1,0)
    ;

    // modifiers: 0 = does nothing, 1= +1 to attack strength, 2= +1 to hit points
    // 3= +1 to mana, 4= +1 to intelligence, 5= +1 to luck

    private final String name;
    private final int value;
    private final int modifier;


    TreasureType(String name, int value, int modifier) {
        this.name = name;
        this.value = value;
        this.modifier = modifier;
    }

    public String getName() {return name; }

    public int getValue() {return value;}

    public int getModifier() {return modifier;}

}
