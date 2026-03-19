import java.util.Random;
import java.util.Scanner;

class Game { 
    private int number;
    private int userInput;
    private int noOfGuess = 0;

    Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
    }

    void takeUserInput(Scanner sc) {
        System.out.println("guess the number : ");
        userInput = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuess++;

        if (userInput == number) {
            System.out.println("well done you guessed your number right in " + noOfGuess + " attempts");
            return true;
        } 
        else if (userInput < number) {
            System.out.println("Wrong its Too Low , try another mate!");
        } 
        else {
            System.out.println("right naahhh , too hight , try another mate ");
        }

        return false;
    }
}

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        boolean b = false;

        while(!b){
            g.takeUserInput(sc);
            b = g.isCorrectNumber();
        }
    }
}
