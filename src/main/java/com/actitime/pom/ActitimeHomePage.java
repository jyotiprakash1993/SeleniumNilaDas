package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplansLink;
	
	@FindBy(id="container_tt")
	private WebElement timetrackLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(id="container_reports")
	private WebElement reportsLink;
	
	@FindBy(id="container_users")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calenderDropdown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsDropdown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsDropdown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpsupportDropdown;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[@class='supportQuestionButton']")
	private WebElement gotaquestionLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoactiplansMethod()
	{
		switchtoactiplansLink.click();
	}
	
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	
	public void taskMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", tasksLink);
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calenderMethod()
	{
		calenderDropdown.click();
	}
	
	public void settingsMethod()
	{
		settingsDropdown.click();
	}
	
	public void integrationsMethod()
	{
		integrationsDropdown.click();
	}
	
	public void helpsupportMethod()
	{
		helpsupportDropdown.click();
	}
	
	public void logoutMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", logoutLink);
	}
	
	public void gotaquestionMethod()
	{
		gotaquestionLink.click();
	}
}