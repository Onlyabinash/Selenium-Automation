package test;

import java.util.HashSet;
import java.util.Set;

public class CollectionDuplicateElement {


	  public static void main(String[] args) {
		    String[] strArray={"abc","def","xyz","qqq","def"};
		    findAndPrintDuplicates(strArray);
/*Set<String> strSet= new HashSet<>(Arrays.asList(strArray));-->This method converts the array to a List<String>&new HashSet<>(...): 
This constructor creates a new HashSet from the list. The HashSet automatically removes any duplicate elements.*/			    
		 }
		    public static void findAndPrintDuplicates(String[] strarray){
		    Set<String> uniqueElement=new HashSet<>();
		    Set<String> duplicateElement= new HashSet<>();
		    
//for (type  variable represent the current item from collection :the data structer that you are iterating over (can be array/set).
		    for(String element:strarray) {
		    	
		    if(!uniqueElement.add(element))
		    	{
		    	
		    	duplicateElement.add(element);
		    }
		    }
		System.out.println("Duplicate elements in the array: " +duplicateElement);  
		System.out.println("unique elements in the array: " +uniqueElement);  
		    } 
		  
}