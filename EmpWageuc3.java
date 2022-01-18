public class EmpWageuc3
{
   public static void main(String[] arg)
   {
    int isfulltime = 1;
    int isparttime =2;
    int wageperhour = 20;
    int fulldayhour = 8;
    int parttimehour =4;
    double empcheck = Math.floor(Math.random() * 10) % 3;
    if (empcheck == isfulltime)
    {
       int totalsalary = (wageperhour * fulldayhour);
       System.out.println("Total Salary is" + " " +totalsalary);
    }
    else if (empcheck == isparttime)
    {
       int totalsalary = (wageperhour * parttimehour);
       System.out.println("Total Salary is" + " " +totalsalary);
    }
    else
    {
       System.out.println("Salary is 0");
    }

   }

}
