import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        
        for(int i=1;i<n-1;i++)
        {
            if(x[i-1]%2!=0 && x[i+1]%2==0 || x[i-1]%2==0 && x[i+1]%2!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}