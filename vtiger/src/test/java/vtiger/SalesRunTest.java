package SalesOrderTestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMREPO.HomePage;
import SalesOrder.CreateSalesOrder;
import SalesOrder.SalesInfo;
import SalesOrder.SalesInformationPage;
import genericUtility.BaseClass;
import genericUtility.IPATHCONSTANT;

public class SalesRunTest extends BaseClass{
	
	@Test
	public void CreateTestScript() throws EncryptedDocumentException, IOException {
		String Salesname = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 18, 2);
		String Opportunity = "Akash";
		String BillingAddress = "HomeTown";
		String ShippingAddress ="county";
		String productName = "wheels";
		String quant       =  "10";
		
		HomePage information = new HomePage(driver);
		information.ClickonSalesOrder();
		
		CreateSalesOrder order =new CreateSalesOrder(driver);
		order.CreateSales();
		
		SalesInfo sale = new SalesInfo(driver);
		sale.EnterSubjectName(Salesname);
		
		sale.OrganizationLookup();
		
		
		wUtils.switchToWindow(driver, "Organizations&actios");
		
		
		sale.EnterOrganizationNameSearchtxt(Opportunity);
		sale.OrgSearchButton();
		sale.clickOnorganizationNameAfterSearch(Opportunity);
		
	
		
		
		
		wUtils.switchToWindow(driver, "Sales Order Information");
		
		sale.EnterBillingAddress(BillingAddress);		
		sale.EnterShippingAddress(ShippingAddress);		
		
		
		sale.ClickonLooKUp();
		wUtils.switchToWindow(driver, "ProductName &Actions");
		sale.EnterProductNameSearchTxt(productName);
		sale.ClickSearchButton();
		sale.clickonProductNameAfterSearch(productName);
				
		wUtils.switchToWindow(driver, "Sales Order Information");
		
		
		sale.quantity(quant);
		
		sale.SaveButton();
		
		SalesInformationPage quoteInfo=new SalesInformationPage(driver);
		String actualProductName = quoteInfo.verifyquote(Salesname);
		Assert.assertTrue(actualProductName.contains(Salesname));
		System.out.println("Pass: The SalesOrder is created");
		
	}

}
