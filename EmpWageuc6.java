public class EmpWageuc6
{
    public static void main(String[] arg)
  {
   int wageperhour = 20;
   int workperday = 8;
   int workingdays = 1;
   int salary = 0;

   while (workingdays<=20)
    {
     int monthlysalary =(wageperhour * workperday * workingdays);
     salary = monthlysalary;
     workingdays++;
    }
      System.out.println("Monthysalary is :"+salary);

  }
}
