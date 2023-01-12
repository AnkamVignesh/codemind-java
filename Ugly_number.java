import java.util.Scanner;
class Main
{
    public static boolean ugly(int n)
    {
        int found=0;
        while(n>0)
        {
            found=0;
            if(n%5==0)
            {
                found=1;
                n=n/5;
            }
            if(n%3==0)
            {
                found=1;
                n=n/3;
            }
            if(n%2==0)
            {
                found=1;
                n=n/2;
            }
            if(n==1 || found==0)
            break;
            
        }
        if(found==1)
         return true;
        else
          return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(ugly(n) || n==1)
           System.out.println("Ugly Number");
        else
           System.out.println("Not Ugly Number");
        
        
        
    }
    
}