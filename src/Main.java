import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Hello world");
        //single line comment
        /*
        block comment
         */

        //declare a string named y
        String y;
        //declared a boolean named EOO
        boolean evenOrOdd;
        //declare an int named maxNum AND initialized it as 12
        int maxNum = 12;

        //initialize an already declared variable
        y = "Hello World";

        //can print the variable instead of a string
        System.out.println(y);
        System.out.print(maxNum);
        //initialize boolean
        evenOrOdd = true;
        System.out.println(evenOrOdd);

        //Scanner class declaration/initialization
        Scanner sc = new Scanner(System.in);
        //prompt user
        System.out.println("Please tell me about your day: ");

        //declaring and initializing "input" string, based on input from user
        String input = sc.nextLine();
        //repeat/show what user entered
        System.out.println(input);

    }

}
