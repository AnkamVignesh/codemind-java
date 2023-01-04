import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        int i,count=0;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
            
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d1,n,d2,t;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            
            for(int i=n;;i++)
            {
                if(isprime(i))
                {
                    d1=i;
                    break;
                }
            }
            for(int i=n;;i--)
            {
                if(isprime(i))
                {
                    d2=i;
                    break;
                    
                }
            }
            if((d1-n)>=(n-d2))
              System.out.println(d2);
            else
              System.out.println(d1);
              t--;
        }
    }
    
}