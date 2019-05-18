package Artifacts.Treasure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreasureTest {

        Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure(TreasureType.GOLD, 50);
    }

    @Test
    public void getCount() {
        assertEquals(50, treasure.getCount());
    }

    @Test
    public void getName() {
        assertEquals("Gold Piece", treasure.getName());
    }

    @Test
    public void getFullName() {
        assertEquals("50 Gold Pieces", treasure.getFullName());

    }

    @Test
    public void getModifier() {
        assertEquals (0, treasure.getModifier());
    }

    @Test
    public void getType() {
        assertEquals(TreasureType.GOLD, treasure.getType());
    }
    @Test
    public void getFinderMsg() {
        assertNotNull(treasure.getFinderMsg());
    }

    @Test
    public void showFinderMsg() {
        treasure.showFinderMsg();
    }
}