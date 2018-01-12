
public class Fractions
{
    private int num, denom;
    
    public Fractions(int num, int denom)
    {
        if(denom == 0)
        {
         throw new IllegalArgumentException("Denom must be greater than 0");   
        }
        else
        {
        this.num = num;
        this.denom = denom; 
        } 
        simplify();
    }

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
    
    public Fractions inverse ()
    {
     if(num == 0) return null;
     return new Fractions(denom, num);   
    }   
    
    public Fractions multiplyFractions(Fractions a)
    {
     return new Fractions(num * a.num, denom * a.denom);
        
    }   
    
    public Fractions recipFrac()
    {
      return new Fractions(denom, num);
    }
    
    public Fractions divide(Fractions f)
    {
        return new Fractions(num*f.denom, denom*f.num);
    }
    
    public static int gcf(int a, int b)
    {
    int min = Math.min(a, b);
    for (int i = min;i > 0; i++)
    {
    if(a%i == 0 && b%i == 0) return i;    
    }
    return 1;
    }
    
    private void simplify()
    {
       int factor = gcf(num, denom);
       num/=factor;
       denom/=factor;
    }
            
    
    
    
    public String toString()
    {   
        return num + " / " + denom;   
    }
    
    
}
