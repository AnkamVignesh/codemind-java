import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        
        if(n%2==0)
        {
           m=0;
           System.out.println("Player 1");
            
        }
        else
          System.out.println("Player 2");
          
    }
}