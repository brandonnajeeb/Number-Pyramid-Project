/* 
README: This is a program that prompts the user to enter a number between 1 and 20. The program then outputs a number pyramid from 1 to the number input by the user
Brandon Najeeb 10/22/20
*/


import java.util.Scanner;
public class Main
{

   public static void main(String[] args)
   {
     // creating new Scanner variable
       Scanner myInput = new Scanner (System.in);

       // Statement prompting user to enter an integer
       System.out.println("Please enter an integer between 1 and 20: ");

       // variable that captures value of next keyboard 
       // integer
        int value = myInput.nextInt();

        /* loop designed to check value against 
         parameters. If it doesn't fall in the 
         right range, the loop will prompt the 
        user to enter in a correct value */

        while (value < 1 || value > 20)
        {
          System.out.println("Your number is not valid.");
          System.out.println("Please enter a number between 1 and 20");
          value = myInput.nextInt();
        }

        
        // loop that creates number pyramid
        

        for (int i = 1 ; i <= value ;i++)
        {
          for (int j = 1; j < i ; j++)
          {
             System.out.print(j);
             
          }
          System.out.println(i);
        }


   }
}

