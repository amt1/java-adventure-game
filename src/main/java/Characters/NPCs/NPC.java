package Characters.NPCs;

import Characters.GameCharacter;
import Interfaces.ICanTalk;

public class NPC extends GameCharacter implements ICanTalk {

    public NPC(String name) {
        super(name);
    }

    public void say(String something) {
        System.out.println(something);
    }
}
