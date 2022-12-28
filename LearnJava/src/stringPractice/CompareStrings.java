package stringPractice;

public class CompareStrings {

	public static void main(String[] args) {

		String word1 = "indolent and";
		String word2 = "indolens";
		String word3 = "and";
		String word4 = "jahhkja";
		int count;
		System.out.println(word1.compareTo(word2)); //compare
		
		System.out.println(word1.concat(word2)); //concatenate
		
		//verify if substring of word1 is present in word3
		if(word1.contains(word3)) {
			System.out.println("word 1 contains word 3");
		}
		
		//Verify & print any duplicate letters from the word4
		char[] letters=word4.toCharArray();
		count=0;
		for(int i=0;i<=letters.length;i++) {
			for(int j=i+1;j<letters.length;j++) {
				if(letters[i]==letters[j] && letters[i]!=' ') {
					
					System.out.println("duplicates present " +letters[j]);
					count++;
					
				}
			}
			
		}
		
	}

}
