import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],prod=1;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        {
          x[i]=sc.nextInt();
          prod=prod*x[i];
        }
        
        for( int i=0;i<n;i++)
        {
            System.out.print(prod/x[i]+" ");
        }
        
        
    }
}