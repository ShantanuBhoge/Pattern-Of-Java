class LeftTriangleOfNum
{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
		int a =1;
		char b= 'a';
		
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=n+1-i ;k++ )
			{
				System.out.print(b++ +" ");
				if(a<=10) System.out.print("");
			}
				
            for (int j = n+2-i; j <= n; j++) 
			{ 
                    System.out.print(a++ +" ");
              }
            	
            System.out.println();
        }
		}
}