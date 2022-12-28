import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArraytoArrayList {

	public static void main(String[] args) {

		//Declare array
		String[] students = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

        // Conversion of array to ArrayList  using Arrays.asList
		List<String> name = Arrays.asList(students);
		
		//Print names
		System.out.println(name);

	}

}
