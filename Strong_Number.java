import java.util.Scanner;
class Main
{
    public static boolean strong(int n)
    {
        int i,f,r,count=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            f=1;
            for(i=r;i>=1;i--)
            {
                f=f*i;
            }
            count=count+f;
            n=n/10;
        }
        if(count==temp)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(strong(n))
          System.out.println("The number "+n+" is a strong number");
        else
          System.out.println("The number "+n+" is not a strong number");
    }
    
    
}