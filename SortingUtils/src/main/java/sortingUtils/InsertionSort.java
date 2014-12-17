package sortingUtils;

import java.util.concurrent.TimeUnit;

/***
 * This class is used for insertion sort technique.
 * To be used for relatively small size of elements. Adaptable, stable, in-place and online.
 * Average case O(n*n), best case O(n) and suitable for already substantially sorted ranges in input array.
 * @author ajay.patel
 *
 */
public abstract class InsertionSort 
{
	/**
	 * API for sorting integer array through InsertionSort technique.
	 * @param input[]
	 * @return sorted array
	 */
	public static int[] sortIntArray(final int[] input){
		long startTime = System.nanoTime();
		int key;
		int j;
		
		for(int i=1;i<input.length;i++){
			key=input[i];
			j=i-1;
			while(j>=0 && key < input[j]){
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=key;
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
}
