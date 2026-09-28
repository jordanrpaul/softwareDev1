import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // P1: Print numbers 1-10
        System.out.println("Problem 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // P2: Ask the user for a number and find the factorial
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");

        int number = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("The factorial is: " + factorial);


        // P3: Add every other number starting from 1
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");

        int number2 = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number2; i += 2) {
            sum = sum + i;
        }

        System.out.println("The sum is: " + sum);


        // P4: Stop the while loop after printing once
        System.out.println("Problem 4");

        boolean run = true;

        while (run == true) {
            System.out.println("I printed once!");
            run = false;
        }


        // P5: Take a string from the user and print the reverse
        System.out.println("Problem 5");
        System.out.println("Enter a word: ");

        input.nextLine(); // clears leftover Enter key
        String word = input.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("Reversed: " + reverse);

        input.close();
    }
}

/* I figured out that charAt() lets me get one letter from a string at a time. 
I started i at 0 because that is where the first letter is and had the loop keep 
going until it reached the length of the string. Every time the loop runs i goes up 
by one so it moves to the next letter. Then println prints each letter on a new line. */