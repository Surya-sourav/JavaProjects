import java.util.Scanner;

public class CGPA {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's Detils :");
        System.out.println("Enter the Student's name:");
        String name= sc.nextLine();
        System.out.println("Enter the Student's Roll number :");
        int Roll=sc.nextInt();
        System.out.println(" Now Enter the Student's Market Details  :");
        System.out.println("============================================");
        System.out.println(" Enter the Physics Mark");
        double P=sc.nextDouble();
        System.out.println(" Enter the Mathematics Marks");
        double M=sc.nextDouble();
        System.out.println("Enter the Computer Science Marks");
        double cmpt=sc.nextDouble();
        System.out.println(" Enter the Basic Electrical Engineering Marks ");
        double bee=sc.nextDouble();
        System.out.println(" Enter the Communicative English Marks");
        double ce=sc.nextDouble();
        System.out.println("======================================================");
        Evaluate student1= new Evaluate();
        student1.nm=name;
        student1.RN=Roll;
        student1.Phy=P;
        student1.Math=M;
        student1.Compt=cmpt;
        student1.BEE=bee;
        student1.CE=ce;
        student1.Calculate();


    }
}

class Evaluate
{   
    String nm; int RN;
     double Phy , Math , Compt, BEE, CE;

    void Calculate()
    {
        double avg=(Phy+Math+Compt+BEE+CE)/5;
        double per=((Phy+Math+Compt+BEE+CE)/500)*100;
        double cgpa=per/9.5;
        Display(avg,per,cgpa);
    }

     void Display(double avg,double per,double cgpa)
     {  
         System.out.println("===============STUDENT'S CREDENTIAL'S=================");
         System.out.println("Student's Name :"+nm);
         System.out.println("Student's Roll Number  :"+RN);
         System.out.println("Student's Average Mark"+avg);
         System.out.println("Student's Percentage :"+per);
          System.out.println("======================================================");

         if(cgpa<4.5)
        {
            System.out.println("You have Failed this Semester");
        }
        else if(cgpa>4.5 && cgpa<6.5)
        {
            System.out.println("Your grade is C ");                     
        }
        else
        if(cgpa>6.5&&cgpa<8.0)
        {
            System.out.println("Your grade for this sem is B");
        }
        else
        if(cgpa>8.0 && cgpa<10.0)
        {
            System.out.println("Your grade for this sem is A & its outstanding !! KEpp it up ");
        }

         
     }

}
