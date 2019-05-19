package Characters;

import Artifacts.Treasure.Treasure;
import Artifacts.Treasure.TreasureType;
import Characters.Players.Player;
import Characters.Players.Role;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameCharacterTest {
    Player player;
    Treasure mytreasure;

    @Before
    public void before() {

        player = new Player("Freddy", Role.CLERIC);
        mytreasure = new Treasure( TreasureType.GOLD, 100);
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


    @Test
    public void getMana() {
        assertEquals(1, player.getMana(), 0.1);
    }

    @Test
    public void setMana() {
        player.setMana(10);
        assertEquals(10, player.getMana(), 0.1);

    }

    @Test
    public void getIntelligence() {
        assertEquals(1, player.getIntelligence(), 0.1);
    }

    @Test
    public void setIntelligence() {
        player.setIntelligence(20);
        assertEquals(20, player.getIntelligence(), 0.1);

    }



    @Test
    public void getTreasureList() {
    }


    @Test
    @Ignore

    public void listTreasureTypes() {
        player.addTreasure(mytreasure);
        player.listTreasureTypes();
        player.addTreasure(mytreasure);
        player.listTreasureTypes();
    }

    @Test
    public void removeTreasure() {
        player.addTreasure(mytreasure);
        assertEquals(true, player.removeTreasure(mytreasure.getType(), 50));
        assertEquals(1, player.countTypesOfTreasure());
        player.listTreasureTypes();
// need to update count of treasure type - not working

    }

    @Test
    public void countTypesOfTreasure() {
        assertEquals(0, player.countTypesOfTreasure());
            player.addTreasure(mytreasure);
        assertEquals(1, player.countTypesOfTreasure());

    }

    @Test
    public void cantOverspendTreasure() {
        player.addTreasure(mytreasure);
        assertEquals(false, player.removeTreasure(mytreasure.getType(), 500));

    }

    @Test
    public void countTreasureType(){
        player.addTreasure(mytreasure);
        player.addTreasure(mytreasure);

        assertEquals(200, player.countTreasureType(mytreasure.getType()));
    }
}