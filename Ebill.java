import java.util.Scanner;
public class Ebill{

    public static void main(String args[])
    {   
         Estimated Units = new Estimated();
          System.out.println("Enter the Unit :- ");
          Scanner inp = new Scanner(System.in); // Create's a Scanner Object.
          double res= inp.nextDouble(); 
          Units.unit=res; 
          Units.Calculate(); 
    
    }
}

class Estimated{

    double unit , TEB;
    void Calculate()
    {
        if(unit<=100)
        {
            TEB=(unit*10);
            Display(TEB);
        }
        else
        if(unit<=200)
        {
            TEB=((100*10)+(unit-100)*15);
            Display(TEB);
        }
        else
        if(unit<=300)
        {
            TEB=(100*10)+(100*15)+(unit-200)*20;
            Display(TEB);
        }
        else
        if(unit>300)
        {
            TEB=(100*10)+(100*20)+(unit-300)*25;
            Display(TEB);
        }
    }

    void Display( double teb)
    {
        System.out.println("Your Electric Bill is Rs: "+teb +"/-");
        
    }
}