package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Fit extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Add to cart section";
		testDescription="Verify the add to cart section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void fit()  {
		
		new HomePage_RRS()
		.clickFitFinder()
		.clickGetStarted()
		.clickmale()
		.clickrunning()
		.clickpavement()
		.clickmileage()
		.clicknext()
		.clickhealthy()
		.clicknext()
		.clickunder150()
		.clicknext()
		.clickhigharch()
		.clicknext()
		.clicklegpos()
		.clicknext()
		.clickpain()
.clicknext()
.clicklevel()
		.clicknext()
		.clicksize()
		.clickwidth()
		.clicknext()
		.clickgetitnow()
		.clickaddtocart();
	}
}