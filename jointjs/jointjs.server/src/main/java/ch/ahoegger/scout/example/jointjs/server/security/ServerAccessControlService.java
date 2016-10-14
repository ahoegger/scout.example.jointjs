package ch.ahoegger.scout.example.jointjs.server.security;

import java.security.AllPermission;
import java.security.Permissions;

import ch.ahoegger.scout.example.jointjs.shared.security.AccessControlService;
import org.eclipse.scout.rt.platform.Replace;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

/**
 * <h3>{@link AccessControlService}</h3>
 *
 * @author aho
 */
@Replace
public class ServerAccessControlService extends AccessControlService {

	@Override
	protected Permissions execLoadPermissions(String userId) {
		Permissions permissions = new Permissions();
		permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

		// TODO [aho]: Fill access control service
		permissions.add(new AllPermission());
		return permissions;
	}
}
