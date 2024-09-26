package test;

import java.util.Arrays;

public class LargestElementArray {
	public static int getLargest(int[] a, int total) {
	
		//The Arrays.sort(a) method in Java is used to sort the elements of an array in ascending order. 
				Arrays.sort(a);
				return a[total-1];	
			}
			public static void main(String[] args) {

				int a[]= {11,23,45,410,9,-1};
				
			System.out.println(getLargest(a,6));
				
				
			}
	}
/*public static void main(String[] args){
int a[]= {121,34,56,78,676,8999};
Arrays.sort(a);-- sort element by descending order
//int n=a.length;- to get length of the array
//int value = a[a.length-1]; - to get largest value
//System.out.println("largest:"+ a[a.length-1] );  // to print largest value  
//System.out.println("3rd largest"+a[a.length-3] );--to print 3rd largest value */	


