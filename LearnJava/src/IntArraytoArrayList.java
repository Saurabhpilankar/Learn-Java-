import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArraytoArrayList {

	public static void main(String[] args) {
		
		//METHOD 1: USING STREAMS
		
		//Array of integers
		int age[] = { 50,40,20,30,10,25,45}; 
		int marks[] = { 60,70,50,30,85,25,45}; 
		
		//Transform array - age to ArrayList using Streams & sort it
		
		ArrayList<Integer> numberList =(ArrayList<Integer>) Arrays.stream(age).boxed().sorted().collect(Collectors.toList());
		
		//Print the ArrayList of integers from Array age
		System.out.println(numberList);
		
		//METHOD 2: Using ArrayList & Enhanced For Loop
		ArrayList<Integer> markList= new ArrayList<>(marks.length);
		for(int i=0;i<marks.length;i++) {
			markList.add(marks[i]);			
		}
		System.out.println(markList);
	}

}
