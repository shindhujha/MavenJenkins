package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To create a lead";
		category= "Sanity";
		authors	="Sindhu";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, String cName, String fName, String lName, String sName, String mName) {

		new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMFSAlnk()
		.clickLeadsLnk()
		.clickCreateLeadLnk()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSourceId(sName)
		.selectMarketingId(mName)
		.clickCreateLeadBtn()
		.verifyFirstName(fName);
		
		


	}

}


