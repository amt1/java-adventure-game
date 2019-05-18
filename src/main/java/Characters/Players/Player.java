package Characters.Players;

import Characters.GameCharacter;
import Interfaces.ICanTalk;

public class Player extends GameCharacter implements ICanTalk {

    public Player(String name){
        super(name);
    }

    public void say(String something) {
        System.out.println(something);
    }
}
