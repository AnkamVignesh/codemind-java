import java.util.Scanner;
class Sample
{
    public static boolean palindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(n))
          System.out.println("True");
        else
           System.out.println("False");
        
    }
    
}