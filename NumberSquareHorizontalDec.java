class NumberSquareHorizontalDec
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a =n;
		for (int i=1;i<=n ;i++ )
		{
			for (int j= 1;j<=n ;j++)
			{
				System.out.print(a-- +" ");
				if (a<9)
				{ 
					System.out.print(" ");
				}
					
			}
			a+=n*2;
		    System.out.println();
		}
	}
}