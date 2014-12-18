package sortingUtils;

import java.util.concurrent.TimeUnit;

/***
 * For sorting using Selection Sort technique.
 * 
 * @author ajay.patel
 */
public class SelectionSort {
	
	/**
	 * API for sorting integer array through SelectionSort technique.
	 * @param input[]
	 * @return sorted array
	 */
	public static int[] sortIntArray(int [] input){
		long startTime = System.nanoTime();
		int key;
		for(int i=0;i<input.length;i++){
			key = i;
			for(int j=i+1;j<input.length;j++){
				if(input[j]< input[key]){
					key=j;
				}
			}
			swap(input,i,key);
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
	 * This is for swapping elements.
	 */
	private static void swap(int[] input, int fromIdex, int toIndex){
		int temp = input[fromIdex];
		input[fromIdex] = input[toIndex];
		input[toIndex] = temp;
	}
}
