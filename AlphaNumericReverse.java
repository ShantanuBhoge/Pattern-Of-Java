    class AlphaNumericReverse {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(); // number of rows
       int a= n*n/2;
        char b = 'a';

        for (int i = 1; i <= n; i++)
		{
            for (int j = 1; j <= n; j++) 
			{
                if (i % 2 != 0) 
				{
                    System.out.print(a-- + "  ");					
                }
				else
			    {
                    System.out.print(b++ + "  ");
                }
            }
            System.out.println();
        }
    }
}


## Sample Output

For an input of `n = 4`:

8 7 6 5 
a b c d 
4 3 2 1 
e f g h 
