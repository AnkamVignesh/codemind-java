import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,x[],count=0,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
       
        
        
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
            }
            
            if(x[i]==count)
            {
               
               flag++;
            }
        }
       
          
          System.out.println(flag);
        
        
    }
}