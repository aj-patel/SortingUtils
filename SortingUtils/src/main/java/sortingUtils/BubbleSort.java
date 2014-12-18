package sortingUtils;

/***
 * For sorting elements using BubbleSort technique.
 * 
 * @author ajay.patel
 */
public class BubbleSort {
	
	public static int[] sortIntArray(int[] input){
		
		for(int i=0;i<input.length-1;i++){
			for(int j=0;j<input.length-1;j++){
				if(input[j] > input[j+1]){
					swap(input, j, j+1);
				}
			}
		}
		return input;
	}
	
	/**
	 * 
	 * @param input
	 * @param fromIdex
	 * @param toIndex
	 * Method to swap the elements from fromIndex to toIndex
	 */
	private static void swap(int[] input, int fromIdex, int toIndex){
		int temp = input[fromIdex];
		input[fromIdex] = input[toIndex];
		input[toIndex] = temp;
	}
}
