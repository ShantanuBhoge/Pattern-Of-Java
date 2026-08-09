class LeftTriangleOfAlpha
{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
		int a =1;
		char b= 'a';
		
        for (int i = 1; i <= n; i++)
		{   	
			for (int k= 1;k<=n+1-i ;k++ )
			{
				System.out.print(a++ +" ");
				if(a<=10) System.out.print(" ");
			}
				
            for (int j = n+2-i; j <= n; j++) 
			{ 
                    System.out.print(b++ + " ");
              }
            	
            System.out.println();
        }
		}
}


op:
1  2  3  4  5  
6  7  8  9  a 
10 11 12 b  c 
13 14 d  e  f 
15 g  h  i  j 
