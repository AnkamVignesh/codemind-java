import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,min=9999,count=0,d=0;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        {
          x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(min>x[i])
            min=x[i];
        }
        for(int j=min;j>=1;j--)
        {
            count=0;
            for(int i=0;i<n;i++)
            {
                if(x[i]%j==0)
                {
                    count++;
                }
            }
            if(count==n)
            {
                d=j;
                break;
            }
        }
        System.out.println(d);
    }
}