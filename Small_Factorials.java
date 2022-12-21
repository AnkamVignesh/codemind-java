import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int t,n,prod=1,f=1;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            f=1;
            for(int i=n;i>=1;i--)
            {
                f=f*i;
            }
            System.out.println(f);
            t--;
        }
    }
}