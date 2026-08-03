class SquareWithoutTop
{
	public static void main(String[] args) 
	{
		int n =new java.util.Scanner(System.in).nextInt();//rows
		
        for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(j==1 || i==n || j==n || i+j ==n+1 || i==j)
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
