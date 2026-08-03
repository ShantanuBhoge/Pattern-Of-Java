class RightTriangleOf1
{
    public static void main(String[] args)
	{
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=i ;k++ )
			{
				System.out.print(1 +" ");
			}
			
			
            for (int j = i+1; j <= n; j++) 
			{ 
                    System.out.print(0 + " ");	
              }
            	
            System.out.println();
        }
	}
}