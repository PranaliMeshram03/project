package LogicalTestArrays;

public class DublicateElement {
	public static void dispaly(int arr[ ]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique) {
				System.out.println(arr[i] + " ");
			}
		}
	}

	public static void main(String [ ] args) {
		int arr [ ]  = { 4, 3, 2, 4, 9, 2} ;
		DublicateElement.dispaly(arr);
		
		}
	}

	
	
		
	


