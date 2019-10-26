package kportufe;
import java.util.*;


public class MyClass //extends Other
{
    static void playGame()
    {
        int userGuess;
        int computerGuess;
        int count;

        computerGuess = (int)(100 *Math.random()) + 1;
        count = 0;
        System.out.println();
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter your guess between 1 and 100: ");


        while (true)
        {
            userGuess = x.nextInt();
            count++;
            if (userGuess == computerGuess)
            {
                System.out.println("You guessed it right " + count + " guesses! My number was " + computerGuess);
                break;
            }
            if (count == 6)
            {
                System.out.println("You did not get the number in 6 guesses.");
                System.out.println("You lose. The computer's guess was "+ computerGuess);
                break;
            }
            if (userGuess < computerGuess)
            {
                System.out.println("That's too low. Try again: ");
                System.out.println("Enter another guess: ");
            }
            else if (userGuess > computerGuess)
            {
                System.out.println("That is too high. Try again: ");
                System.out.println("Enter another guess: ");
            }
           // System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        playGame();
        int userInput;
        while(true)
        {
            System.out.println("Do you want to play again? Press (0) to continue or (1) to exit" );
            userInput = x.nextInt();
            if (userInput == 0)
                playGame();

            else if (userInput == 1)
            {
                System.out.println("ok bye");
                break;
            }
            else
                playGame();
        }
    }
}















