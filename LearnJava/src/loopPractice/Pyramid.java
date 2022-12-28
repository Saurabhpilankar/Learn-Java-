package loopPractice;

public class Pyramid {

	public static void main(String[] args) {
		int i,nume=1,j,row=4;
		
		for( i=0;i<row;i++)   
			
		{
			
			for( j=1;j<=(row-i);j++) 
			{	
				//i=0 & j=1>;j<=4 print -->1 -->/t---->increment nume to 2
				//i=0 & j=2>;j<=4 print ---2 -->/t---->increment nume to 3
				//i=0 & j=3>;j<=4 print ---3 -->/t---->increment nume to 4
				//i=0 & j=4>;j<=4 print ---4 -->/t---->increment nume to 5
				//i=0 & j=5>;j<=4 false --->come out of inner loop & execute outer loop -->/n--->
				//i=1 & j=2>;j<=4 print ---5 -->/t---->increment nume to 6
				//i=1 & j=3>;j<=4 print ---6 -->/t---->increment nume to 6
				//i=1 & j=4>;j<=4 print ---7 -->/t---->increment nume to 6

				System.out.print( +nume);
				System.out.print("\t" );
				nume++;
			}
			System.out.println();
			
		}
		
		
	}

}


