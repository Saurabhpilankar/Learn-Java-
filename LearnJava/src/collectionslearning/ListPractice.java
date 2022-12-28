package collectionslearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListPractice {
	
	public static void main(String args[]){  

	
	List <String> sampleList = new ArrayList<String>();
	sampleList.add("Alan");
	sampleList.add("Mark");
	sampleList.add("John");
	sampleList.add("Bravo");
	sampleList.add("John");


	for(String name:sampleList) {
		System.out.print(name +"\t");
	}
	System.out.println();
	//Sort the List and print its elements
	Collections.sort(sampleList);
	for(String name:sampleList) {
		System.out.print(name +"\t");
	}
		
	//convert the list to set to remove the duplicates
	Set <String> uniqueValues=new HashSet<String>(sampleList);	
	System.out.println();
			System.out.print(uniqueValues +"\t");
		
		
}}
