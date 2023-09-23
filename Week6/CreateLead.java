package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";

	}
    
	@Test(dataProvider = "fetchData")
	public void createLeadTestcase(String cName,String fName,String lName,String pNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println(cName+ "Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		

	}
	
//	@DataProvider(name="fetchData")
//	public String[][] sendData() throws IOException {
//		
//		return ReadExcel.readExcel("CreateLead");
//		/*
//		 * // rowCount columnCount String[][] data = new String[3][4]; //1st set of data
//		 * data[0][0] = "TestLeaf"; data[0][1] = "Subraja"; data[0][2] = "S"; data[0][3]
//		 * = "91"; //2nd set of data data[1][0] = "Qeagle"; data[1][1] = "Aravind";
//		 * data[1][2] = "R"; data[1][3] = "99"; //3rd set of data data[2][0] =
//		 * "Infosys"; data[2][1] = "Vidhya"; data[2][2] = "R"; data[2][3] = "90";
//		 * 
//		 * return data;
//		 */
//						
//	}
//	
	

}
