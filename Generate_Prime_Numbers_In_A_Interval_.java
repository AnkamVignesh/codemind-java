import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        if(n==1)
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
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a+1;i<b;i++)
        {
            if(prime(i))
            System.out.println(i);
        }
    }
}