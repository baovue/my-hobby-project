package com.baovue.myhobbyproject.client.application.cooking;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.baovue.myhobbyproject.client.application.ApplicationPresenter;
import com.baovue.myhobbyproject.client.place.NameTokens;
import com.baovue.myhobbyproject.shared.FieldVerifier;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

/**
 * 
 * @author baovue
 *
 */
public class CookingPagePresenter extends Presenter<CookingPagePresenter.MyView, CookingPagePresenter.MyProxy> 
	implements CookingUiHandlers {
	
	@ProxyCodeSplit
	@NameToken(NameTokens.cookingPage)
	public interface MyProxy extends ProxyPlace<CookingPagePresenter> {	
	}
	
	public interface MyView extends View, HasUiHandlers<CookingUiHandlers> {
        void resetAndFocus();
        void setError(String errorText);
    }
	
	private static final Logger logger = Logger.getLogger(CookingPagePresenter.class.getName());
	
	@Inject
	public CookingPagePresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
		
		getView().setUiHandlers(this);
	}
	
	@Override
    public void sendData(String name, Date startedDate) {
		getView().setError("");
		if (!FieldVerifier.isValidName(name)) {
            getView().setError("<p><em>Please enter at least three characters.</em></p>");
            return;
        }
		String startedDateText = startedDate == null ? "" : startedDate.toString();
        sendDataToConsole(name, startedDateText);
        onReset();
    }

    @Override
    protected void onReset() {
        super.onReset();
        getView().resetAndFocus();
    }
    
    /** Logging configured to log to browser (javascript) console and dev mode console.
     *  TODO troubleshoot why logger is not logging to super dev mode.
     **/
    private void sendDataToConsole(String name, String startedDateText) {
    	logger.log(Level.FINE, "Data entered: Name: " + name + " Started date: " + startedDateText);
    }

}
