class RightTriangleOfNum
{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
		int a =1;
		char b= 'a';
		
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=i ;k++ )
			{
				System.out.print(a++ +" ");
			}
			
			
            for (int j = i+1; j <= n; j++) 
			{ 
                    System.out.print(b++ + " ");	
              }
            	
            System.out.println();
        }
		}
}