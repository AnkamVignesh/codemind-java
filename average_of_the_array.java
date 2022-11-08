import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        float sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        
        System.out.format("%.2f",sum/n);
    }
}