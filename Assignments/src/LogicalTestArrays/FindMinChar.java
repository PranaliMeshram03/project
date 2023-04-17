package LogicalTestArrays;

public class FindMinChar {
	public static void minChar( char arr [ ]) {
		for(int i =0; i <arr.length; i++) {
			for(int j =0 ; j< arr.length ;j++) {
				if( arr[ i] > arr[ j] ) {
					char temp = arr[ i] ;
					arr[ i] = arr[ j];
					arr [ j] = temp;
				}
			}
			
		}
		int min = arr[arr.length -1];
		System.out.println((char) min);
	}

	public static void main(String[] args) {
		
		char arr [ ] = { 'a' , 'b' ,'b' ,'c' ,'c' ,'b'};
		FindMinChar.minChar(arr);
	}

}
