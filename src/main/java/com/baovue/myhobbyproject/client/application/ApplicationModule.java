package com.baovue.myhobbyproject.client.application;

import com.baovue.myhobbyproject.client.application.cooking.CookingPagePresenter;
import com.baovue.myhobbyproject.client.application.cooking.CookingPageView;
import com.baovue.myhobbyproject.client.application.home.HomePagePresenter;
import com.baovue.myhobbyproject.client.application.home.HomePageView;
import com.baovue.myhobbyproject.client.application.soccer.SoccerPagePresenter;
import com.baovue.myhobbyproject.client.application.soccer.SoccerPageView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

/**
 * 
 * @author baovue
 *
 */
public class ApplicationModule extends AbstractPresenterModule {
	@Override
    protected void configure() {
        // Presenters
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
        bindPresenter(HomePagePresenter.class, HomePagePresenter.MyView.class, HomePageView.class, 
        		HomePagePresenter.MyProxy.class);
        bindPresenter(CookingPagePresenter.class, CookingPagePresenter.MyView.class, CookingPageView.class, 
        		CookingPagePresenter.MyProxy.class);
        bindPresenter(SoccerPagePresenter.class, SoccerPagePresenter.MyView.class, SoccerPageView.class,
                SoccerPagePresenter.MyProxy.class);
    }
}
