//Ashley Gutierrez Carreto
//October 3, 2023
//Lab 7 Using a loop
//A list of nonnegative numbers integers which tell you the smallest, largest,
// and the average of all the integers. As well how many integers were typed
//in the program. It can be ended when the user enters a negative 
//value that was not used in what was stated to display above. 
import java.util.Scanner;
public class UsingALoop
{
   public void ReadData ()
   
   {
      double sum;
      int numbers;
      double next = 0;
      int count = 0;
      int totalNumbers = 0;
      Scanner keyboard = new Scanner(System.in);
       
      System.out.println ("Enter a list of non-negative integers. "
                        + "Then enter a negative number when finished.");
      // User inputs random numbers 
       
       
      //following code is to help to find the average 
      sum = 0;
      numbers = 0;
      next = keyboard.nextDouble();
       
      double smallest = next;
      double largest = next;
      while (next >= 0)
      {
         sum = sum + next;
         numbers++;
         next = keyboard.nextDouble();
         
         if (next < smallest && next >= 0)
         {
            smallest =  next ;
         }
         
         if ( next > largest )
         {
            largest = next ;
         }

      }
      
      if (numbers > 0)
      System.out.println ("The average is " +
                         (sum / numbers)); //prints average
                   
      
      if (numbers < totalNumbers);
      {
         System.out.println ("The total amount of numbers " +
                             "you have typed is: " + numbers);
         // prints out the total amount of numbers
      }
      
      System.out.println ("The smallest integer is: "
                             + smallest );
      System.out.println ("The largest integer is: "
                             + largest );
      //states the largest/smallet integer 

    
   } 
}