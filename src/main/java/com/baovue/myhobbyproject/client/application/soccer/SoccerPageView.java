package com.baovue.myhobbyproject.client.application.soccer;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * 
 * @author baovue
 *
 */
public class SoccerPageView extends ViewImpl implements SoccerPagePresenter.MyView {
    interface Binder extends UiBinder<Widget, SoccerPageView> {
    }

    @Inject
    public SoccerPageView(Binder binder) {
        initWidget(binder.createAndBindUi(this));
    }
}
