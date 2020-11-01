package se.lexicon.linda;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Scanner scanner = new Scanner(System.in);
     String input = "";

        System.out.println( "inter first number" );

        int num1 = scanner.nextInt();

        System.out.println(num1);

        System.out.println( "inter second number" );

        int num2 = scanner.nextInt();

        System.out.println(num2);

        int result = scanner.nextInt();


        char operator = '+';
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            System.out.print("Result ="+result);

        }

    }
}
