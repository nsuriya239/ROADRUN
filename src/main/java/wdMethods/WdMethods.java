package wdMethods;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface WdMethods {
		
	
	
		public void startApp(String browser, boolean bReturns) throws MalformedURLException ;
		public WebElement locateElement(String locator, String locValue) ;	
		public WebElement locateElement(String locValue) ;	
		public void type(WebElement ele, String data) ;
		public void click(WebElement ele);
		public String getText(WebElement ele);
		public void selectDropDownUsingText(WebElement ele, String value) ;
		public void selectDropDownUsingIndex(WebElement ele, int index) ;
		public boolean verifyTitle(String expectedTitle);
		
		public void verifyExactText(WebElement ele, String expectedText);
		public void verifyPartialText(WebElement ele, String expectedText);

		public void verifyExactAttribute(WebElement ele, String attribute, String value);
		public void verifyPartialAttribute(WebElement ele, String attribute, String value);
	
		
		public void verifySelected(WebElement ele);
		
		public void verifyDisplayed(WebElement ele);
		public void switchToWindow(int index);
		public void switchToFrame(WebElement ele);
		public void acceptAlert();
		public void dismissAlert();
		
		public String getAlertText();
		public long takeSnap();
		public void closeBrowser();		
		public void closeAllBrowsers();
		
		public void explicitWait(String xpath);
		
		public void pressesc();
		
		public void pageScroll () throws AWTException;
		
		public void refresh();
		
		public void FluentWait();
		
		public void mouseHover(WebElement ele);
		
		public void mouseHoverclick(WebElement ele);
		public void highLighterMethod(WebDriver driver, WebElement element);

		public void scrollBottom();
		public void mouseHove1r(WebElement ele) ;
		public void mouseHove2r(WebElement ele) ;
		public void newTab();
		
		public void typewithtab(WebElement ele, String data);
		
		public void explicitWaitsend(String xpath, String value);
		
		public void smallWait();
		
	public void backButton();
		
		public void footerlink();
		
		public void jsclick();
		
		public void newTabwithoutclose();
		
		public void typewithenter(WebElement ele);
		
		public void clickenter();
		
		public void mouseHove3r(WebElement ele);
		
		public void mouseHove4r(WebElement ele);
		
		
}



