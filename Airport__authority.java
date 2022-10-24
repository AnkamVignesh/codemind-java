import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,sum=0;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
    
          x[i]=sc.nextInt();
          int k=sc.nextInt();
    
        
        for(int i=0;i<n;i++)
        {
           if(x[i]<=k)
           sum=sum+1;
           if(x[i]>k)
           sum=sum+2;
        }
        System.out.println(sum);
       
    }
}