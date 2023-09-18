import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String args[])
    {
        System.out.println("1. Rock ");
        System.out.println("2. Paper ");
        System.out.println("3. Scissor ");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("Yout choice has been made Finally , Wait for the Computer's Response");
        Analyse choice = new Analyse();
        Random rand=new Random();
        int ran=rand.nextInt(100);
         choice.ch= input;
         choice.random=ran;
         choice.Calculate();
        
    }
}

class Analyse{
    int ch; 
    int random;
     void Calculate()
{
    switch(ch)
    {
        case 1: 
        if(random%2==0)
        { 
            System.out.println("Congratulations ! You have won the game , The Computer has choosen Scissor");
        }
        else 
        {
            System.out.println("Better Luck next time ");

        }
        break;
        
        case 2:
        if(random%2==0)
        { 
            System.out.println("Congratulations ! You have won the game , The Computer has choosen Rock");
        }
        else 
        {
            System.out.println("Better Luck next time ");

        }
        break;

        case 3: 

        if(random%2==0)
        { 
            System.out.println("Congratulations ! You have won the game , The Computer has choosen Rock");
        }
        else 
        {
            System.out.println("Better Luck next time ");

        }
        break;
        
    }

}
}
