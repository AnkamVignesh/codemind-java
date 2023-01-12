import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int temp,num,rem,c=0,t,r,f=0;
        num=sc.nextInt();
        temp=num;
        
        while(temp!=0)
        {
            rem=temp%10;
            c=0;
            t=num;
            
            while(t!=0)
            {
                r=t%10;
                if(r==rem)
                {
                    c++;
                }
                if(c>1)
                {
                    f=1;
                    break;
                }
                t=t/10;
            }
            temp=temp/10;
        }
        
        if(f==0)
          System.out.println("Unique Number");
        else
          System.out.println("Not Unique Number");
    }
}