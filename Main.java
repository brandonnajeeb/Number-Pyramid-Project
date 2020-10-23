import java.util.Scanner;
public class Main
{

   public static void main(String[] args)
   {
       Scanner myInput = new Scanner (System.in);

       
       System.out.println("Please enter a number between 1 and 20: ");
        int value = myInput.nextInt();

        while (value < 1 || value > 20)
        {
          System.out.println("Your number is not valid.");
          System.out.println("Please enter a number between 1 and 20");
          value = myInput.nextInt();
        }

        
        
        

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

