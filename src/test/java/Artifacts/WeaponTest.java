package Artifacts;

import Artifacts.Weapons.Weapon;
import Artifacts.Weapons.WeaponPrefixes;
import Artifacts.Weapons.WeaponSuffixes;
import Artifacts.Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeaponTest {

    Weapon weapon;
    WeaponType weaponTypeInstance;
    WeaponPrefixes weaponPrefix;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.AXE);
        weapon.setPrefix(WeaponPrefixes.MYTHICAL);
        weapon.setSuffix(WeaponSuffixes.DOOM);

    }

    @Test
    public void hasType(){
        assertEquals("Axe", weapon.getType());
    }

    @Test
    public void hasPrefix(){
        assertEquals("Mythical", weapon.getPrefix());
    }

    @Test
    public void hasSuffix(){
        assertEquals("Doom", weapon.getSuffix());
    }

    @Test
    public void hasAttackStrength() {
        assertEquals(525, weapon.getAttackStrength());
    }


    @Test
    public void hasWear(){
        assertEquals(1, weapon.getWear());
    }

    @Test
    public void hasAccuracy(){
        assertEquals(1, weapon.getAccuracy(), 0.01);
    }
    @Test
    public void hasBaseAttackStrength() {
        assertEquals(50, weapon.getBaseAttackStrength());
    }

    @Test
    public void hasName(){
        System.out.println(weapon.getName());
        assertNotNull(weapon.getName());
    }

    @Test
    public void hasBaseWear(){
        assertEquals(10, weapon.getBaseWear());
    }

    @Test
    public void hasBaseAccuracy(){
        assertEquals(0.5, weapon.getBaseAccuracy(), 0.01);
    }
    @Test
    public void hasFullName(){
        System.out.println(weapon.getFullName());
        assertNotNull(weapon.getFullName());
    }

    @Test
    public void canBeWornOut() {
        weapon.wearOut(1);
        assertEquals(true, weapon.isWornOut());
    }
    @Test
    public void hasBaseValue(){
        weapon = new Weapon(WeaponType.AXE);
        assertEquals(50, weapon.getBaseValue());
    }

}
