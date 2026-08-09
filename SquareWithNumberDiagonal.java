class SquareWithNumberDiagonal
{
	public static void main(String[] args) 
	{
		int n =new java.util.Scanner(System.in).nextInt();//rows
		
        for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n || i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
         
	}
}


// op:
// 1 2 3 4 5 
// 1 2     5 
// 1   3   5 
// 1     4 5 
// 1 2 3 4 5 
