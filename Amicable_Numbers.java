import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,add=0,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int temp=a;
        int semp=b;
         for(int i=1;i<=(int)a/2;i++)
         {
             if(a%i==0)
             {
                sum=sum+i;
                
             }
         }
       for(int i=1;i<=(int)b/2;i++)
       {
           if(b%i==0)
           {
               add=add+i;
           }
       }
       if(temp==add && semp==sum)
          System.out.println("Amicable");
       else
          System.out.println("Not Amicable");
        
    }
}