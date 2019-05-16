import Weapons.Weapon;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        Weapon weapon = new Weapon(WeaponType.AXE);
    }

//    @Test
//    public void hasType(){
//        assertEquals("Axe", weapon.getType());
//    }

    @Test
    public void hasAttackStrength() {
        assertEquals(50, weapon.getAttackStrength());
    }

    @Test
    public void hasName(){
        System.out.println(weapon.getName());
        assertNotNull(weapon.getName());
    }
}
