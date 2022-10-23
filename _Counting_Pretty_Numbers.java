import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,i,a,b;
        t=sc.nextInt();
        
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            int count=0;
            
            for(i=a;i<=b;i++)
            {
                if(i%10==2 || i%10==3 || i%10==9)
                {
                    count=count+1;
                    
                }
            }
            System.out.println(count);
            t--;
        }
        
        
    }
}