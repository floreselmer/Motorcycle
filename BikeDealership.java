/* 
 * CS207-1 NEIU Spring 2019
 * This class models a motorcycle dealership.  Each software representation of a
 * motorcycle that this class uses needs to track it's own values for make, model,
 * year, number, pre owned, and price.  Likewise, each motorcycle needs to be able
 * compare itself to another motorcycle for equality.
 * 
 * Do not modify this file!
 */
public class BikeDealership
{
   public static void main( String[] args )
   {
      // Instantiate objects of type Motorcycle
      Motorcycle m1 = new Motorcycle( "Harley-Davidson", "Softail", 2018, 1 );
      Motorcycle m2 = new Motorcycle( "Kawasaki", "Ninja", 2004, 2 );
      Motorcycle m3 = new Motorcycle( "Honda", "Gold Wing", 2005, 3 );
      Motorcycle m4 = new Motorcycle( "Ducati", "Diavel", 2019, 4 );
      
      // Use their setters to store their status as used or new
      m1.setPreOwned( false );
      m2.setPreOwned( true );
      m3.setPreOwned( true );
      m4.setPreOwned( false );
      
      // Set each price
      m1.setPrice( 11244.0 );
      m2.setPrice( 8350.0 );
      m3.setPrice( 4800.0 );
      m4.setPrice( 13250.0 );

      // What type of an array is this?  And what is it holding?
      Motorcycle[] forSale = new Motorcycle[4];
      forSale[0] = m1;
      forSale[1] = m2;
      forSale[2] = m3;
      forSale[3] = m4;
      
      System.out.println( "Motorcycles in inventory with prices: " );
      String output;
      
      // What is this loop doing?
      for( int index = 0; index < forSale.length; index++ )
      {
         output = "Make: " + forSale[index].getMake() + "\n";
         output += "Model: " + forSale[index].getModel() + "\n";
         output += "Year: " + forSale[index].getYear() + "\n";
         output += "Used?: " + forSale[index].getPreOwned() + "\n";
         output += "Asking: $" + forSale[index].getPrice() + "\n";
         System.out.println( output );
      }
      
      // A new motorcycle enters the lot. Is it already accounted for?
      Motorcycle m5 = new Motorcycle( "Kawasaki", "Ninja", 2004, 2 );
      
      boolean same = m5.isEqual(m2);
      System.out.println( "Is m5 equal to m2? " + same );
      same = m5.isEqual( m3 );
      System.out.println( "Is m5 equal to m3? " + same );
   }
}