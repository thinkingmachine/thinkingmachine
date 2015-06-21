package thinkingmachine.examples.example7;

import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.ActorRef;

public class Refine extends UntypedActor {

	public static enum Msg {
		REFINE, DONE;
	}

	@Override
	public void onReceive(Object msg) {
		if (msg == Msg.REFINE) {
			System.out.println("Refine!");
			getSender().tell(Replicate.Msg.REPLICATE, getSelf());

		} else
			unhandled(msg);
	}

}
