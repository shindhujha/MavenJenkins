package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadFindLeadPage extends ProjectMethods{
	
	public MergeLeadFindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.NAME,using="id")
			private WebElement eleLeadId;
	public MergeLeadFindLeadPage clickFromLeadImg(){
		click(eleLeadId);
		return this;
	}
	
	
}
