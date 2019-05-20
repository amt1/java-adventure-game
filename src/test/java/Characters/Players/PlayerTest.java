package Characters.Players;

import Artifacts.Weapons.Weapon;
import Artifacts.Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;
    Player player2;

    @Before
    public void before() {
        player = new Player("Fluffyboy", PlayerClass.BARBARIAN, Role.SHAMAN);
        player2 = new Player("Freddy", PlayerClass.HUMAN, Role.CLERIC);

    }

    @Test
    public void getCurrentWeapon() {
        assertEquals(WeaponType.CLUB, player.getCurrentWeapon().getType());
    }

    @Test
    public void setCurrentWeapon() {
        player.setCurrentWeapon(player.roleWeapon);
        assertEquals(WeaponType.STAFF, player.getCurrentWeapon().getType());

    }

    @Test
    public void getWeapons() {
    }

    @Test
    public void addWeapon() {
        Weapon weapon = new Weapon(WeaponType.AXE);
        System.out.println(player.getWeapons());
    }

    @Test
    public void modifyStatsByWeapon() {
    }

    @Test
    public void getRole() {
        assertEquals(Role.SHAMAN, player.getRole());
    }

    @Test
    public void setRole() {
        player.setRole(Role.WARRIOR);
        assertEquals(Role.WARRIOR, player.getRole());

    }

    @Test
    public void say() {
        player.say("Hello");
    }

    @Test
    public void getFullName() {
        player.say(player.getFullName());
    }

    @Test
    public void getRoleName() {
        assertEquals("Shaman", player.getRole().getName());

    }

    @Test
    public void getPlayerClass() {
        assertEquals(PlayerClass.BARBARIAN, player.getPlayerClass());
    }

    @Test
    public void getClassName() {
        assertEquals("Barbarian", player.getPlayerClass().getName());
    }

    @Test
    public void getAccuracy() {
        assertEquals(player.getCurrentWeapon().getAccuracy(), player.getAccuracy());
    }

    @Test
    public void getBaseAttackStrength() {
        assertEquals(100, player.getBaseAttackStrength());
    }

    @Test
    public void getBaseHitPoints() {
        assertEquals(130, player.getBaseHitPoints());
    }

    @Test
    public void getBaseLuck() {
        assertEquals(65, player.getBaseLuck());
    }

    @Test
    public void getBaseMana() {
        assertEquals(70, player.getBaseMana());
    }

    @Test
    public void getBaseIntelligence() {
        assertEquals(105, player.getBaseIntelligence());

    }

    @Test
    public void attackAccuracy() {
        player.setAccuracy(90);
        System.out.println("accuracy: " + player.getAccuracy());
        System.out.println("attack accuracy: " + player.attackAccuracy());
    }

    @Test
    public void attack() {
        player.setAccuracy(90);
        player.attack(player2);
    }

    @Test
    public void displayMsg() {
        player.displayMsg("hello");
    }
    @Test
    public void setAccuracy(){
        player.setAccuracy(9);
        assertEquals(9, player.getAccuracy());
    }
}