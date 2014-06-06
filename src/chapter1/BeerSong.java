package chapter1;

public class BeerSong {

	/**
	 * Moved the if statement that checks to see if beerNum is equal to 1.
	 * I left it where it was originally, but commented it out and copied it after the print statements.
	 * Before moving it, printing out at 1 bottle looked like this:
	 * 1 bottles of beer on the wall
	 * 1 bottle of beer on the wall
	 * 1 bottle of beer.
	 * 
	 * Now after moving the if statement, it prints out correctly without the 's' at the end of bottles on the first printed line.
	 */
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
//			if (beerNum == 1) {
//				word = "bottle";
//			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			
			if (beerNum == 1) {
				word = "bottle";
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			}
			
			else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
