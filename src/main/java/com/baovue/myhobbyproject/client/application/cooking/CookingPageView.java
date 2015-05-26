package com.baovue.myhobbyproject.client.application.cooking;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * 
 * @author baovue
 *
 */
public class CookingPageView extends ViewWithUiHandlers<CookingUiHandlers> implements CookingPagePresenter.MyView {
	interface Binder extends UiBinder<Widget, CookingPageView> {
	}
	
	@UiField
	TextBox nameField;
	
	@UiField
	DateBox startedDateField;
	
	@UiField
	Button resetButton;
	
	@UiField
	HTML error;

	@Inject
	public CookingPageView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/** Clear both fields and set focus to name field. */
	@Override
    public void resetAndFocus() {
		nameField.setText(null);
        nameField.setFocus(true);
        startedDateField.setValue(null);
    }
	
	@UiHandler("resetButton")
    void onSend(ClickEvent event) {
        getUiHandlers().sendData(nameField.getText(), startedDateField.getValue());
    }

	@Override
	public void setError(String errorText) {
		error.setHTML(errorText);
	}
	
}
