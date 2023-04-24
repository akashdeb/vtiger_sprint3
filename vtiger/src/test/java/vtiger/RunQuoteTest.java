package Quote;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMREPO.HomePage;
import genericUtility.BaseClass;
import genericUtility.IPATHCONSTANT;

public class RunQuoteTest extends BaseClass {
	@Test
	public void CreateQuoteTestScript() throws EncryptedDocumentException, IOException, InterruptedException {
		String Quote = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_LEAD, 18, 2);
		String BillingAddress = "Uttrakand";
		String ShippingAddress ="Himachal Pradesh";
		String Opportunityname = "google123";
		String productname      =  "wheels";
		String quantity = "10";
		HomePage home =  new HomePage(driver);
		home.ClickonQuote();
		CreateQuote quote = new CreateQuote(driver);
		quote.ClickonQuoteplusButton();
		
		QuoteDetails Detials = new QuoteDetails(driver);
		Detials.QuoteName(Quote);
		
		Detials.ClickonOpportunityLookUp();
		wUtils.switchToWindow(driver, "Opportunity&Actions");
		Detials.EnterNameOpportunitySearchField(Opportunityname);
		Detials.ClickonOpportunitySearchButton();
		Detials.ClickonAfterOpportunitySearchButton(Opportunityname);
		
		wUtils.switchToWindow(driver, "Quote Information");
		
		
		
		Detials.EnterBilliingAddress(BillingAddress);
		Detials.EnterShippingAddress(ShippingAddress);
		
		Detials.ClickonProductLookUp();
		wUtils.switchToWindow(driver, "Product &Actions");
		Detials.EnterProductNameonSearchField(productname);
		Detials.ClickonProductSearchButton();
		Detials.ClickonAfterProductNameSearch(productname);
		
		
		
		wUtils.switchToWindow(driver, "Quote Information");
		
		Detials.EnterQuantityValue(quantity);
		
		Detials.ClickonSaveButton();
		
		QuoteInfoPage quoteInfo=new QuoteInfoPage(driver);
		String actualProductName = quoteInfo.verifyquote(Quote);
		Assert.assertTrue(actualProductName.contains(Quote));
		System.out.println("Pass: The quote is created");
		
	}

}
