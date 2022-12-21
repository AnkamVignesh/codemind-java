import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
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
        int a,b,c,i,n=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        for(i=c+1;;i++)
        {
            n++;
            if(prime(i))
            {
                break;
            }
        }
        System.out.println(n);
    }
}