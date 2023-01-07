import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,found=0;
        n=sc.nextInt();
        
        if(n>2)
        {
            for(int i=2;i<=(int)n/2;i++)
            {
                if(prime(i))
                {
                    for(int j=2;j<=(int)n/2;j++)
                    {
                        if(prime(j))
                        {
                            if(i*j==n && i!=j)
                            {
                                System.out.print(i+" ");
                                found=1;
                                break;
                            }
                        }
                    }
                    
                   
                }
                
            }
           
        }
        if(found==0 || n<2)
                      System.out.println(-1);
    }
}