package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FitFinder  extends ProjectMethods{
	
	public FitFinder() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Get Started Now')]")
	private WebElement getstarted;
	
	public FitFinder clickGetStarted()
	{
		click(getstarted);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-gender-male')]")
	private WebElement male;
	
	public FitFinder clickmale()
	{
		click(male);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'runningType-running')]")
	private WebElement running;
	
	public FitFinder clickrunning()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", running);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-surface-1')]")
	private WebElement pavement;
	
	public FitFinder clickpavement()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", pavement);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-mileage-1')]")
	private WebElement mileage;
	
	public FitFinder clickmileage()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", mileage);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'btn-next')]")
	private WebElement next;
	
	public FitFinder clicknext()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", next);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'goals-1')]")
	private WebElement healthy;
	
	public FitFinder clickhealthy()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", healthy);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'weight-150')]")
	private WebElement under150;
	
	public FitFinder clickunder150()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", under150);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'archType-high')]")
	private WebElement higharch;
	
	public FitFinder clickhigharch()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", higharch);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'legPos-out')]")
	private WebElement legpos;
	
	public FitFinder clicklegpos()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", legpos);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'back-men-lbl')]")
	private WebElement pain;
	
	public FitFinder clickpain()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", pain);
		
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'cushion-5')]")
	private WebElement level;
	
	public FitFinder clicklevel()
	{
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", level);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'prefs-size-variants.Shoe_Size%3A8')]")
	private WebElement size;
	
	public FitFinder clicksize()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", size);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using=" //*[contains(@id,'prefs-width-variants.Shoe_Size%3A8%2Cvariants.widthGroup%3AMen%27s+Standard')]")
	private WebElement width;
	
	public FitFinder clickwidth()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", width);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Get it now')]")
	private WebElement getitnow;
	
	public FitFinder clickgetitnow()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", getitnow);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'addToCartButton')]")
	private WebElement addtocart;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'Black')]")
	private WebElement color;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'8')]")
private WebElement sizes;

	@FindBy(how=How.XPATH,using="//*[contains(@id,'Width;D')]")
	private WebElement widthd;
	
	public FitFinder clickaddtocart()
	{
		
		click(color);
		click(sizes);
		click(widthd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", addtocart);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}