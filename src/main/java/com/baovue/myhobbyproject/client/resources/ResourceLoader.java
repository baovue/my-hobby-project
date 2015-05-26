package com.baovue.myhobbyproject.client.resources;

import javax.inject.Inject;

public class ResourceLoader {
	@Inject
    ResourceLoader(AppResources appResources) {
        appResources.style().ensureInjected();
        appResources.soccerImage();
    }
}
