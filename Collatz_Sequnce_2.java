import java.util.Scanner;
class Main
{
    public static int collatz(int n)
    {
        int c=0;
        while(n!=0)
        {
            if(n==1)
              break;
            else
            {
                if(n%2==0)
                {
                    n=n/2;
                }
                else
                {
                    n=n*3+1;
                    
                }
                c++;
            }
            
            
        }
        return c;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0,d=0;
        
        for(int i=a;i<=b;i++)
        {
            if(collatz(i)>max)
            {
                max=collatz(i);
                d=i;
            }
        }
        
        System.out.println(d);
        
    }
}