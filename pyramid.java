public class pyramid {

	public static void main (String args[])
	{
	  //set the number of lines your pyramid want to have
		int lines=7; 
		
		//... and start the for loops
		//first loop is which line to take 1,2,3.... and so own
		for(int i=1; i<=lines;i++){
		
		  /*The next for loop is to put the appropriate space
		    before the number(s) in order to give the space needed
		    to create a pyramid */
			for (int j=1;j<=lines-i;j++){
				System.out.print("   ");
			}
			
			//Add the number(s) of its line
			//This for loop will put the central and left numbers
			//of the pyramid
			for (int left=1;left<=i;left++){
				System.out.print(" "+left+" ");
			}
			
			//Finally the next loop puts the numbers on the righ
			//side in reverse order
			for(int right=i-1; right>=1; right--) {
				System.out.print(" "+right+" ");
				}
				
				//change line
				System.out.println(); 
		}//End: you just created a line of the pyramid
		
	}
	
}
