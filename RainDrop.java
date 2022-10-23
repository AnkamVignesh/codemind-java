import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x%3==0 && x%5!=0 && x%7!=0)
        System.out.println("Pling");
        else if(x%5==0 && x%7!=0 && x%3!=0)
        System.out.println("Plang");
        else if(x%7==0 && x%5!=0 && x%3!=0)
        System.out.println("Plong");
        else if(x%3==0 && x%5==0 && x%7!=0)
        System.out.println("PlingPlang");
        else if(x%3==0 && x%5==0 && x%7==0)
        System.out.println("PlingPlangPlong");
        else if(x%3!=0 && x%5==0 && x%7==0)
        System.out.println("PlangPlong");
        else if(x%3==0 && x%5!=0 && x%7==0)
        System.out.println("PlingPlong");
        else
        System.out.println(x);
        
        
        
    }
}