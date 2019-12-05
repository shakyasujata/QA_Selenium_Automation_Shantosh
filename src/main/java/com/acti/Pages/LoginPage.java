package com.acti.Pages;

import org.apache.poi.xssf.usermodel.helpers.HeaderFooterHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.Utils;

/*
 * Name:Sheik
 * Date Created: 11/22/2019
 * Verified By: Vimal
*/

public class LoginPage extends DriverScript {
	
//****************************** Objects Identification ***************************************************//	
	
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	
//****************************** Page/Object Initialization ********************************************* //
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//********************************* Actions / Methods *************************************************** //
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLogoisDisplayed()
	{
		Utils.highLightElement(actiLogo);
		return actiLogo.isDisplayed();
	}
	
	public void validateLoginFunction(String username, String password)
	{
		//Utils.highLightElement(usernameTb);
		usernameTb.sendKeys(username);
		//Utils.highLightElement(passwordTb);
		passwordTb.sendKeys(password);
		//Utils.highLightElement(loginBtn);
		loginBtn.click();
	}

}








