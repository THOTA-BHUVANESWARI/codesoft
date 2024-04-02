import java.util.*;
class numbergame
{
    public static void main(String arg[])
    {
        int chances=8;//Number of attempts allowed to guess the
        int finals=0; //number by user
        System.out.println("hey\n");
        System.out.println("welcome to the game: ");
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number:");
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        System.out.println("Random Number: " + randomNumber);
        boolean isCorrect = false;
        while (!isCorrect)  
        { 
            System.out.print("Enter a number between 1 to 100 : ");  
            for(int i=0;i<chances;i++)
            {
                System.out.println("Attempt "+(i+1)+" out of "+chances+".");
            
                int num = sc.nextInt();
            
                if (num == randomNumber)  
                {   
                    System.out.println("Congratulations! You guessed correctly.");    
                    isCorrect = true;    
                }    
                else if (num > randomNumber)    
                {          
                    System.out.println("Your number is too high. Try again.");            
                }          
                else
                {
                    System.out.println("your number is too low.Try again");
                }
            }
            System.out.println("\nSorry, you have no more chances left.\nThe correct number was: "+randomNumber);
    
               // System.out.println("\nSorry, you've used all your attempts. The correct number was "+randomNumber);
        }
        if(!isCorrect)
            {
                System.out.println("\nSorry, you've used all your attempts. The correct number was "+randomNumber);       
            }   
    }
}