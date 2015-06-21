package thinkingmachine.examples.example8;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class GoalManager {

	public static void main(String[] args) {
		GoalManager goalMgr = new GoalManager();
		goalMgr.begin();
	}

	// actors and messages ...

	public void begin() {
		// Create an Akka system
		ActorSystem system = ActorSystem.create("ReplicateRefine");

		// create the replicate refine actors
		final ActorRef refine = system.actorOf(Props.create(Refine.class),
				"refine");
		final ActorRef replicate = system.actorOf(Props.create(Replicate.class),
				"replicate");
		// tell it to refine
		refine.tell(Refine.Msg.REFINE, replicate);
	}

}
