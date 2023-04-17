package Test02;

public class Pattern_06_07 {

	public static void main(String[] args) {

	
	for (int i = 1; i <= 4; i++)
    {
        for (int j = 4- i; j >= 1; j--)
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++)
        {
            System.out.print(i);
        }
        System.out.println();
    }
	
	int row= 5;
	for( int i =row -1; i>=0;i--) {
		for(int j=0;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println( );
	}
	int n=5;
	 for (int i = n - 1; i >= 1; i--) {
	      
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	 
	 for(int i = 5; i > 0;i-- ){
			int mysteryInt = 100;
			mysteryInt -= i;
		System.out.println(mysteryInt);
		}

	}

}
