public class Motorcycle
{
private String make;
private String model;
private int year;
private int number;
private  boolean preOwned;
private double price;


public Motorcycle(String make,String  model, int year, int number)
{
this.make=make;
this.model=model;
this.year=year;
this.number=number;
}  


   public String getMake()
      {
      return this.make;
      }

   public String getModel()
      {
      return this.model;
      }
      
      public int getYear()
      {
      return this.year;
      }
      
      public int getNumber()
      {
      return this.number;
      }
      
      public boolean getPreOwned()
      {
      return this.preOwned;
      }
      
      public double getPrice()
      {
      return this.price;
      }

      public void setPreOwned( boolean preOwned)
      {
      this.preOwned=preOwned;
      }

      public void setPrice( double price)
      {
      this.price=price;
      }

public boolean isEqual(Motorcycle m)
{
   if(this.number==m.number)
   {
   return true;
   }

   else
   {
   return false;
   }
}



}