package ch.ahoegger.scout.example.jointjs.ui.html.custom;

import org.eclipse.scout.rt.ui.html.IUiSession;
import org.eclipse.scout.rt.ui.html.json.IJsonAdapter;
import org.eclipse.scout.rt.ui.html.json.JsonEvent;
import org.eclipse.scout.rt.ui.html.json.form.fields.JsonFormField;

import ch.ahoegger.scout.example.jointjs.client.custom.jointjs.IJointJsField;

public class JsonJointJsField extends JsonFormField<IJointJsField> {

  public JsonJointJsField(IJointJsField model, IUiSession uiSession, String id, IJsonAdapter<?> parent) {
    super(model, uiSession, id, parent);
  }

  @Override
  public String getObjectType() {
    return "JointJsField";
  }

  @Override
  protected void initJsonProperties(IJointJsField model) {
    super.initJsonProperties(model);
  }

  @Override
  protected void attachModel() {
    super.attachModel();
  }

  @Override
  protected void detachModel() {
    super.detachModel();
  }

  @Override
  public void handleUiEvent(JsonEvent event) {
    super.handleUiEvent(event);
  }

}
