import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Double p,r,t,I;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
         Double k=(1+(r/100));
         I=p*(Math.pow(k,t));
         System.out.format("%.2f",I);
        
    }
}