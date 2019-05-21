
public class MySelectionSort {
	public static int[] doSelectionSort(int[] arr){

		for (int i = 0; i < arr.length - 1; i++)

		{

		int index = i;

		for (int j = i + 1; j < arr.length; j++)

		if (arr[j] > arr[index])

		index = j;

		int lNumber = arr[index];

		arr[index] = arr[i];

		arr[i] = lNumber;

		}

		return arr;

		}

		public static void main(String a[]){

		int[] arr1 = {10,34,2,56,7,67,88,42};

		int[] arr2 = doSelectionSort(arr1);

		for(int i:arr2){

		System.out.print(i);

		System.out.print(", ");

		}

		}

		}
// no it will not be faster than standard selection sort

// its complexity will also be O(n^2)




