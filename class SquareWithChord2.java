class SquareWithChord2
{
	public static void main(String[] args) 
	{
		int n =new java.util.Scanner(System.in).nextInt();//rows
		
        for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n || j== (3*n/4)+1 || j==n/4 )
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
