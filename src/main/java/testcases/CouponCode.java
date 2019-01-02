package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class CouponCode extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders";
		testDescription="Verify whether coupon code is working fine or not";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="coupon";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void verifycouponcode(String email, String password, String brandname,String code)  {
		
		
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
			.viewCart()
			.emailsection()
			.shippingsection()
			.billingsection()
			.entercouponcode(code);
	}
}
	
