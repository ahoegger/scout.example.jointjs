package ch.ahoegger.scout.example.jointjs.ui.html.custom;

import org.eclipse.scout.rt.platform.Bean;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.ui.html.IUiSession;
import org.eclipse.scout.rt.ui.html.json.AbstractJsonObjectFactory;
import org.eclipse.scout.rt.ui.html.json.IJsonAdapter;

import ch.ahoegger.scout.example.jointjs.client.custom.jointjs.IJointJsField;

@Bean
@Order(110)
public class JsonObjectFactory extends AbstractJsonObjectFactory {

  @Override
  public IJsonAdapter<?> createJsonAdapter(Object model, IUiSession session, String id, IJsonAdapter<?> parent) {
    if (model instanceof IJointJsField) {
      return new JsonJointJsField((IJointJsField) model, session, id, parent);
    }
    return null;
  }

}
