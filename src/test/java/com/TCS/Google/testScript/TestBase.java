
package com.TCS.Google.testScript;

import java.io.IOException;

import com.TCS.Google.base.PredefinedActions;
import com.TCS.Google.pages.OnlineCatlogPage;
import com.TCS.Google.pages.WelcomePage;

public class TestBase {

	WelcomePage start() throws IOException {
		PredefinedActions.initialization();
		return WelcomePage.getInstance();

	}

	OnlineCatlogPage getOnlineCatlogPageInstance() throws IOException {
		OnlineCatlogPage.goToOnlineCatlogPage();

		return OnlineCatlogPage.getOnlineCatlogPageInstance();
	}

}
