package LanguageStrings;

// I don't know if this way will work
public enum EnglishStrings  {
    HELLO("Hello"),
    ATTACK1("Prepare to Die!")
    ;
    // English language strings could go here

    private final String msg;

    EnglishStrings(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
