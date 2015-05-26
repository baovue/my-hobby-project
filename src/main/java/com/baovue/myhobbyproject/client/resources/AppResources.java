package com.baovue.myhobbyproject.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {

	@Source("img/soccer.png")
	ImageResource soccerImage();
	
	@Source("img/cooking.png")
	ImageResource cookingImage();

	interface Style extends CssResource {
		@ClassName("label_error")
		String labelError();
		String container();
		String box();
		String links();
		String content();
		String leftcontent();
		String rightcontent();
		String imagecontainer();
		String centeredcontent();
	}

	@Source("css/style.css")
	Style style();
}
