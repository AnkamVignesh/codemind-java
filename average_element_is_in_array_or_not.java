import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,found=0,sum=0,avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
       
        
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=sum/n;
        
        for(i=0;i<n;i++)
        {
            if(avg==x[i])
            found=1;
        }
        if(found>=1)
          System.out.println("True");
        else
           System.out.println("False");
           
    }
}