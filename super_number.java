import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    
    public static int issum(int n)
    {
        int sum=0;
         while(n>0)
         {
             sum=sum+n%10;
             n=n/10;
         }
         return sum;
    }
    
    public static int issumfact(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                if(prime(i))
                {
                    sum=sum+issum(i);
                    n=n/i;
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
         a=issum(n);
         b=issumfact(n);
         
         if(a!=b || prime(n))
          System.out.println(0);
         else
           System.out.println(1);
        
        
    }
}