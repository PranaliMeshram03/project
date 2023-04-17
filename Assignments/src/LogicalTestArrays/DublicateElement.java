package LogicalTestArrays;

public class DublicateElement {
	public static void dispaly(int arr[ ]) {
		for( int i =0; i< arr.length;i++) {
			for(int j =i+1; j< arr.length; j++) {
				if(arr [ i] ==arr[ j]) {
					break;
				}
			
				
			}
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String [ ] args) {
		int arr [ ]  = { 4, 3, 2, 4, 9, 2} ;
		DublicateElement.dispaly(arr);
		
		}
	}

	
	
		
	


