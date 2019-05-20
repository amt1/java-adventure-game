package LanguageStrings;

public enum Translation {
    ENGLISH("English");

    private final String name;

    private Translation(String name){
        this.name = name;
    }

    public String getName() {return name; }

}
