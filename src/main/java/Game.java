import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {
    GameMessenger gameMessenger;
    String characterName;


    private boolean gameRunning = true;


    public Game(){
        this.gameMessenger = new GameMessenger();
        setup();
        // game loop

    }

    public void gameLoop() {
        while(gameRunning) {
                //do all game stuff
          //      Thread.sleep(0);
            gameMessenger.displayMsg("I'm looping! Wheeeeee!");
            gameRunning = false;
        }
    }

    public void setup(){
        // get language strings
        // make NPCs
        // make Creatures
        // make Player (makes Weapons)
        // make Treasures
        // create Dungeon ( size, language )
        this.characterName = gameMessenger.getInput("Enter a name for your character: ");
        gameMessenger.displayMsg(characterName + " is a fine name for a character!");
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public boolean isGameRunning() {
        return gameRunning;
    }

    public void setGameRunning(boolean gameRunning) {
        this.gameRunning = gameRunning;
    }


}
