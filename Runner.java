

public class Runner
{
    public static void main(String wenner[])
    {
     Fractions myFraction = new Fractions(18,12); 
     Fractions newObject = new Fractions(3,4);
     Fractions reciprocal = myFraction.recipFrac();
     System.out.println(myFraction);
     /*Fractions myFraction = null;
     try
     {
      myFraction = new Fractions(5,0);   
     }
     catch(Exception e)
     {
     System.out.println("Fractions need a non-zero deonominator");    
     }
     System.out.println(myFraction);
     */
    }  
}
