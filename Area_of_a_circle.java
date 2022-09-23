import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float pi=3.14f,area;
        r=sc.nextInt();
        
        
        area=pi*r*r;
        System.out.format("%.2f",area);
    }
}