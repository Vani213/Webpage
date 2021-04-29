package assignment4;

public class pushZerosToEnd {
	
	public static void pushZero(int[] arr, int n) {
			
		int count=0;
		for (int i = 0; i < n; i++)
	        if (arr[i] != 0)
	            arr[count++] = arr[i];
		
		while (count < n)
	        arr[count++] = 0;
	}


	public static void main(String[] args) {
		
		int arr[]={4,0,3,0,1,5,2,0};
		int n = arr.length;
		pushZero(arr, n);
	    System.out.println("Array after pushing all zeros to end of array :"); 
	    for (int i = 0; i < n; i++)
	    	System.out.print(arr[i]+" ");
	    

	}

}
