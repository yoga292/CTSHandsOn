class Logger
{
private static Logger l1;
private Logger()
{
   System.out.println("Logger Initialized"); 
}
public static Logger getIns()
{
    if(l1==null)
    {
        l1=new Logger();
    }
    return l1;
}
}

public class SingletonPattern {
    public static void main(String[]args)
    {
      Logger l1=Logger.getIns();
      Logger l2=Logger.getIns();
      if(l1==l2)
      {
        System.out.println("Singleton implemented");
      }
      else
      {
        System.out.println("Not implmented");
      }
    }
    
}
