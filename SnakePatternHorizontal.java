class SnakePatternHorizontal
{
	public static void main(String[] args) 
	{
		int n = 5;
		int a = 1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j= 1;j<=n ;j++)
			{
				if(i%2!=0)
				{
					System.out.print(a++ +" ");
				    if(a<=10) System.out.print(" ");
				}
				else
				{
					System.out.print(a-- +" ");
				   if(a<9) System.out.print(" ");
				}
				
			}
			a = (i%2!=0)? a+n-1 : a+n+1;
		    System.out.println();
		}
	}
}



// op:
// 1  2  3  4  5  
// 10 9  8  7  6  
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25 
