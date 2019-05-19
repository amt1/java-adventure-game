package Characters.Players;

import Artifacts.Weapons.Weapon;
import Characters.GameCharacter;
import Interfaces.ICanTalk;

import java.util.ArrayList;

public class Player extends GameCharacter implements ICanTalk {

    Weapon currentWeapon;
    Weapon classWeapon;
    Weapon roleWeapon;
    ArrayList<Weapon> weapons;
    Role role;
    String roleName;
    PlayerClass playerClass;
    String className;


    public Player(String name, PlayerClass playerClass, Role role){
        super(name);
        this.role = role;
        this.roleName = role.getName();
        this.playerClass = playerClass;
        this.className = playerClass.getName();
        this.fullName = name + ", a " + className + " " + roleName;
        this.classWeapon = new Weapon( playerClass.getDefaultWeapon());
        this.roleWeapon = new Weapon( role.getDefaultWeapon());
        this.weapons = new ArrayList<>();
        addWeapon(classWeapon);
        addWeapon(roleWeapon);
        setCurrentWeapon(classWeapon);
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
        modifyStatsByWeapon(currentWeapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void modifyStatsByWeapon(Weapon weapon){

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
