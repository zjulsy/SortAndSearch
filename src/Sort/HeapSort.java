package Sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr= {3,5,8,6,4};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heapAdjust(int[] arr,int start,int end) {
		int temp=arr[start];
		
		for(int i=2*start+1;i<=end;i*=2) {
			if(i<end&&arr[i]<arr[i+1]) 
				i++;
			if(temp>=arr[i]) 
				break;
			arr[start]=arr[i];
			start=i;
			
		}
		arr[start]=temp;
		
	}
	
	public static void heapSort(int[] arr) {
		if(arr==null || arr.length<=1)
			return;
		
		for(int i=arr.length/2;i>=0;i--) {
			heapAdjust(arr,i,arr.length-1);
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			swap(arr,0,i);
			heapAdjust(arr,0,i-1);
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
