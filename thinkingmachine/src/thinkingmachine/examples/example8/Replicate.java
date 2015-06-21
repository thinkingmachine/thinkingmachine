package thinkingmachine.examples.example8;

import thinkingmachine.examples.example7.Refine.Msg;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.ActorRef;

//
// main class is akka.Main
// program arguments is thinkingmachine.examples.example7.Replicate
//

public class Replicate extends UntypedActor {
	
	private int counter=1;
	private int someConstantSoItDoesNotLoopForever=20;

	public static enum Msg {
		REPLICATE, DONE;
	}

	@Override
	public void onReceive(Object msg) {
		if (msg == Refine.Msg.DONE) {
			// when the greeter is done, stop this actor and with it the
			// application
			getContext().stop(getSelf());
		}
		if (msg == Replicate.Msg.REPLICATE) {
			System.out.println("Replicate! "+counter);
			counter++;
			if (counter <= someConstantSoItDoesNotLoopForever) {
				getSender().tell(Refine.Msg.REFINE, getSelf());
			} else {
				//or call done
				getContext().stop(getSelf());
			}

		} else
			unhandled(msg);
	}
}
