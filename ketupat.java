import java.util.Scanner;

public class ketupat
{
	public static void main (String []args)
	{
	Scanner sc = new Scanner(System.in);

	int i;
	int n = sc.nextInt();
	
	for(i = 0; i<(2*n)+1; i++)
	{
		for(int j=0; j<(2*n)+1;j++)
		{
			if(i<n)
			{
				if((j>n-i)&&(j<n+i))
				{
					System.out.println("");
				}
				else
				{
					System.out.println("*");
				}
			}
			else
			{
				if((j>i-n)&&(j<3*n-i))
				{
					System.out.println("");
				}
				else
				{
					System.out.println("*");
				}
			}
		}
		System.out.println();
	}
	
	}
}