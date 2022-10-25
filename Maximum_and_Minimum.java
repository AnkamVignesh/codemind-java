import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,x[],count=0,flag=0,min=0,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int max=0;
        
        for(i=0;i<n-1;i++)
        {
            if(x[i]<x[i+1])
               min=x[i+1];
            else
               min=x[i];
        }
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
            }
            if(x[i]==count)
            {
                if(x[i]>max)
                max=x[i];
                found=1;
            }
            if(x[i]==count)
            {
                if(x[i]<min)
                min=x[i];
                found=1;
            }
        }
        if(found==1)
          System.out.print(min+" "+max);
        else
          System.out.print("-1");
        
        
    }
}