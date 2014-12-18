package sortingUtils;

/***
 * For sorting elements using MergeSort technique.
 * Worst case, average case and best case is nlg(n). Needs O(n) extra space.
 * @author ajay.patel
 *
 */
public class MergeSort {
	
	private static int [] sortedArray;
	
	private static int sortedArrayIndex=0;
	
	
	/**
	 * Use this API to sort int values using MergeSort technique.
	 * @param input 
	 * @return sorted int array.
	 */
	public static int[] sortIntArray(int [] input){
		
		sortedArray= createArrayFromExisting(input);
		divide(input, 0, input.length-1);
		return sortedArray;
	}
	
	/**
	 * For dividing into sub problems.
	 * @param input
	 * @param low
	 * @param high
	 */
	private static void divide(int [] input, int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			divide(input, low, mid);
			divide(input, mid+1, high);
			merge(input, low, mid, high);
		}
	}
	
	/**
	 * This is for the conquer phase. Merge two sorted array into single sorted array.
	 * @param input
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void merge(int [] input, int low, int mid, int high){
		int localLow = low;
		int localMid = mid+1;
		sortedArrayIndex=low;
		for(int i = low; i<=high; i++){
			input[i] = sortedArray[i];
		}
		
		while(localLow <= mid && localMid <= high){
			if(input[localLow] < input[localMid]){
				sortedArray[sortedArrayIndex]=input[localLow];
				sortedArrayIndex++;
				localLow++;
			}else{
				sortedArray[sortedArrayIndex]=input[localMid];
				sortedArrayIndex++;
				localMid++;
			}
		}
		while(localLow<=mid){
			sortedArray[sortedArrayIndex++]=input[localLow];
			localLow++;
		}
		while(localMid<=high){
			sortedArray[sortedArrayIndex++]=input[localMid];
			localMid++;
		}
		 
		 
	}
	
	/**
	 * Creating another array from existing array.
	 * @param array
	 * @return newArray
	 */
	private static int[] createArrayFromExisting(int[] array){
		int newArray[] = new int [array.length];
		for(int i =0;i <array.length;i++){
			newArray[i]=array[i];
		}
		return newArray;
	}

}
