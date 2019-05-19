package Characters.Players;

import Artifacts.Weapons.Weapon;
import Characters.GameCharacter;
import Interfaces.ICanTalk;

import java.util.ArrayList;

public class Player extends GameCharacter implements ICanTalk {

    Weapon currentWeapon;
    ArrayList<Weapon> weapons;
    Role role;
    String roleName;


    public Player(String name, Role role){
        super(name);
        this.role = role;
        this.roleName = role.getName();
        this.fullName = name + ", a " + roleName;
        this.weapons = new ArrayList<>();
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void say(String something) {
        System.out.println(something);
    }

    public String getFullName() {
        return fullName;
    }
}
