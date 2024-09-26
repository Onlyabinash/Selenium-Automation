package test;

import java.util.Arrays;
import java.util.Collections;

public class ArrayElementMatch {

public static void main(String[] args) {
			Integer a[]={10,23,34,56,99,47,100,-2};
	        int n=34,count=0,sum=0;
	 /* The Arrays.sort(a, Collections.reverseOrder()) method cannot be directly used with primitive types like int[] 
	 because Collections.reverseOrder() works with objects, not primitive types. To sort an array of integers in descending order, you can convert the array to an Integer[], 
	 use Arrays.sort() with Collections.reverseOrder(),and then convert it back if necessary.*/
	      Arrays.sort(a, Collections.reverseOrder());
	      //Arrays.sort(a);
	 /*we cant write like below, bcz because Arrays.sort(a) returns void, 
	meaning it does not return any value that can be printed. The Arrays.sort(a) 
	method sorts the array in place but does not produce an output that can be printed directly.*/
	      //System.out.println(Arrays.sort(a));
	      
	        System.out.println(Arrays.toString(a));
	        
	    for (int i=0;i<a.length;i++){
	    	sum=sum+a[i];
	     if (a[i]==n)
	       {
	      count++;
	    } 
	        
	        }
	    int avg= sum/a.length;
	    System.out.println(avg);
	if (count >0){
	    System.out.println("matching found");
	}else {
	    System.out.println("not found");
	}

		}

	

	}

