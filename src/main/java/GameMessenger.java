import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameMessenger {

    Scanner input = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void GameMessenger(){

    }

    public void displayMsg(String msg) {
        System.out.print(msg);
    }

    public String getInput(String outputMsg){
        String inputString = "";
        displayMsg(outputMsg + "_");
        // inputString =  input.nextLine();
        try {
            inputString = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return inputString;
    }
}
