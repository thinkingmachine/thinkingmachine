package thinkingmachine.examples.example2;

import java.util.HashMap;

public class EatingGameCostsAndPayoff {
	
	HashMap costs = new HashMap();
	HashMap payoff = new HashMap();
	HashMap games = new HashMap();
	HashMap choices = new HashMap();
	HashMap program = new HashMap();
	HashMap goals = new HashMap();

	/*
	 * 
	 * initialize settings
	 * 
	 */
	public void initialize() {
		

		

		
		//high level goal
		
		goals.put("STAY ALIVE","ACTIVE");
		

		//just one associated game
		
		games.put("STAY ALIVE","EAT");

		//program
		//the goal is to eat and maximise payoff
		
		program.put("GAME","EAT");

		//game choices
		choices.put("EAT","CABBAGE");
		choices.put("EAT","CELEERY");
		

		//costs
		
		//it's easier to find celery than cabbage
		
		costs.put("EAT_LOCATE_CABBAGE","100");
		costs.put("EAT_LOCATE_CELERY", "50");
		
		//the payoff to the system when it's theoretically eaten
		
		payoff.put("EAT_ENERGY_CABBAGE", "50");
		payoff.put("EAT_ENERGY_CELERY", "10");
		
		//so it's easier to find celery
		//but the payoff is higher for cabbage
		
	}
	
	/*
	 * 
	 * Refine the program based on some pay out thresholds
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
		
		//Examine the pay out results
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
		
		Object PayoutResults=null; //Calculate the pay out results based
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

		EatingGameCostsAndPayoff.
			replicate(theMostSimpleProgramEverBeginningLife);
		

	}

}
