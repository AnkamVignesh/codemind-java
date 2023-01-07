import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k,found=0;
        n=sc.nextInt();
        x=new int[n];
        
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(x[i]==k && found==0)
            {
                System.out.print(i+" ");
                found=1;
            }
            if(x[i]>k && found==1)
            {
                System.out.print(i-1);
                break;
            }
        }
        if(found==0)
        {
            System.out.print(-1+" "+-1);
        }
    }
}