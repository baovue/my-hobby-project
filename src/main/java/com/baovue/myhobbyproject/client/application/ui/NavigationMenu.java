/**
 * 
 */
package com.baovue.myhobbyproject.client.application.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author baovue
 *
 */
public class NavigationMenu extends Composite {
	public interface Binder extends UiBinder<Widget, NavigationMenu> {
    }

	private static Binder uiBinder = GWT.create(Binder.class);

    public NavigationMenu() {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
}
