import java.util.Scanner;
class Main
{
    public static boolean disarian(int n)
    {
        int sum=0,r;
        int temp=n;
        int d=(int)Math.log10(n)+1;
        
        while(n>0)
        {
            r=n%10;
            sum=sum+(int)Math.pow(r,d);
            d--;
            n=n/10;
        }
        if(sum==temp)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(disarian(n))
          System.out.println("True");
        else
          System.out.println("False");
    }
    
}