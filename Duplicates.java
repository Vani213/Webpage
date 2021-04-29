package assignment4;


public class Duplicates {
	
	void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

	public static void main(String[] args) {

		Duplicates repeat = new Duplicates();
		int data[]= {1,3,8,3,11,5,6,4,7,6,7};
		int data_size=data.length;
		repeat.printRepeating(data,data_size);
		
}
}

