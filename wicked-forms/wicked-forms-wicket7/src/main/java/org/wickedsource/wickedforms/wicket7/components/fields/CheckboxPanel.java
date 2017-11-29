/**
 *   Copyright 2013 Wicked Forms (https://github.com/thombergs/wicked-forms)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.wickedsource.wickedforms.wicket7.components.fields;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.model.PropertyModel;
import org.wickedsource.wickedforms.model.elements.fields.Checkbox;

/**
 * A panel that represents a {@link Checkbox} in a form.
 * <p/>
 * <strong>Wicket IDs needed in the markup:</strong>
 * <ul>
 * <li><strong>label</strong>: a {@link Label} that displays the label of the
 * text field.
 * <li><strong>inputField</strong>: a {@link CheckBox} that takes the user's
 * input.
 * </ul>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class CheckboxPanel extends AbstractInputFieldPanel<Boolean> {

	private final CheckBox checkbox;

	public CheckboxPanel(String id, Checkbox model) {
		super(id, model);

		this.checkbox = new CheckBox("inputField", new PropertyModel<Boolean>(model, "value"));
		this.decorateComponent(this.checkbox);
		this.add(this.checkbox);
	}

}
