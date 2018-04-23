package junittest;

public class MyTest {

    private int result;
    
    public void add(int a, int b)
    {
        result = a + b ;
    }
    
    public void substract(int a, int b)
    {
        result = a - b ;
    }
    
    
    public void multipuly(int a,int b)   
    {
    	
    }
    
    public void divide(int a,int b)
    {
    	result = a/b ;
    }
    
    public void square(int a)
    {
    	result = a*a ;
    }
    
    public void clear()
    {
    	result = 0 ;
    }
    
    public void output()
    {
    	System.out.println("test success");
    }
    
    
    public int getresult()
    {
        return result;
    }
    
}