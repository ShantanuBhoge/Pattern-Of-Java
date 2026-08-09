class AlternateNumAlphaRevDec {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt(); // number of rows
        int a = (n*n)/2;
        char b = (char)('a'-1+(n*n)/2);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {

                    System.out.print(a-- + "  ");
                }
				else {

                    System.out.print(b-- + "  ");
                }
            }
            System.out.println();
        }
    }
}


## Sample Output

For an input of `n = 4`:

8 h 7 g 
6 f 5 e 
4 d 3 c 
2 b 1 a 
