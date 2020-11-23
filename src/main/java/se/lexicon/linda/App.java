package se.lexicon.linda;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
     Scanner scanner = new Scanner(System.in);


     char operator;

     boolean itIsRihgt =true;


     while (itIsRihgt) {

         System.out.println("inter first number");


         int num1 = scanner.nextInt();

         System.out.println("inter second number");

         int num2 = scanner.nextInt();


         System.out.println("select the operator");

         operator = scanner.next().charAt(0);


         int result = 0;


         switch (operator) {
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
             default:
                 System.out.println(operator + " The operator is not available");
         }
         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


         System.out.println("You can do it again");
     }



    }
}


