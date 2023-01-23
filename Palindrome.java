import java.util.Scanner;
class Main
{
    public static boolean palin(int n)
    {
        int r,temp=n,sum=0;
        
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
            
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(palin(n))
           System.out.println("True");
        else
           System.out.println("False");
        
      
    }
}