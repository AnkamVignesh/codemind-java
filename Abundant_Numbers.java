import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n,sum=0,i;
         n=sc.nextInt();
         
         for(i=1;i<=n/2;i++)
         {
             if(n%i==0)
             {
                 sum=sum+i;
             }
         }
         if(sum>n)
          System.out.println("True");
         else
           System.out.println("False");
    }
}