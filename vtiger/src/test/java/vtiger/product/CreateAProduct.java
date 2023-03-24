package vtiger.product;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.crypto.engines.CramerShoupCoreEngine.CramerShoupCiphertextException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMRepo.CreatingNewProductPage;
import POMRepo.CreatingNewVendor;
import POMRepo.HomePage;
import POMRepo.LeadsPage;
import POMRepo.ProductInformationPage;
import POMRepo.ProductPage;
import POMRepo.VendorInformationPage;
import POMRepo.VendorsPage;
import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;
import vtiger.genericUtility.JavaUtility;
import vtiger.genericUtility.WebDriverUtility;
@Listeners(vtiger.genericUtility.ListenersImplementationClass.class)
public class CreateAProduct extends BaseClass {
	
	@Test
	public void createProductWithVendorDetails() throws EncryptedDocumentException, IOException {
		
		String vendorName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_VENDOR, 18, 2);
		String productName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_PRODUCT, 17, 2);
		
		
		JavaUtility jUtils=new JavaUtility();
		String SalesStartDate = jUtils.generateDateInYYYY_MM_DDFormat();
		
		HomePage home=new HomePage(driver);
		home.clickOnVendorsModule();
		
		VendorsPage vendors = new VendorsPage(driver);
		vendors.clickOnVendorsPlusButton();
		
		CreatingNewVendor createVendor = new CreatingNewVendor(driver);
		createVendor.enterVendorName(vendorName);
		createVendor.clickOnSaveButton();
		
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		String actualVendorName = vendorInfo.verifyVendorInfo(vendorName);
		
		Assert.assertTrue(actualVendorName.contains(vendorName));
		System.out.println("Pass: The vendor has been created");
		
		home.clickOnProductModule();
		
		ProductPage product=new ProductPage(driver);
		product.clickOnProductPlusButton();
		
		CreatingNewProductPage createProduct=new CreatingNewProductPage(driver);
		createProduct.enterProductName(productName);
		
		createProduct.enterDate(SalesStartDate);
		createProduct.clickOnVendorLookUpButton();
		
		wUtils.switchToWindow(driver, "Vendors&action");
		createProduct.enterInSearchTextBox(vendorName);
		createProduct.clickOnSearchButton();
		createProduct.clickOnVendorNameAfterSearch(vendorName);
		
		wUtils.switchToWindow(driver, "Products");
		createProduct.uploadProductImage("/src/test/resources/DemoPrint2231423.pdf");
		
		createProduct.clickOnSaveButton();
		
		ProductInformationPage productInfo=new ProductInformationPage(driver);
		String actualProductName = productInfo.verifyProduct(productName);
		Assert.assertTrue(actualProductName.contains(productName));
		System.out.println("Pass: The product is created");
		
	}

}
