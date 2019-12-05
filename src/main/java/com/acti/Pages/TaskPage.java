package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.Utils;

public class TaskPage extends DriverScript {
	
	public TaskPage()
	{
		// PageFactory is a class used to initialize page elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewBtn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement addNewCustBtn;
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']") WebElement custNamTB;
	
	public void clickaddNewBtn()
	{
		Utils.highLightElement(addNewBtn);
		addNewBtn.click();
	}
	
	public void clickAddNewCust()
	{
		Utils.highLightElement(addNewCustBtn);
		addNewCustBtn.click();
	}
	
	public void enterCustName(String cName)
	{
		Utils.highLightElement(custNamTB);
		custNamTB.sendKeys(cName);
	}

}
