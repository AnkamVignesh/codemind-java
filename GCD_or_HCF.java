import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,m,min,gdf=0;
       n=sc.nextInt();
       m=sc.nextInt();
       
       if(n>m)
         min=m;
       else
         min=n;
         
       for(int i=min;i>=1;i--)
       {
           if(m%i==0 && n%i==0)
           {
               gdf=i;
               break;
           }
           min--;
       }
       System.out.println(gdf);
    }
}