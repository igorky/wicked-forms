package org.wickedsource.wickedforms.formelements;

import org.wickedsource.wickedforms.model.Form;
import org.wickedsource.wickedforms.model.Section;
import org.wickedsource.wickedforms.model.elements.Text;
import org.wickedsource.wickedforms.model.elements.fields.TextArea;

public class TextAreaExample extends Form {

	public TextAreaExample() {
		super("Text Area Examples");

		add(new Section("Simple Text Area")
		    .add(new Text(
		        "A simple Text Area. It's almost rocket science... ."))
		    .add(new TextArea("Your favorite childhood story")));

		add(new Section("Text Area with default text")
		    .add(
		        new Text(
		            "Most form elements provide a constructor in which you can pass a default value."))
		    .add(new TextArea("Your favorite animal story", "The quick brown fox jumps over the lazy dog.")));

	}

}
