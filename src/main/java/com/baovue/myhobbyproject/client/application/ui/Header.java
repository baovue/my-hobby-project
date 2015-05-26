package com.baovue.myhobbyproject.client.application.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Header extends Composite {
	public interface Binder extends UiBinder<Widget, Header> {
    }

	private static Binder uiBinder = GWT.create(Binder.class);

    public Header() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
