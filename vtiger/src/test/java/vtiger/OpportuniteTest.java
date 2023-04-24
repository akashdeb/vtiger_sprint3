package Opportunity;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import OpportunitiesModule.CreateOpportunities;
import OpportunitiesModule.OpportunitiesInfo;
import OpportunitiesModule.OpportunitiesInfoPage;
import POMREPO.HomePage;
import genericUtility.BaseClass;
import genericUtility.IPATHCONSTANT;

public class OpportuniteTest extends BaseClass {
	
	@Test
	public void createOpportunitiesTest() throws EncryptedDocumentException, IOException {
		String Opportunitesname = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 18, 2);
		String organizationName ="google";
		String nextmove = "marketing";
		String Date = "2023-04-30";
		//JavaUtility jUtils=new JavaUtility();
		//String SelectClosingDate = jUtils.generateDateInYYYY_MM_DDFormat();
		
		HomePage home = new HomePage(driver);
		home.clickOnOpportunities();
		
		CreateOpportunities create = new CreateOpportunities(driver);
		create.ClickonOpportunitiesModule();
		
		OpportunitiesInfo Info = new OpportunitiesInfo(driver);
		Info.EnterOpportunityName(Opportunitesname);
		
		Info.LookUpButton();
		wUtils.switchToWindow(driver, "organizations&actions");
		Info.EnterinSearchTextBox("google121");
		Info.ClickonSearchButton();
		Info.clickOnorganizationNameAfterSearch(organizationName);
		
		wUtils.switchToWindow(driver, "opportunities");
		
		//Info.Closingdate(SelectClosingDate);
		
		Info.ExpectedCloseDate(Date);
		
		Info.EnterNextStep(nextmove);
		
		Info.ClickonSaveButton();
		
		OpportunitiesInfoPage opportunity = new OpportunitiesInfoPage(driver);
		String actualOpportunityName   = opportunity.verifyOpportunity(Opportunitesname);
		Assert.assertTrue(actualOpportunityName.contains(Opportunitesname));
		
		System.out.println("Pass: The opportunities  is created");
		
	}

}
