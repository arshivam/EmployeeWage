public class EmpWageuc4
{

   public static void main(String[] args)
   {
    int isfulltime = 1;
    int isparttime = 2;
    int wageperhour = 20;

    int empwage = 0;
    int emphrs = 0;

    int empcheck = (int) Math.floor(Math.random() * 10) % 3;

    switch (empcheck)
    {
     case 2:
          emphrs = 4;
     break;
     case 1:
          emphrs = 8;
     break;
     default:
          emphrs = 0;
     break;
    }
     empwage = (emphrs * wageperhour);
     System.out.println("Employe salary is :" + empwage );

   }

}

