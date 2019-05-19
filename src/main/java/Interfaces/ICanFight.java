package Interfaces;

import Characters.GameCharacter;

public interface ICanFight {

    boolean defend( double attackPower);

    double attack(GameCharacter opponent);
}
