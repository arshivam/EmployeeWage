public class EmpWageuc6
{
   public static final int isparttime = 1;
   public static final int isfulltime = 2;
   public static final int wageperhour = 20;
   public static final int Num_Of_Workingdays = 20;
   public static final int MaxHrsinMonth = 100;

    public static void main(String[] args)
  {
     int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs =0;

   while (totalEmpHrs <= MaxHrsinMonth &&
          totalWorkingDays < Num_Of_Workingdays)
    {
      int empHrs = 0;
      totalWorkingDays++;
      int empcheck = (int) Math.floor(Math.random() * 10) % 3;
      switch (empcheck)
      {
        case isparttime:
          empHrs = 4;
        break;
        case isfulltime:
          empHrs = 8;
        break;
        default:
          empHrs = 0;
        break;
      }
      totalEmpHrs += empHrs;
      int empWage =empHrs * wageperhour;
      totalEmpWage += empWage;
    }

  }

}
