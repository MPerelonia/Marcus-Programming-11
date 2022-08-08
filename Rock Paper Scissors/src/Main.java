import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //This is asking the player to choose rock, paper, or scissors.  The scanner and randomizers are also in this area.
        System.out.println("Choose rock, paper, or scissors.  'r' for rock, 'p' for paper, and 's' for scissors.");
        Scanner scan = new Scanner(System.in);
        String player = ("");
        Random random = new Random();
        int move;
        String computer = ("");

        //This is the randomizer.  The numbers 0, 1, and 2 are given an associated move.  0 is rock, 1 is paper, and 2 is scissors.
        move = random.nextInt(3);
        if (move == 0) {
            computer = "r";
        }
        if (move == 1) {
            computer = "p";
        }
        if (move == 2) {
            computer = "s";
        }

        //This just asks the player "what do you choose?" and checks what the player typed with the scanner.
        System.out.println("What do you choose?");
        player = scan.next();

        //This checks if the player or computer wins.  If none of them win, then it checks if the 2 moves equal each other.  If they do, then it is a tie.  If the player does not choose "r", "p", or "s" it will say "invalid choice".
        if (player.equals("r") && computer.equals("p")) {
            System.out.println("You lose!");
        }
        else if (player.equals("r") && computer.equals("s")) {
            System.out.println("You win!");
        }
        else if (player.equals("p") && computer.equals("s")) {
            System.out.println("You lose!");
        }
        else if (player.equals("p") && computer.equals("r")) {
            System.out.println("You win!");
        }
        else if (player.equals("s") && computer.equals("p")) {
            System.out.println("You win!");
        }
        else if (player.equals("s") && computer.equals("r")) {
            System.out.println("You lose!");
        }
       else if (player.equals(computer)){
            System.out.println("It is a tie");
        }
       else{
           System.out.println("Invalid Choice");
        }

        //This says what the computer chose.  If the computer was randomly generated the value 0, from the code above, then it will show that the computer's choice was "rock", etc.
        if (computer.equals("r")) {
            System.out.print("Computer choice: Rock");
        }
        if (computer.equals("p")) {
            System.out.print("Computer choice: Paper");
        }
        if (computer.equals("s")) {
            System.out.print("Computer choice: Scissors");
        }

        //This says what the player chose.  If the player typed in "r", then the choice would have been "rock", etc.
        if (player.equals("r")) {
            System.out.print("      Your choice: Rock");
        }
        if (player.equals("p")) {
            System.out.print("      Your choice: Paper");
        }
        if (player.equals("s")) {
            System.out.print("      Your choice: Scissors");
        }

    }
}