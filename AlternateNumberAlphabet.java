class AlternateNumberAlphabet {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(); // number of rows
        int a = 1;
        char b = (char)('a'-1+(n*n)/2);

        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
				{
                if (i % 2 == 0) 
				{
                    System.out.print(a++ +"  ");
                } 
				else 
				{
                    System.out.print(b-- + "  ");
                }
            }
            System.out.println();
        }
    }
}



#output

### For n = 4
1 2 3 4 
h g f e 
5 6 7 8 
d c b a
