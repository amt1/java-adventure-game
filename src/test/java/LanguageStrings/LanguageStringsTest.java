package LanguageStrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageStringsTest {

    LanguageStrings languageStrings;

    @Before
    public void before() {
        languageStrings = new LanguageStrings(Translation.ENGLISH);
    }
    @Test
    public void getLanguage() {
        assertEquals(Translation.ENGLISH, languageStrings.getLanguage());
    }

    @Test
    public void getLanguageName() {
        assertEquals("English", languageStrings.getLanguageName());
    }

    @Test
    public void talk() {
        System.out.println(languageStrings.getThingsToSay().sayHello());
        System.out.println(languageStrings.getThingsToSay().attack1());

    }
}