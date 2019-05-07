package com.TCS.Google.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TCS.Google.CONSTANT.FilePaths;
import com.TCS.Google.base.PredefinedActions;
import com.TCS.Google.util.PropertyFileOperation;

import pojo.OnlineCatlogPOJO;

public class OnlineCatlogPage extends PredefinedActions {
	static PropertyFileOperation propOperation;
	private static OnlineCatlogPage onlineCatlogPage;

	public enum Item {
		TENTS, BACKPACK, SOCKS;
	}

	private OnlineCatlogPage() throws IOException {
		propOperation = new PropertyFileOperation(FilePaths.ONLINECATLOGPAGEPROPPATH);
	}

	public static OnlineCatlogPage getOnlineCatlogPageInstance() throws IOException {

		if (onlineCatlogPage == null)
			onlineCatlogPage = new OnlineCatlogPage();
		return onlineCatlogPage;
	}

	public static void goToOnlineCatlogPage() {
		initialization();
		click(propOperation.getValue("gmoOnlineButton"));
	}

	public OnlineCatlogPage orderQuantityDemoTent(int quantity) {
		// QTY_TENTS=[xpath]:-(//input[@name='QTY_TENTS'])|(//input[@name='QTY_TENTS'])
		// is stable environment
		setText(propOperation.getValue("QTY_TENTS"), String.valueOf(quantity), true);
		return this;
	}

	// QTY_TENTS=[xpath]:-(//input[@name='QTY_TENTS'])|(//input[@name='QTY_TENTS'])
	public void setQuantity(OnlineCatlogPOJO onlineCatlogPOJO) {
		// System.out.println(onlineCatlogPOJO.getBoots());
		// System.out.println(onlineCatlogPOJO.getFrameBackPack());
		if (onlineCatlogPOJO.getDemoTent() != null && !(onlineCatlogPOJO.getDemoTent().length() > 0)) {
			setText(propOperation.getValue("QTY_TENTS"), onlineCatlogPOJO.getDemoTent(), true);
		}
		if (onlineCatlogPOJO.getBoots() != null && !(onlineCatlogPOJO.getBoots().length() > 0)) {
			setText(propOperation.getValue("QTY_BACKPACKS"), onlineCatlogPOJO.getBoots(), true);
		}

	}

	public void clickResetForm() {
		click(propOperation.getValue("resetFormBtn"));
	}

	public String getQuantity(Item item) {

		if (item == Item.TENTS) {
			return getAttributeValue(propOperation.getValue("QTY_TENTS"));
		} else if (item == Item.BACKPACK) {
			return getAttributeValue(propOperation.getValue("QTY_TENTS"));
		}
		return null;

	}

	public static boolean verifyVisibilityOfResetFormButton() {

		return visibilityOnOnlineCatlogPage(propOperation.getValue("resetFormBtn"));
	}

	public static boolean verifyVisibilityOfPlaceAnOrderButton() {

		return visibilityOnOnlineCatlogPage(propOperation.getValue("placeAnOrderBtn"));
	}

	public static boolean visibilityOnOnlineCatlogPage(String locator) {
		return visibilityOfElement(locator);
	}

	public boolean isResetBtnClickable() {

		return isElementClickable(propOperation.getValue("resetFormBtn"));
	}

	public boolean isPlaceAnOrderBtnClickable() {

		return isElementClickable(propOperation.getValue("placeAnOrderBtn"));
	}

	public boolean isGmoOnlineBtnClickable() {
		// TODO Auto-generated method stub
		return isElementClickable(propOperation.getValue("gmoOnlineButton"));
	}

	public String getWordOfOnlineCatlogPage() {
		
		return getText(propOperation.getValue("onlineCatlogPageTextLocator"));
	}

	public void clickOnPlaceAnOrderBtnWithoutOrder() {
		// TODO Auto-generated method stub
		click(propOperation.getValue("placeAnOrderBtn"));
	}

	public boolean verifyPlaceAnOrderAlertPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;

	}

	public String getTextOfAlert() {
		// TODO Auto-generated method stub
		return getTextOnAlert();

	}

	public boolean verifyOkBtnOnAlert() {
		// TODO Auto-generated method stub
		return isAlertAccepted();
	}

	public String verifyVisibilityOfItem3_Person_Dome_Tent() {
		String text = getText(propOperation.getValue("item3_Person_Dome_Tent"));
		System.out.println(text);
		return text;
	}

	public String verifyVisibilityOfItemExternal_Frame_Backpack() {
		// TODO Auto-generated method stub
		String text = getText(propOperation.getValue("itemExternal_Frame_Backpack"));
		System.out.println(text);
		return text;
	}

	public String verifyVisibilityOfItemGlacier_Sun_Glasses() {
		// TODO Auto-generated method stub
		String text = getText(propOperation.getValue("itemGlacier_Sun_Glasses"));
		System.out.println(text);
		return text;
	}

	public String verifyVisibilityOfItemPadded_Socks() {
		// TODO Auto-generated method stub
		String text = getText(propOperation.getValue("itemPadded_Socks"));
		System.out.println(text);
		return text;
	}

	public String verifyVisibilityOfItemHiking_Boots() {
		// TODO Auto-generated method stub
		String text = getText(propOperation.getValue("itemHiking_Boots"));
		System.out.println(text);
		return text;
	}

	public String verifyVisibilityOfItemBack_Country_Shorts() {
		// TODO Auto-generated method stub
		String text = getText(propOperation.getValue("itemBack_Country_Shorts"));
		System.out.println(text);
		return text;
	}

	public String isName_3PersonDomeTent_ClickableAndRedirectOnCorrectPage() {
		if (isElementClickable(propOperation.getValue("item3_Person_Dome_Tent"))) {
			click(propOperation.getValue("item3_Person_Dome_Tent"));
		}

		return getPageURL();
	}

	public String isName_ExternalFrameBackpack_ClickableAndRedirectOnCorrectPage() {
		// TODO Auto-generated method stub
		if (isElementClickable(propOperation.getValue("itemExternal_Frame_Backpack"))) {
			click(propOperation.getValue("itemExternal_Frame_Backpack"));
		}

		return getPageURL();

	}

	public String isName_GlacierSunGlasses_ClickableAndRedirectOnCorrectPage() {
		// TODO Auto-generated method stub
		if (isElementClickable(propOperation.getValue("itemGlacier_Sun_Glasses"))) {
			click(propOperation.getValue("itemGlacier_Sun_Glasses"));
		}

		return getPageURL();

	}

	public String isName_PaddedSocks_ClickableAndRedirectOnCorrectPage() {
		// TODO Auto-generated method stub
		if (isElementClickable(propOperation.getValue("itemPadded_Socks"))) {
			click(propOperation.getValue("itemPadded_Socks"));
		}

		return getPageURL();

	}

	public String isName_HikingBoots_ClickableAndRedirectOnCorrectPage() {
		// TODO Auto-generated method stub
		if (isElementClickable(propOperation.getValue("itemHiking_Boots"))) {
			click(propOperation.getValue("itemHiking_Boots"));
		}

		return getPageURL();

	}

	public String isName_BackCountryShorts_ClickableAndRedirectOnCorrectPage() {
		// TODO Auto-generated method stub
		if (isElementClickable(propOperation.getValue("itemBack_Country_Shorts"))) {
			click(propOperation.getValue("itemBack_Country_Shorts"));
		}

		return getPageURL();

	}

	public void navigateBackward() {
		goToBackPage();

	}

	public String isItemNumberStartsWith_1000() {
		return getItemNumber(propOperation.getValue("itemNumber1"));

	}

	public ArrayList<Integer> getItemIds() {
		ArrayList<Integer> indexNumber = new ArrayList<Integer>();

		int index = Integer.parseInt(getText(propOperation.getValue("itemNumber").replace("%x%", String.valueOf("2"))));
		int totalRow = getTotalRowCnt(propOperation.getValue("totalRows"));
		for (int i = 3; i < totalRow; i++) {
			int currentIndex = Integer
					.parseInt(getText(propOperation.getValue("itemNumber").replace("%x%", String.valueOf(i))));
			if (currentIndex != (index + 1)) {
				indexNumber.add(currentIndex);
			}
			index++;
		}
		return indexNumber;

	}

}
