package Sort;

import java.util.Arrays;
/*
 * 快速排序是不稳定的，其时间平均时间复杂度是O(nlgn)。
 * 代码还可以再优化，上面代码中基准数已经在pivotKey中保存
   了，所以不需要每次交换都设置一个temp变量，在交换左右指针的时候只需要先后覆盖就可以了。
   这样既能减少空间的使用还能降低赋值运算的次数。
   总结快速排序的思想：冒泡+二分+递归分治
 */

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {49,38,65,97,76,13,27,49};
		int left=0;
		int right=arr.length-1;
		quickSort(arr,left,right);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int partition(int[] arr,int left,int right) {
		int pivotKey=arr[left];
		int pivotPointer=left;
		
		while(left<right) {
			while(left<right && arr[right]>=pivotKey) 
				right--;
			while(left<right && arr[left]<=pivotKey)
				left++;
			swap(arr,left,right);
		}
		swap(arr,pivotPointer,left);
		return left;
	}
	
	public static void quickSort(int[] arr,int left,int right) {
		if(left>=right)
			return;
		int pivotPos=partition(arr,left,right);
		quickSort(arr,left,pivotPos-1);
		quickSort(arr,pivotPos+1,right);
	}
	
	
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
