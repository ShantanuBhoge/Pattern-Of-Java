class AlternateNumberAlphabetDec
{
	public static void main(String[] args) 
	{
		int n = new java.util.Scanner(System.in).nextInt();
		int a =1;
		char b= 'a';
		for (int i=1;i<=n ;i++ )
		{
			for (int j= 1;j<=n ;j++)
			{
				if(j%2!=0)
				System.out.print(a++ +" ");
				
				else
					System.out.print(b++ +" ");
			}
		    System.out.println();
		}
	}
}

## Expected Console Output

### For n = 4
1 a 2 b 
3 c 4 d 
5 e 6 f 
7 g 8 h 
