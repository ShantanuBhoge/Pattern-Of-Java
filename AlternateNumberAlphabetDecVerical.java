class AlternateNumberAlphabetDec {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(); // number of rows
       
        char b = 'a';

        for (int i = 1; i <= n; i++) {
             int a=i;
			 b= (char)('a'+i-1);
            for (int j = 1; j <= n; j++) 
			{
                if (j % 2 != 0) 
				{
                    System.out.print(a + "  ");
					a+=4;
                }
				else
			    {
                    System.out.print(b + "  ");
					b+=4;
                }
            }
            System.out.println();
        }
    }
}