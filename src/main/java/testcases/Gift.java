package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Gift extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Gift the product";
		testDescription="Verify the gift flow";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="gift";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void gift(String email1, String password1,String brandname,String name, String fname,String lname,String emailadd,String phoneno,String fn,String ln,String add, String zi,String ci, String st, String fon, String email,String notes,String gee,String pww,String emailSubject)  {
		
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email1)
		.clickNext()
		.enterpassword(password1)
		.login()
		.accountcreation()
		.entersearch(brandname)
		.clickproductlinksecondtime()
		.choosecolorforsecondproduct()
		.choosesize()
			.clickgiftlink()
			.clickGetStarted()
			.enterRecepientName(name)
		
			.next()
			.enterfirstname(fname)
			.entersecondname(lname)
			.enteremail(emailadd)
			.enterphone(phoneno)
			.clicknext()
			.copypaste()
			.opengift()
			.graganddrop()
			.selectsize()
			.shipping(fn, ln, add, zi, ci, st, fon, email)
.thanku(notes)
.googlemail()
.gmaillogin(gee, pww)
.checkEmail(emailSubject)
.openmail()
.placeord();
			
			
			
			
		
}
}