

public class Runner
{
    public static void main(String wenner[])
    {
     Fractions myFraction = new Fractions(5,6); 
     Fractions newObject = new Fractions(3,4);
     Fractions multiplied = myFraction.multiplyFractions(newObject);
     System.out.println(multiplied);
    } 
}
