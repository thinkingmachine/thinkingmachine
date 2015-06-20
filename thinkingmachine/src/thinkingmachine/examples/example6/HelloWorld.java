package thinkingmachine.examples.example6;

import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.ActorRef;

//
// main class is akka.Main
// program arguments is thinkingmachine.examples.example6.HelloWorld
//
 
public class HelloWorld extends UntypedActor {
 
  @Override
  public void preStart() {
    // create the greeter actor
    final ActorRef greeter =
        getContext().actorOf(Props.create(Greeter.class), "greeter");
    // tell it to perform the greeting
    greeter.tell(Greeter.Msg.GREET, getSelf());
  }
 
  @Override
  public void onReceive(Object msg) {
    if (msg == Greeter.Msg.DONE) {
      // when the greeter is done, stop this actor and with it the application
      getContext().stop(getSelf());
    } else unhandled(msg);
  }
}



