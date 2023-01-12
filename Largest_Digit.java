import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,max=0;
        n=sc.nextInt();
        
        while(n>0)
        {
            r=n%10;
            if(max<r)
             max=r;
             n=n/10;
        }
        System.out.println(max);
    }
}