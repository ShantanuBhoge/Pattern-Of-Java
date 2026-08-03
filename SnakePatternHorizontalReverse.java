class SnakePatternHorizontalReverse
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = n;
		for (int i=1;i<=n ;i++ )
		{
			for (int j= 1;j<=n ;j++)
			{
				if(i%2!=0)
				{
					System.out.print(a-- +" ");
				    if(a<9) System.out.print(" ");
				}
				else
				{
					System.out.print(a++ +" ");
				   if(a<=10) System.out.print(" ");
				}
				
			}
			a = (i%2!=0)? a+n+1 : a+n-1;
		    System.out.println();
		}
	}
}