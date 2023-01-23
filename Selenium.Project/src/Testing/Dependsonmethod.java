package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod {
	@Test(dependsOnMethods="register")
	public void createAccount() {
		Reporter.log("Frame Create Account",true);
	}
	@Test(dependsOnMethods={"createAccount","register"})
	public void modifyAccount() {
		Reporter.log("Frame Modify Account",true);
	}
	@Test
	public void register() {
		Reporter.log("Frame register Account",true);
	
   }
	@Test(dependsOnMethods="createAccount")
	public void amountTransfer() {
		Reporter.log("Frame Amount Transfer",true);
	}
	@Test(dependsOnMethods={"createAccount","modifyAccount"})
	public void deleteAcoount() {
		Reporter.log("Frame delete Account",true);
	}
} 
