package thinkingmachine.examples.example5;

import java.util.HashMap;

public class CopyOfEatingGameFailedGamesCostsAndPayoff {

	static HashMap costs = new HashMap();
	static HashMap payoff = new HashMap();
	static HashMap games = new HashMap();
	static HashMap choices = new HashMap();
	static HashMap preferredChoice = new HashMap();
	static HashMap program = new HashMap();
	static HashMap goals = new HashMap();
	static HashMap typeChoice = new HashMap();
	static HashMap personalityPreference = new HashMap();
	static HashMap timingChoice = new HashMap();
	static int age = 1; // A replicate needs to know how old it is to time
						// things
	static HashMap failedGames = new HashMap(); // sometimes we run out of
												// something
												// due to climate change
												// payout is zero so we
												// discontinue

	/*
	 * 
	 * initialize settings
	 */
	public void initialize() {

		// high level goal

		goals.put("STAY ALIVE", "ACTIVE");

		// just one associated game

		games.put("STAY ALIVE", "EAT");

		// program
		// the goal is to eat and maximise payoff

		program.put("GAME", "EAT");

		// type of eater
		// vegetables or other wise

		// Using this approach a replicate-refine can switch
		// pay off functions as it switched type

		// if one is a carnivore one must hunt which
		// needs a different payoff function

		// in nature stem cells can switch from one type to another
		// cells turn into skin cells, liver cells and so on

		typeChoice.put("TYPE", "HERBIVORE");
		typeChoice.put("TYPE", "CARNIVORE");

		// timing choice

		timingChoice.put("TIMING CHOICE DO SOME ACTION AT CERTAIN TIME", "100");

		// personality preference, the payoff function likes apples!

		personalityPreference.put("EAT_HERBIVORE", "APPLES");

		// game choices
		choices.put("EAT_HERBIVORE", "CABBAGE"); 
		choices.put("EAT_HERBIVORE", "CELEERY");

		choices.put("EAT_CARNIVORE", "MOUSE");

		// failed games
		failedGames.put("EAT_CARNIVORE", "DODO"); // We cannot hunt Dodo as it
													// is extinct

		// current choice
		preferredChoice.put("EAT_HERBIVORE", "CELERY"); // easiest to find

		// costs

		// it's easier to find celery than cabbage

		costs.put("EAT_LOCATE_CABBAGE", "60");
		costs.put("EAT_LOCATE_CELERY", "50");
		costs.put("EAT_HUNT_MOUSE", "500"); // We need a new type of game called
											// hunting

		// the payoff to the system when it's theoretically eaten

		payoff.put("EAT_ENERGY_CABBAGE", "50");
		payoff.put("EAT_ENERGY_CELERY", "10");
		payoff.put("EAT_ENERGY_MOUSE", "2000");
		payoff.put("EAT_ENERGY_DODO", "0");

		// so it's easier to find celery
		// but the payoff is higher for cabbage

	}

	/*
	 * 
	 * Refine the program based on some pay out thresholds
	 */
	public static void refine(Object somePayoutResults) {

		System.out.println("refine");

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}

		// At the moment we don't do anything with the
		// payoff thresholds

		Object program = null; // At present the program does nothing

		// Examine the pay out results
		// Figure out if we need to alter the program!
		// For now do nothing

		// send the program back to replicate
		replicate(program);

	}

	public static void replicate(Object program) {

		System.out.println("replicate");

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}

		String choice = (String) CopyOfEatingGameFailedGamesCostsAndPayoff.preferredChoice
				.get("EAT");

		Object determineCost = null;
		Object determinePayout = null;

		Object PayoutResults = null; // Calculate the pay out results based
		// on the cost and the returns from the program

		// Run the program here!!!
		// We imagine we run the program
		// Right now we do nothing

		System.out.println("I am "
				+ CopyOfEatingGameFailedGamesCostsAndPayoff.age);
		age++;

		refine(PayoutResults);

	}

	public static void main(String[] args) {

		// Theoretically the game runs infinitely
		// if it can survive

		Object theMostSimpleProgramEverBeginningLife = null;

		CopyOfEatingGameFailedGamesCostsAndPayoff
				.replicate(theMostSimpleProgramEverBeginningLife);

	}

}
