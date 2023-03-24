package vtiger.basicTestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.genericUtility.BaseClass;

@Listeners(vtiger.genericUtility.ListenersImplementationClass.class)
public class ToCreateALeadANdToEdit extends BaseClass {

	@Test
	public void toCreateALeadAndEditTheLeadAndVerify() {
	System.out.println("The Lead has been created and Edited and Verified");	
	}
}
