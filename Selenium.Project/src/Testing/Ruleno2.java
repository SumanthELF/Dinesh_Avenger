package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ruleno2 {
	@Test(priority=-1)
	public void createContact() {
			Reporter.log("FROM CREATE CONTACT",true);

}
	@Test(priority=-8)
	public void modifyContact() {
		Reporter.log("FROM MODIFY CONTACT",true);
		
	}
	@Test(priority=-6)
	public void deleteContact() {
		Reporter.log("FROM DELETE CONTACT",true);
	}
	
}
