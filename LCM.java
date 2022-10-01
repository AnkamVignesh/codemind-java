import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,lcm,max,i;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>=0)
           max=x;
        else
           max=y;
        
        for(i=max;;i=i+max)
        {
            if(i%x==0 && i%y==0)
            {
               lcm=i;
               break;
               
            }
        }
        System.out.println(lcm);
        
    }
}