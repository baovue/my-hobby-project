package com.baovue.myhobbyproject.client.application.home;

import javax.inject.Inject;

import com.baovue.myhobbyproject.client.application.ApplicationPresenter;
import com.baovue.myhobbyproject.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    @Inject
    HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    	super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
    
}
