import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),d;
        d=(long)Math.log10(n)+1;
        long s=(long)Math.pow(10,d-1);
        if(d==10)
          System.out.println("Valid");
        else
           System.out.println("Invalid");
    }
}