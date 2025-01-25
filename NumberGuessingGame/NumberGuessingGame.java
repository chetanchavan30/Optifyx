import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secretNumber = r.nextInt(1, 100);
        int numberOffAttempts = 5;
        int i = 1;
        int userGuess = 0;
        int highNumber = 0;
        int lowNumber = 0;
        boolean isCorrect = false;

        System.out.println("================================================");
        System.out.println("Number Guessing Game");
        System.out.println("================================================");
        System.out.println("Pickup number between 1 to 100! you will get 5 turns.");
        System.out.println("Enter your gusee : ");
        userGuess = sc.nextInt();

        while (i <= 5) {

            if (userGuess == secretNumber) {
                isCorrect = true;
                break;
            } else if (userGuess > secretNumber) {
                if (userGuess > secretNumber && secretNumber>highNumber) {
                    highNumber = userGuess;
                }
                System.out.println("Sorry, That is to high");
                System.out.println("Pickup number between " + ((lowNumber) + 1) + " - " + highNumber
                        + " and turns left : " + (numberOffAttempts - i));
                userGuess = sc.nextInt();
            } else if (userGuess < secretNumber) {
                if (userGuess > lowNumber) {
                    lowNumber = userGuess;
                }

                System.out.println("Sorry! That is to low");
                System.out.println("Pickup number between " + ((lowNumber) + 1) + " - " + highNumber
                        + " and turns left : " + (numberOffAttempts - i));
                userGuess = sc.nextInt();
            }

            i++;
        }

        if (isCorrect) {
            System.out.println("You Win! The number was : " + secretNumber);
        } else {
            System.out.println("Sorry, You Lose The Game. The Secret Number was : "+secretNumber);
        }
    }
}
