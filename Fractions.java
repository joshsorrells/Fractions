
public class Fractions
{

    private int num, denom;

    public Fractions(int num, int denom)
    {
        this.num = num;
        this.denom = denom;  
    }
//i like this
    public Fractions(int num)
    {
        this.num = num;
        denom = 1;
    }
    
    public Fractions()
    {
     num = 0;
     denom = 1;   
    }
    
    public Fractions(Fractions other)
    {
     num = other.num;
     denom = other.denom; 
    }
    
    public String toString()
    {   
        return num + " / " + denom;   
    }    
}
