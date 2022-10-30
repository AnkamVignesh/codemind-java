import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    
    {
       if(n==1)
       return false;
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           if(n%i==0)
           {
               return false;
               
           }
       }
       return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         long a=sc.nextLong();
         int count=0;
         
         for(int i=1;i<=(int)Math.sqrt(a);i++)
         {
             if(prime(i))
             {
                 if(i*i<=a)
                 {
                   count++;
                 }
             }
         }
         System.out.println(count);
         
         
    }
}