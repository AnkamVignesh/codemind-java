import java.util.Scanner;
class Main
{
    
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0;
        n=sc.nextInt();
        while(true)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+r*r;
                n=n/10;
            }
            if(sum<=9)
            break;
            n=sum;
        }
        if(sum==1)
          System.out.println("True");
        else
          System.out.println("False");
    }
}