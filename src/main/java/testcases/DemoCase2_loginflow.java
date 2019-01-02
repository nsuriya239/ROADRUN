package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class DemoCase2_loginflow extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders";
		testDescription="Verify the orders flow after login";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="demo2";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void demoorderswithLogin(String email, String password, String brandname,String code,String gift,String pin)  {
		
		
			new HomePage_RRS()
			.clickaccount()
			.enteremail(email)
			.clickNext()
			.enterpassword(password)
			.login()
			.accountcreation()
			.entersearch(brandname)
			.clickproductlinksecondtime()
			.choosecolorforsecondproduct()
			.choosesize()
			.addtocart()
	
			.viewCarts()
			
			
		
			.entercouponcodes(code)
			.giftcardexpand()
			.entergiftcard(gift)
			.enterpinnumber(pin)
			.clickapply()
			.revieworder();
			//.placeorderButton()
			//.orderConfirmationmessage();

			
			
	}

	}

