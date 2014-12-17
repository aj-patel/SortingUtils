package sortingUtils;

import java.util.concurrent.TimeUnit;

/**
 * This is the interface for various sorting techniques.
 * @author ajay.patel
 *
 */
public class InsertionSort 
{
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
