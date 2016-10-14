package ch.ahoegger.scout.example.jointjs.server.helloworld;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.eclipse.scout.rt.testing.server.runner.RunWithServerSession;
import org.eclipse.scout.rt.testing.server.runner.ServerTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.ahoegger.scout.example.jointjs.server.ServerSession;
import ch.ahoegger.scout.example.jointjs.shared.helloworld.HelloWorldFormData;
import ch.ahoegger.scout.example.jointjs.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldServiceTest}</h3>
 *
 * @author aho
 */
@RunWith(ServerTestRunner.class)
@RunWithSubject(HelloWorldServiceTest.SUBJECT_NAME)
@RunWithServerSession(ServerSession.class)
public class HelloWorldServiceTest {
	public static final String SUBJECT_NAME = "test_subject";

	@Test
	public void testMessageContainsSubjectName() {
		HelloWorldFormData input = new HelloWorldFormData();
		input = BEANS.get(IHelloWorldService.class).load(input);

		Assert.assertNotNull(input.getMessage());
		Assert.assertEquals("Hello " + SUBJECT_NAME + "!", input.getMessage().getValue());
	}
}
