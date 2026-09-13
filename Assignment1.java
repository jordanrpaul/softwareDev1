// Assignment 1 | Software Development I | Jordan Paul | Prof Melissa Chodziutko aka Melissaaaaa ✌️💕 | 9-13-2026

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        // Would we want to do: int age = sc.nextInt(); instead of String age = sc.nextLine();? - Since age is a number?
        String message = "You are " + age + " years old.";
        int num1 = 10;
        int num2 = 37;
        int sum = num1 + num2;
        System.out.println(message);
        System.out.println("Sum is: " + sum);
    }
    
}

/*  What I learned: I learned the basic structure and setup of a Java program. 
I also learned how to use the Scanner class to get user input and how to concatenate Strings with variables. 
Finally, I learned the difference between int and String data types.
*/
