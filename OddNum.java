class OddNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
		int a =1;
        for (int i = 1; i <= n; i++)
		{   	
            for (int j = 1; j <= n; j++) 
			{ 
                    System.out.print(a + "  ");	
					a+=2;
					if(a<=10) System.out.print(" ");
              }
            	
            System.out.println();
        }
		}
}