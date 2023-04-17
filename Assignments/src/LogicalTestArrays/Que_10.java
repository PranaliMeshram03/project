package LogicalTestArrays;

public class Que_10 {
	static void sortRow(int m [ ] [ ] )
	{
		for(int i =0 ; i < m.length;i++)
		{
			for(int j=0;j<m[ i].length;j++)
			{
				for(int k =0; k < m[i].length-j -1 ;k++)
				{
					if( m [i] [k] <  m [i] [k + 1]) 
					{
						int t = m [i][ k];
						m [i][ k] = m [i][ k+1];
						 m [i] [k + 1] = t;
					}
				}
				
			}
		}
		for(int i =0 ; i < m.length ;i++) {
			for(int j=0;j<m[ i].length;j++) {
				System.out.print( m [ i] [ j] +" " );
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int m[ ] [ ]=  { { 1,2,3,4} , {5,6,7,8}};
		Que_10.sortRow(m);
	}

}
