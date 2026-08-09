class NumberSquareIncVertical
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		for (int i=1;i<=n ;i++ )
		{
			int a=i;
			for (int j= 1;j<=n ;j++)
			{
				System.out.print(a+" ");
				if (a<10)
				{ 
					System.out.print(" ");
				}
				a+=n;	
			}
		    System.out.println();
		}
	}
}


// op:
// 1  5  9  13 
// 2  6  10 14 
// 3  7  11 15 
// 4  8  12 16 
