package Artifacts;

import Artifacts.Weapons.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArtifactTest {
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.CLUB);

    }
    @Test
    public void getFinderMsg() {
        assertNotNull(weapon.getFinderMsg());
    }

    @Test
    public void showFinderMsg() {
        weapon.showFinderMsg();
    }
    @Test
    public void hasValue(){
        weapon = new Weapon(WeaponType.AXE);
        weapon.setPrefix(WeaponPrefixes.MYTHICAL);
        weapon.setSuffix(WeaponSuffixes.DOOM);
        weapon.setName(WeaponAndIkeaNames.FORNUFT);
        assertEquals(205, weapon.getValue());
    }
}