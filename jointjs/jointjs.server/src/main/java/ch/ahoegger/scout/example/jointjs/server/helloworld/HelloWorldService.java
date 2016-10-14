package ch.ahoegger.scout.example.jointjs.server.helloworld;

import ch.ahoegger.scout.example.jointjs.server.ServerSession;
import ch.ahoegger.scout.example.jointjs.shared.helloworld.HelloWorldFormData;
import ch.ahoegger.scout.example.jointjs.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author aho
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
