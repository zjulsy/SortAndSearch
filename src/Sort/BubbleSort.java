package Sort;

import java.util.Arrays;
/*
 冒泡排序是最简单的排序之一了，其大体思想就是通过与相邻元素的比较和交换来把小的数交换到最前面。
 这个过程类似于水泡向上升一样，因此而得名。举个栗子，对5,3,8,6,4这个无序序列进行冒泡排序。
 首先从后向前冒泡，4和6比较，把4交换到前面，序列变成5,3,8,4,6。同理4和8交换，变成5,3,4,8,6,3和4无需交换。
 5和3交换，变成3,5,4,8,6,3.这样一次冒泡就完了，把最小的数3排到最前面了。
 对剩下的序列依次冒泡就会得到一个有序序列。冒泡排序的时间复杂度为O(n^2)。
 */
public class BubbleSort {
	//时间复杂度位o(n^2)，空间o(n)
	public static void main(String[] args) {
		bubbleSort();	
	}
	
	public static void bubbleSort() {
		int[] arr= {5,3,8,6,4};
		if(arr==null||arr.length<=1)
			return;
		boolean flag=false;  //判断是否排序好，优化1
		for(int i=0;i<arr.length-1;i++) {
			if(flag==true) break;
			flag=true;
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
					flag=false;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
