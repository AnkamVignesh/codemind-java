import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,m;
        t=sc.nextInt();
        
        while(t>0)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            int sum=m+n;
             System.out.println(sum);
             t--;
        }
    }
}