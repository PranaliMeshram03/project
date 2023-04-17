package LogicalTestArrays;

public class MaxRow {
	public static void MaxRow(int a[ ] [ ] ) {
		for(int i =0; i< a.length;i++) {
			int max = a [ 0] [ i];
			for(int j=0 ;j <a[ i].length;j++)
			{
				if(max < a[i] [j]) {
					max=a[i] [j];
				}
			}
			System.out.println(max);
		}
	}
		
	
	public static void main(String[] args) {
	int arr [ ][ ] = {{22, 31, 9}, {12, 25, 16}} ;
	MaxRow.MaxRow(arr);
	}

}
