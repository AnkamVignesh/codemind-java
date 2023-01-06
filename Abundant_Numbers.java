import java.util.Scanner;
class Main
{
    public static boolean abundant(int n)
    {
        int sum=0;
        int temp=n;
        for(int i=1;i<=(int)n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>temp)
        return true;
        else
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(abundant(n))
          System.out.println("True");
         else
          System.out.println("False");
    }
}