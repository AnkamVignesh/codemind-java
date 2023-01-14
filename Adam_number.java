import java.util.Scanner;
class main
{
    public static int rev(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t;
        n=sc.nextInt();
        t=rev(n);
        if(n*n==rev(t*t))
           System.out.println("True");
        else
           System.out.println("False");
    }
}