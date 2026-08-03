class SquareWithChordWithDiagonal
{
	public static void main(String[] args) 
	{
		int n =new java.util.Scanner(System.in).nextInt();//rows
		int m =new java.util.Scanner(System.in).nextInt();//col
        for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=m;j++)
			{
				if(i==1 || j==1 || j==n/4 || j==3*n/4 || i==n || j==m || i==j)
				{
					System.out.print("* ");
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
