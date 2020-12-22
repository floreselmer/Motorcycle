public class Employee
{

private String firstName;
private String lastName;
private double hourlyRate;
private double totalPay;
public static int numberOfEmployees=0;

public Employee (String firstName, String lastName)
{

this.firstName=firstName;
this.lastName=lastName;
numberOfEmployees=numberOfEmployees+1;

}

public Employee (String firstName, String lastName, double hourlyRate)
{

this.firstName=firstName;
this.lastName=lastName;
this.hourlyRate=hourlyRate;
numberOfEmployees=numberOfEmployees+1;

}

   public double getHourlyRate()
   {
   return this.hourlyRate;
   }

   public void setHourlyRate(double hourlyRate)
   {
   this.hourlyRate=hourlyRate;
   }
   
   public double getTotalPay()
   {
   return this.totalPay;
   }
   
   public int getNumberOfEmployees()
   {
   return this.numberOfEmployees;
   }

public String toString()
{

String back = "Employee: "+firstName+" "+lastName+ '\n' + "Rate: $"+hourlyRate + " per hour"+ '\n'+ "Total Pay: $"+ totalPay + '\n' ;

return back;
}
   

public void computePay(int hoursWorked)
{

   if(hoursWorked <= 8) 
   {
      totalPay = hoursWorked * hourlyRate;
   }  
   else 
   {
       totalPay = (8 * hourlyRate) + ((hoursWorked - 8) * (hourlyRate*1.5));
   }

 }







}