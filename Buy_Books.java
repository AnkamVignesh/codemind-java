import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],y[],n,sum=0,add=0;
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            sum=sum+x[i];
            add=add+y[i];
        }
        if(sum<add)
        System.out.println(add-sum);
        else
        System.out.println(0);
       
    }
}