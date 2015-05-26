package com.baovue.myhobbyproject.client.application.cooking;

import java.util.Date;

import com.gwtplatform.mvp.client.UiHandlers;

public interface CookingUiHandlers extends UiHandlers {
	void sendData(String text, Date value);
}
