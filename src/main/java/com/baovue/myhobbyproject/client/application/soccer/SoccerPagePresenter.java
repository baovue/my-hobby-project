/**
 * 
 */
package com.baovue.myhobbyproject.client.application.soccer;


import javax.inject.Inject;

import com.baovue.myhobbyproject.client.application.ApplicationPresenter;
import com.baovue.myhobbyproject.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

/**
 * 
 * @author baovue
 *
 */
public class SoccerPagePresenter extends Presenter<SoccerPagePresenter.MyView, SoccerPagePresenter.MyProxy> {	
	
	@ProxyStandard
	@NameToken(NameTokens.soccerPage)
	public interface MyProxy extends ProxyPlace<SoccerPagePresenter> {
	}
	
	public interface MyView extends View {
	}
	
	@Inject
	public SoccerPagePresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
	}
	
}
