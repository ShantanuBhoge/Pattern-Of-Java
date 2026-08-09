class AlternateOfAlphaNumericReverse {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(); // number of rows
      
        

        for (int i = 1; i <= n; i++)
		{    int a =i ;
		    char b =(char) ('a'+(n * (n / 2)) - i);
            for (int j = 1; j <= n; j++) 
			{
                if (j % 2 != 0) 
				{
                    System.out.print(a + "  ");	
					a+=n;
                }
				else
			    {
                    System.out.print(b + "  ");
					b-=n;
                }
            }
            System.out.println();
        }
    }
}



## Expected Console Output

### For n = 4
1 h 5 d 
2 g 6 c 
3 f 7 b 
4 e 8 a 
