import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,x1,x2,y1,y2;
        t=sc.nextInt();
        while(t>0)
        {
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            if((float)y1/x1<(float)y2/x2)
            {
                System.out.println("-1");
                
            }
            else if((float)y1/x1==(float)y2/x2)
            {
                System.out.println("0");
                
            }
            else if((float)y1/x1>(float)y2/x2)
            {
                 System.out.println("1");
                 
            }
            t--;
        }
    }
}