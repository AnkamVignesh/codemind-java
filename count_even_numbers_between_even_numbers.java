import java.util.Scanner;
class Main
{
    public static boolean even(int n)
    {
       if(n%2==0)
         return true;
       else
         return false;
         
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        
        int d1=0,d2=0;
        
        for(int i=0;i<n;i++)
        {
            if(even(x[i]))
            {
                d1=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(even(x[i]))
            {
             d2=i;
             break;
            }
        }
        
        for(int i=d1+1;i<d2;i++)
        {
            if(even(x[i]))
            {
                count++;
            }
            
            
        }
        System.out.println(count);
    }
}