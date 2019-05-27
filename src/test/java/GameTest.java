import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;

    @Before
    public void Before(){
        game = new Game();
    }

    @Test
    public void getCharacterName() {
        assertNull(game.getCharacterName());
    }

    @Test
    public void setCharacterName() {
        game.setCharacterName("Freddy");
        assertEquals("Freddy", game.getCharacterName());
    }

    @Test
    public void isGameRunning() {
        assertEquals(true, game.isGameRunning());
    }

    @Test
    public void setGameRunning() {
        game.setGameRunning(false);
        assertEquals(false, game.isGameRunning());

    }

    @Test
    public void displayMsg() {
        game.displayMsg("hello");
    }

    @Test
    public void getInput() {
        String name = game.getInput("Enter character name: ");
        assertEquals("Trevis", name);
    }
}