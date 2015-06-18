
public class Example1RefineCallsReplicateInfiniteGame {
	
	
	/*
	 * 
	 * Refine the program based on some payout thresholds
	 * 
	 */
	public static void refine(Object somePayoutResults) {
		
		System.out.println("refine");
		
		try {
		Thread.sleep(5000);
		} catch(Exception  e) {}
		
		//At the moment we don't do anything with the
		//payoff thresholds
		
		Object program = null;  //At present the program does nothing
		
		//Examine the payout results
		//Figure out if we need to alter the program!
		//For now do nothing
		
		//send the program back to replicate
		replicate(program);
		
	}
	
	public static void replicate(Object program) {
		
		System.out.println("replicate");
		
		try {
		Thread.sleep(5000);
		} catch(Exception  e) {}
		
		
		Object determineCost=null;
		Object determinePayout=null;
		
		Object PayoutResults=null; //Calculate the payout results based
							//on the cost and the returns from the program
		
		//Run the program here!!!
		//We imagine we run the program
		//Right now we do nothing
		
		refine(PayoutResults);
		
	}
	

	public static void main(String[] args) {
		
		// Theoretically the game runs infinitely
		// if it can survive
		
		Object theMostSimpleProgramEverBeginningLife=null;

		Example1RefineCallsReplicateInfiniteGame.
			replicate(theMostSimpleProgramEverBeginningLife);
		

	}

}
