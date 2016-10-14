package ch.ahoegger.scout.example.jointjs.client.helloworld;

import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.AbstractIcons;
import org.eclipse.scout.rt.shared.TEXTS;

import ch.ahoegger.scout.example.jointjs.client.custom.jointjs.AbstractJointJsField;
import ch.ahoegger.scout.example.jointjs.client.helloworld.HelloWorldForm.MainBox.TopBox;
import ch.ahoegger.scout.example.jointjs.client.helloworld.HelloWorldForm.MainBox.TopBox.JointJsField;

/**
 * <h3>{@link HelloWorldForm}</h3>
 *
 * @author aho
 */
public class HelloWorldForm extends AbstractForm {

	public HelloWorldForm() {
		setHandler(new ViewHandler());
	}

	@Override
	protected boolean getConfiguredAskIfNeedSave() {
		return false;
	}

	@Override
	protected int getConfiguredModalityHint() {
		return MODALITY_HINT_MODELESS;
	}

	@Override
	protected String getConfiguredIconId() {
		return AbstractIcons.World;
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public TopBox getTopBox() {
		return getFieldByClass(TopBox.class);
	}

	public JointJsField getJointJsField() {
		return getFieldByClass(JointJsField.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(1000)
		public class TopBox extends AbstractGroupBox {

			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("AnExampleGraph");
			}

			@Order(1000.0)
			public class JointJsField extends AbstractJointJsField {
				@Override
				protected int getConfiguredGridW() {
					return 2;
				}

				@Override
				protected int getConfiguredGridH() {
					return 5;
				}

				@Override
				protected boolean getConfiguredLabelVisible() {
					return false;
				}

			}
		}
	}

	public class ViewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
		}
	}
}
