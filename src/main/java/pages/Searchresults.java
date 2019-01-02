package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Searchresults extends ProjectMethods{
	
	public Searchresults() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='gbidiv_brand']/ul/li[@class='kidsRefinement'][10]")
private WebElement searchresultdisplayed;
	
	public Searchresults verifytheresultcheckbox() throws AWTException
	{
		pageScroll();
		verifyDisplayed(searchresultdisplayed);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='shoe-name']/a")
	private WebElement modelname;
	
	public Searchresults verifymodelname() throws AWTException
	{
		pageScroll();
		verifyDisplayed(modelname);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='seoTextClass']/div")
	private WebElement keywordsearch;
	
	public Searchresults verifykeyword() throws AWTException
	{
		pageScroll();
		verifyDisplayed(keywordsearch);
		return this;
	}
	
	
	
	public Searchresults nodatasearch()
	{
		getTitle();
		
		return this;
		
		
		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='no_search_results']")
	private WebElement invalidkeyword;
	
	public Searchresults invalidkeyword() throws AWTException
	{
		pageScroll();
		verifyDisplayed(invalidkeyword);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'view-sorts')]")
	private WebElement sortbydropdown;
	
	public Searchresults clickSort(String text) {
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDropDownUsingText(sortbydropdown,text);
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, sortbydropdown);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'results-button next')]")
	private WebElement clickNext;
	
	public Newnext next() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(clickNext);
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Newnext();
		
		
		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@class='advancedSearchTextBox']")
	private WebElement edited;
	
public Newpageresults edit(String value) {
	
	type(edited,value);
	clickenter();
	try {
		pageScroll();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return new Newpageresults();
		
		

	}
	
	@FindBy(how=How.XPATH,using="//select[@name='p']")
	private WebElement showperpage;
	
	public Searchresults showPerpagedropdown() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(showperpage);
		
		return this;
	}
	

	
	public Newpageresults verifyshowperpage() throws AWTException
	{
		pageScroll();
click(showperpage);
highLighterMethod(driver, showperpage);
		return new Newpageresults();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'15425_img_url')]")
	private WebElement productLink;
	
	public Productdetails clickproductlink()
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", productLink);

		return new Productdetails();
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'15425_img_url')]")
	private WebElement secproductLink;
	
	public Productdetails clickproductlinksecondtime()
	{
	try {
		pageScroll();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", secproductLink);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return new Productdetails();
	}
	
	
	
}