import java.util.Scanner;
class Main
{
    public static boolean isPrime(int n)
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
        int n,count=0;
        n=sc.nextInt();
        int d=(int)Math.log10(n)+1;
        
        if(isPrime(n))
        {
            while(n>0)
            {
                int r=n%10;
                if(isPrime(r))
                count++;
                n=n/10;
            }
        }
        if(count==d)
           System.out.println("Mega Prime");
        else
           System.out.println("Not Mega Prime");
      
      
    }
}