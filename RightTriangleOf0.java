class RightTriangleOf0
{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
	
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=i ;k++ )
			{
				System.out.print(0 +" ");
			}
			
			
            for (int j = i+1; j <= n; j++) 
			{ 
                    System.out.print(1 + " ");	
              }
            	
            System.out.println();
        }
	}
}


// op:
// 0 1 1 1 1 
// 0 0 1 1 1 
// 0 0 0 1 1 
// 0 0 0 0 1 
// 0 0 0 0 0 
