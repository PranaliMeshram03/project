package LogicalTestArrays;

public class MoveZero {

	public static void main(String[] args) {
	int arr[ ] = {12, 0, 7, 0, 8, 0, 3};
	//int a = arr.length;
	int count =0;
	
	for ( int i = 0 ; i < arr.length ; i++)
	{
		if ( arr [ i ] !=0 ) {
		arr[ count ++] = arr[i] ;
		}
	}
    while(count < arr.length) {
    	arr[ count ++]= 0;
    }
    for(int j =0 ;j < arr.length; j++) {
    	System.out.print(arr[ j] );
    }
	}

}
