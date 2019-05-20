package Characters.Players;

import Artifacts.Weapons.Weapon;
import Characters.GameCharacter;
import Interfaces.ICanFight;
import Interfaces.ICanTalk;

import java.util.ArrayList;
import java.util.Random;

public class Player extends GameCharacter implements ICanTalk {

    protected Weapon currentWeapon;
    protected Weapon classWeapon;
    protected Weapon roleWeapon;
    protected ArrayList<Weapon> weapons;
    protected Role role;
    protected String roleName;
    protected PlayerClass playerClass;
    protected String className;
    protected int accuracy;
    protected int baseAttackStrength, attackStrength;
    protected int baseHitPoints, hitPoints;
    protected int baseLuck, luck;
    protected int baseMana, mana;
    protected int baseIntelligence, intelligence;
    private Random rand = new Random();


    public Player(String name, PlayerClass playerClass, Role role){
        super(name);
        this.role = role;
        this.roleName = role.getName();
        this.playerClass = playerClass;
        this.className = playerClass.getName();
        this.fullName = name + ", a " + className + " " + roleName;
        this.baseAttackStrength = playerClass.getBaseAttackStrength() + role.getModifyAttackStrength();
        this.baseHitPoints = playerClass.getBaseHitPoints() + role.getModifyHitPoints();
        this.hitPoints = this.baseHitPoints; // add armour etc later
        this.baseLuck = playerClass.getBaseLuck() + role.getModifyLuck();
        this.luck = baseLuck;
        this.baseMana = playerClass.getBaseMana() + role.getModifyMana();
        this.mana = baseMana;
        this.baseIntelligence = playerClass.getBaseIntelligence() + role.getModifyIntelligence();
        this.intelligence = baseIntelligence;
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
        this.accuracy = weapon.getAccuracy();
        this.attackStrength = this.baseAttackStrength + weapon.getAttackStrength();
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

    public Weapon getClassWeapon() {
        return classWeapon;
    }

    public Weapon getRoleWeapon() {
        return roleWeapon;
    }

    public String getRoleName() {
        return roleName;
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public String getClassName() {
        return className;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getBaseAttackStrength() {
        return baseAttackStrength;
    }

    public int getBaseHitPoints() {
        return baseHitPoints;
    }

    public int getBaseLuck() {
        return baseLuck;
    }

    public int getBaseMana() {
        return baseMana;
    }


    public int getBaseIntelligence() {
        return baseIntelligence;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int attackAccuracy() {
        return (accuracy % (rand.nextInt(accuracy) + 1));
    }

    public double attack (ICanFight opponent){
        String msg = "";
        double attackPower = 0;
        int temp = (attackAccuracy() * attackStrength * luck);
        if (temp == 0) {
            msg = name + " missed!";
        } else {
            attackPower = temp / 10000;
            msg = name + " attacks " + opponent.getName() + " with " + attackPower + "...";
        }
        displayMsg(msg);
        return attackPower;
    }

    public void displayMsg(String msg) {
        System.out.println(msg);
        // pretty sure this should be happening in a runner type file not here!
    }
}
