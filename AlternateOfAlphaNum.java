class AlternateOfAlphaNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++)
		{    
			int a = n * ((n + 1) / 2) - (i - 1);
            char b = (char) ('a' + i - 1);
			
            for (int j = 1; j <= n; j++) 
			{
                if (j % 2 != 0) 
				{
                    System.out.print(a + "  ");	
					a-=n;
                }
				else
			    {
                    System.out.print(b + "  ");
					b+=n;
                }
            }	
            System.out.println();
        }
    }
}


## Expected Console Output

### For n = 4
8 a 4 e 
7 b 3 f 
6 c 2 g 
5 d 1 h 
