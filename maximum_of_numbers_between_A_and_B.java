import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,a,b,i;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int max=x[0];
        
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                if(max<x[i])
                max=x[i];
                count++;
                if(count==0)
                System.out.println("-1");
            }
        }
        if(count==0)
          System.out.println("-1");
        else
          System.out.print(max);
        
    }
}