package ch.ahoegger.scout.example.jointjs.client.custom.jointjs;

import org.eclipse.scout.rt.client.ModelContextProxy;
import org.eclipse.scout.rt.client.ModelContextProxy.ModelContext;
import org.eclipse.scout.rt.client.ui.form.fields.AbstractFormField;
import org.eclipse.scout.rt.platform.BEANS;

public class AbstractJointJsField extends AbstractFormField implements IJointJsField {

  private IJointJsFieldUIFacade m_uiFacade;

  @Override
  protected void initConfig() {
    m_uiFacade = BEANS.get(ModelContextProxy.class).newProxy(new P_UIFacade(), ModelContext.copyCurrent());
    super.initConfig();
  }

  @Override
  public IJointJsFieldUIFacade getUIFacade() {
    return m_uiFacade;
  }

  protected class P_UIFacade implements IJointJsFieldUIFacade {

  }

}
