package vtiger.leads;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMRepo.CreateNewLeadPage;
import POMRepo.HomePage;
import POMRepo.LeadInformationPage;
import POMRepo.LeadsPage;
import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.ExcelUtility;
import vtiger.genericUtility.IPathConstant;

@Listeners(vtiger.genericUtility.ListenersImplementationClass.class)

public class ToCreateALeadTest extends BaseClass {
	
	@Test(retryAnalyzer = vtiger.genericUtility.RetryAnalyserImplementationClass.class)
	public void toCreateALeadAndToVerifyTheLead() throws EncryptedDocumentException, IOException {
		
		String salutation = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 17, 2);
		String firstName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 18, 2);
		String lastName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 19, 2);
		String companyName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 20, 2);
		String industryName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 21, 2);
		String assignedTo = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_LEAD, 23, 2);
		
		HomePage home=new HomePage(driver);
		home.clickOnLeadsModule();
		Assert.fail();
		LeadsPage leads = new LeadsPage(driver);
		leads.clickOnLeadsPlusButton();
		
		CreateNewLeadPage createLead = new CreateNewLeadPage(driver);
		createLead.selectSalutationType(salutation);
		createLead.enterFirstName(firstName);
		Assert.fail();
		createLead.enterLastName(lastName);
		createLead.enterCompanyName(companyName);
		createLead.selelctFromIndustryDropdown(industryName);
		createLead.clickOnGroupRadioButton();
		createLead.selelctFromAssignToDropdown(assignedTo);
		createLead.clickOnSaveButton();
		
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		String actualLeadName = leadInfo.verifyLeadInfo(firstName);
		
		Assert.assertTrue(actualLeadName.contains(firstName));
		System.out.println("The Lead has been created");
		
	}

}
