class SnakePatternVertical
{
	public static void main(String[] args) 
	{
		int n = 5;
		int a = (n*2)-1;
		int b = 1;
		for (int i=1;i<=n ;i++ )
		{
			int k=i;
			for (int j= 1;j<=n ;j++)
			{
				System.out.print(k+" ");
				if (k<10)
				{ 
					System.out.print(" ");
				}
				k = (j%2!=0)?k+a:k+b;
				
			}
			a -=2;
			b +=2;
		    System.out.println();
		}
	}
}



// op:
// 1  10 11 20 21 
// 2  9  12 19 22 
// 3  8  13 18 23 
// 4  7  14 17 24 
// 5  6  15 16 25 
