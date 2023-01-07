import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i;
        n=sc.nextInt();
        r=sc.nextInt();
        
        for(i=1;i<=r;i=i+2)
        {
            System.out.println(n+" x "+i+" = "+n*i);
            
        }
    }
}