import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,count=0,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            m=sc.nextInt();
            if(m%k==0)
            count++;
        }
        System.out.println(count);
    }
}