package com.TCS.Google.pages;

import java.io.IOException;

import com.TCS.Google.CONSTANT.FilePaths;
import com.TCS.Google.base.PredefinedActions;
import com.TCS.Google.util.PropertyFileOperation;

public class WelcomePage extends PredefinedActions {
	// singleton design pattern

	private static WelcomePage welcomePage;
	PropertyFileOperation propOperation;

	private WelcomePage() throws IOException {
		propOperation = new PropertyFileOperation(FilePaths.WELCOMEPAGEPROPPATH);
	}

	public static WelcomePage getInstance() throws IOException {
		if (welcomePage == null)
			welcomePage = new WelcomePage();
		return welcomePage;
	}

	/**
	 * 
	 * @return page title of welcomepage
	 */

	public String getTitleOfPage() {

		return getPageTitle();

	}

	public String getTextOfElement() {
		return getText(propOperation.getValue("gmoOnlineWord"));
	}

	public boolean isGMOOnlineButtonVisible() {
		System.out.println(propOperation.getValue("gmoOnlineBtn"));
		return visibilityOnWelcomePage(propOperation.getValue("gmoOnlineBtn")); // gmoOnlineBtn
	}

	public boolean isAboutSiteButtonVisible() {
		return visibilityOnWelcomePage(propOperation.getValue("aboutGmoSiteBtn"));
	}

	public boolean isBrowseTestPageButtonVisible() {
		return visibilityOnWelcomePage(propOperation.getValue("browserTestPageBtn"));
	}

	private boolean visibilityOnWelcomePage(String locator) {
		return visibilityOfElement(locator);
	}
public OnlineCatlogPage clickOnEnterGmoOnlineBtn() throws IOException{
	click(propOperation.getValue("gmoOnlineBtn"));
	return OnlineCatlogPage.getOnlineCatlogPageInstance();
	//return instance always so that we can call ........on same methode...eg...reset...placeanorder....
}
}
