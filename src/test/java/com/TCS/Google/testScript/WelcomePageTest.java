package com.TCS.Google.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TCS.Google.pages.WelcomePage;

public class WelcomePageTest extends TestBase{
	WelcomePage welcomePage;
	@Test
	public void verifyVisibilityOfGMOOnlineWord() throws IOException{
		WelcomePage welcomePage = start();
		String actualTitle = welcomePage.getTitleOfPage();
		String expectedTitle = "Welcome to Green Mountain Outpost";
		Assert.assertEquals(actualTitle, expectedTitle);
		String actualWord =welcomePage.getTextOfElement();
		String expectedWord ="GMO OnLine";
		Assert.assertEquals(actualWord, expectedWord);
		
	}
	
	@Test
	public void verifyBtnVisibilityOnWelcomePage() throws IOException{
	    start();
		WelcomePage welcomePage = WelcomePage.getInstance();
		SoftAssert softAssert = new SoftAssert();
		
		boolean gmobuttonVisibleFlag = welcomePage.isGMOOnlineButtonVisible();
		System.out.println("gmobuttonVisibleFlag"+"="+gmobuttonVisibleFlag);
		softAssert.assertTrue(gmobuttonVisibleFlag);
		boolean gmobuttonBrowseFlag = welcomePage.isBrowseTestPageButtonVisible();
		System.out.println("gmobuttonBrowseFlag"+"="+gmobuttonBrowseFlag);
		softAssert.assertTrue(gmobuttonBrowseFlag);
		boolean aboutSiteFlag = welcomePage.isAboutSiteButtonVisible();
		System.out.println("aboutSiteFlag"+"="+aboutSiteFlag);
		softAssert.assertTrue(aboutSiteFlag);
	}
	
	
}
