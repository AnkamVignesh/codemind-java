import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P,R,T,I;
        P=sc.nextInt();
        R=sc.nextInt();
        T=sc.nextInt();
        I=(P*T*R)/100;
        System.out.println(I);
        
    }
}