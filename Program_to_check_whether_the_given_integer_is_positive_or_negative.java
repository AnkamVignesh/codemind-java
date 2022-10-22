import java.util.Scanner;
class PositiveorNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		if(x>=10)
		{
			System.out.println("Positive Number");
		}
		else
		{
		    System.out.println("Negative Number");
		}
		sc.close();
	}
}
