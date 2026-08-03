class NumberSquareOfTableReverse
{
	public static void main(String[] args) 
	{
		int n = new java.util.Scanner(System.in).nextInt();
		int a =n*n;
		for (int i=1;i<=n ;i++ )
		{
			for (int j= 1;j<=n ;j++)
			{
				System.out.print(a*n +" ");
				if (a*n<10 || a*n<99)
				{ 
					System.out.print(" ");
				}
				a--;
			}
		    System.out.println();
		}
	}
}