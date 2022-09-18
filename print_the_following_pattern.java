import java.util.Scanner;
class Sample
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)			// rows 
		{
			for(int j=1;j<=n;j++)		// cols 
			{
				System.out.print(n-(j-1)+" ");
			}
			System.out.println();
		}
	}
}
