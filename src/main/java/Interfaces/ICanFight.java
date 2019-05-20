package Interfaces;

import Characters.GameCharacter;

public interface ICanFight {

    boolean defend( double attackPower);

    double attack(ICanFight opponent);

    public String getName();
}
