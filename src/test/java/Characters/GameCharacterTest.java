package Characters;

import Characters.Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameCharacterTest {
    Player player;

    @Before
    public void before() {
        player = new Player("Freddy");
    }
    @Test
    public void getName() {
        assertEquals("Freddy", player.getName());
    }

    @Test
    public void getHitPoints() {
        assertEquals(1, player.getHitPoints(), 0.1);
    }

    @Test
    public void setHitPoints() {
        player.setHitPoints(20);
        assertEquals(20, player.getHitPoints(), 0.1);

    }

    @Test
    public void getAttackStrength() {
        assertEquals(1, player.getAttackStrength(), 0.1);
    }

    @Test
    public void setAttackStrength() {
        player.setAttackStrength(50);
        assertEquals(50, player.getAttackStrength(), 0.1);

    }

    @Test
    public void getLuck() {
        assertEquals(1, player.getLuck(), 0.1);
    }

    @Test
    public void setLuck() {
        player.setLuck(10);
        assertEquals(10, player.getLuck(), 0.1);

    }

    @Test
    public void getHostility() {
        assertEquals(0, player.getHostility(), 0.1);
    }

    @Test
    public void setHostility() {
        player.setHostility(10);
        assertEquals(10, player.getHostility(), 0.1);

    }
    @Test
    public void getFinderMsg() {
        assertEquals("Freddy is here. ", player.getFinderMsg());
    }

    @Test
    public void showFinderMsg() {
        player.showFinderMsg();
    }

    @Test
    public void isAlive() {
        assertEquals(true, player.isAlive());
    }

    @Test
    public void isNotDead() {
        assertEquals(false, player.isDead());
    }

    @Test
    public void isNotUndead() {
        assertEquals(false, player.isUndead());

    }

    @Test
    public void die() {
        player.die();
        assertEquals(false, player.isAlive() );
        assertEquals(true, player.isDead());
        assertEquals(false, player.isUndead());

    }


}