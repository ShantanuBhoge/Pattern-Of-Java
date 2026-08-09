class LeftTriangleOf1
{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
	
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=n-i ;k++ )
			{
				System.out.print(0 +" ");
			}
			
			
            for (int j = n-i+1; j <= n; j++) 
			{ 
                    System.out.print(1 + " ");	
             }
            	
            System.out.println();
        }
	}
}


output:

0 0 0 1 
0 0 1 1 
0 1 1 1 
1 1 1 1 
