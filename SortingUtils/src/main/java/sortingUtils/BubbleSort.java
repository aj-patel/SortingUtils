package sortingUtils;

import java.util.concurrent.TimeUnit;

/***
 * For sorting elements using BubbleSort technique.
 * To be used for relatively small size of elements. Adaptable, stable, in-place.
 * Worst case and average case is O(n*n). However O(n) when array is already sorted.
 * @author ajay.patel
 */
public class BubbleSort {
	
	public static int[] sortIntArray(int[] input){
		long startTime = System.nanoTime();
		boolean swapped = false;
		for(int i=0;i<input.length-1;i++){
			for(int j=0;j<input.length-1;j++){
				if(input[j] > input[j+1]){
					swap(input, j, j+1);
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		long timeTakenNano = System.nanoTime()-startTime;
		long timeTakenSec = TimeUnit.SECONDS.convert(timeTakenNano,TimeUnit.NANOSECONDS);
		if(timeTakenSec ==0){
			System.out.println("Time taken for sorting is :"+timeTakenNano+" nanoseconds.");
		}
		else{
			System.out.println("Time taken to sort is :" +timeTakenSec);
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
