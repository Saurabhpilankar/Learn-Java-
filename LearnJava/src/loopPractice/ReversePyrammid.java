package loopPractice;

public class ReversePyrammid {

	public static void main(String[] args) {
		int i,j,number=1,row =4;
		
		for(i=0;i<row;i++) {
			
			for(j=0;j<=i;j++) {
				
				System.out.print(number+"\t");
				number++;
				
			}System.out.println();
		}}}

/*
1 
2 3
4 5 6
7 8 9 10

*/