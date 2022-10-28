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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,x=0,y=0,found=0,count=0,n;
        t=sc.nextInt();
        while(t>0)
        {
           n=sc.nextInt();
           for(int i=2;i<=(int)Math.sqrt(n);i++)
           {
               if(n%i==0 && prime(i) && prime(n/i))
               {
                   x=i;
                   y=n/i;
               }
               if(x!=y)
               {
                   found=1;
                   break;
               }
           }
           if(found==1 && x!=y)
           {
               System.out.println("YES");
               x=0;
               y=0;
               
           }
           else
           System.out.println("NO");
           t--;
        }
        
        
    }
}