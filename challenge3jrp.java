import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something");
        String word = scan.nextLine();

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}