package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class giftlink  extends ProjectMethods{
	
	public giftlink() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'button continue button button-primary lets-go')]")
	private WebElement getstarted;
	
	public giftlink clickGetStarted()
	{
		click(getstarted);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'sender[recipientName]')]")
	private WebElement recipientName;
	
	public giftlink enterRecepientName(String name)
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(recipientName,name);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'sender[meta][occasion]')]")
	private WebElement reasontName;
	
	

	
	@FindBy(how=How.XPATH,using="//*[contains(@data-ga-event-action,'continue')]")
	private WebElement nextbutton;
	
	public giftlink next()
	{
		click(nextbutton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'sender-first-name')]")
	private WebElement firstname;
	
	public giftlink enterfirstname(String fname)
	{
		type(firstname,fname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'sender-last-name')]")
	private WebElement secondname;
	
	public giftlink entersecondname(String lname)
	{
		type(secondname,lname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'sender-email')]")
	private WebElement email;
	
	public giftlink enteremail(String emailadd)
	{
		type(email,emailadd);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'sender-phone')]")
	private WebElement phone;
	
	public giftlink enterphone(String phoneno)
	{
		type(phone,phoneno);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'submit-button')]")
	private WebElement nextbuton;
	
	public giftlink clicknext()
	{
		click(nextbuton);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'copy-url-btn')]")
	private WebElement url;
	
	public giftlink copypaste()
	{
		click(url);
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	
	
	@FindBy(how=How.CSS,using=".button.button.button-primary.lets-go")
	private WebElement getit;
	
	public giftlink opengift()
	{
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", getit);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'page-wrapper')]")
	private WebElement draag;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'smgt-footer')]")
	private WebElement droop;
	
	public giftlink graganddrop()
	{
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		
		driver.switchTo().window(subWindowHandler);
		Actions builder = new Actions(driver);   
		builder.click(draag).build().perform();
		builder.click(droop).build().perform();
		builder.click(draag).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'button button-primary lets-go')]")
	private WebElement opengmail;
	
	public giftlink gmail()
	{
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
	
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://gmail.com");
		return this;
		
		
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'userNavigationLabel')]")
	private WebElement navigation;
	@FindBy(how=How.XPATH,using="//*[contains(@data-gt,'menu_logout')]")
	private WebElement logout;
	
	
	public giftlink facebook()
	{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(2)); //switches to new tab
		    driver.get("https://www.gmail.com");
		  
		  dismissAlert();
		    
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", navigation);
		    mouseHoverclick(logout);
			return this;
		
	}
	
	public giftlink googlemail()
	{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(2)); //switches to new tab
		    driver.get("https://www.gmail.com");
		    return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@type,'email')]")
	private WebElement emailid;
	
	public giftlink enteremail1(String email)
	{
		explicitWait("//*[contains(@type,'email')]");
		type(emailid,email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'identifierNext')]")
	private WebElement nextbut;
	
	public giftlink eemailnext()
	{
		click(nextbut);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@type,'password')]")
	private WebElement pwd;
	
	public giftlink enterpwd(String password)
	{
		explicitWait("//*[contains(@type,'password')]");
		type(pwd,password);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'passwordNext')]")
	private WebElement pwdnxt;
	
	public giftlink passwordnext()
	{
		click(pwdnxt);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-share-method,'Facebook')]")
	private WebElement fb;
	
	public giftlink clickfb()
	{
		click(fb);
		//switchToWindow(1);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Log In')]")
	private WebElement fblog;
	@FindBy(how=How.XPATH,using="//*[contains(@name,'email')]")
	private WebElement em;
	@FindBy(how=How.XPATH,using="//*[contains(@name,'pass')]")
	private WebElement pwdd;
	
	public giftlink clickfblogin(String emil,String pass)
	{
		switchToWindow(2);
		type(em,emil);
		type(pwdd,pass);
		
		click(fblog);
		return this;
	}

	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'u_0_0')]")
	private WebElement tofield;
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Send')]")
	private WebElement send;	

	public giftlink choosefriend(String frnd)
	{
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(tofield, frnd);
		typewithenter(tofield);
		click(send);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@style,'position: relative; min-height: 100%;')]")
	private WebElement emailsec;
	public giftlink selectmail() {

		List<WebElement> emails = (List<WebElement>) emailsec;
	for(WebElement emailsub : emails){
	    if(emailsub.getText().equals("Copy of the gift link for arjun") == true){

	           emailsub.click();
	           break;
	        }
	}
	return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'Size') and (@tabindex)]")

	private WebElement size;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Accept & Continue')]")
	private WebElement accept;
	
	public giftlink selectsize()
	{
		click(size);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(accept);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-first-name')]")
	private WebElement finame;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-last-name')]")
	private WebElement laname;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-address')]")
	private WebElement adds;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-postalcode')]")
	private WebElement zipc;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-city')]")
	private WebElement cit;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-state')]")
	private WebElement stat;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-phone')]")
	private WebElement fone;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'recipient-email')]")
	private WebElement mail;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Next')]")
	private WebElement next;
	
	public giftlink shipping(String fn,String ln,String add, String zi,String ci, String st, String fon, String email) {
		
		type(finame,fn);
		type(laname,ln);
		type(adds,add);
		type(zipc,zi);
		type(cit,ci);
		type(stat,st);
		type(fone,fon);
		type(mail,email);
		click(next);
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'recipient[thank_you_message]')]")
	private WebElement thanks;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Send Note')]")
	private WebElement sub;
	
	public giftlink thanku(String notes) {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", thanks);
		type(thanks,notes);
		click(sub);
		
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Sign In')]")
	private WebElement gm;
	@FindBy(how=How.XPATH,using="//*[contains(@type,'email')]")
	private WebElement ge;	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Next') and(@class)]")
	private WebElement ne;	
	@FindBy(how=How.XPATH,using="//*[contains(@type,'password')]")
	private WebElement pw;
	
	public giftlink gmaillogin(String gee,String pww) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", gm);
		js.executeScript("arguments[0].click();", ge);
		type(ge,gee);
		js.executeScript("arguments[0].click();", ne);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click();", pw);
		
		type(pw,pww);
		js.executeScript("arguments[0].click();", ne);
		return this;
	}
	@FindBy(how=How.XPATH,using="*//span[@class='bog']")
	private List<WebElement> emailthread;
	
	public giftlink checkEmail(String emailSubject)
	{
		takeSnap();
		for(int i=0;i<emailthread.size();i++) {
			
			if(emailthread.get(i).getText().contains(emailSubject))
			{
				emailthread.get(i).click();
				break;
			}
		}
		
		
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),'BUY THIS GIFT NOW') and (@href)]")
	private WebElement buy;
	
	
	
	public giftlink openmail()
	{
		highLighterMethod(driver, buy);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("arguments[0].click();", buy);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@aria-label,'Delete') and (@data-tooltip)]")
	private WebElement delete;
	public giftlink tab() {
	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   
	    
	    driver.switchTo().window(tabs2.get(3));
	    click(delete);
	    driver.switchTo().window(tabs2.get(4));
	    
	    return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'PLACE YOUR ORDER')]")
	private WebElement place;
	public giftlink placeord()
	{
	click(place);	
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
