package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.Utils;

/*
 * Name:Shantosh
 * Date Created: 11/22/2019
 * Verified By: Shantosh Kumar
*/

public class EnterTimePage extends DriverScript {
	
// ****************************** Page/Object Initialization ********************************************* //
	
		public EnterTimePage()
		{
			PageFactory.initElements(driver, this);
		}
		
// ****************************** Objects Repository ***************************************************//
		
		@FindBy(id="logoutLink") WebElement logoutLnk;
		@FindBy(xpath="//div[text()='TASKS']") WebElement taskMenu; 
		
// ****************************** Actions / Methods ***************************************************//
		
		public void clickLogout()
		{
			Utils.highLightElement(logoutLnk);
			logoutLnk.click();
		}
		
		public boolean verifyTaskMenuDisplayed()
		{
			Utils.highLightElement(taskMenu);
			return taskMenu.isDisplayed();
		}
		
		public void clickTaskMenu()
		{
			Utils.highLightElement(taskMenu);
			taskMenu.click();
		}

}
