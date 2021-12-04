package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println(title);

		// createLeadForm_primaryPhoneCountryCode
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wifs");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selvakumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

		WebElement drop6 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select6 = new Select(drop6);
		select6.selectByVisibleText("Demo Marketing Campaign");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumarraja");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("15/05/1982");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Dep");

		WebElement drop5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select5 = new Select(drop5);
		select5.selectByValue("AOK");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NFR");

		WebElement ddrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(ddrop);
		select.selectByValue("LEAD_EMPLOYEE");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,00,000");

		WebElement ddrop1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select1 = new Select(ddrop1);
		select1.selectByValue("IND_SOFTWARE");

		WebElement ddrop2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select3 = new Select(ddrop2);
		select3.selectByValue("OWN_PROPRIETOR");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("3344");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("welcome to wifs fintech company");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("very important");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("9");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("43443100");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("selvakumar.ramasamyk@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("4484884");
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("9655110821");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("selvakumar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("G1 guru krupa appts");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("kodambakkam");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600024");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raju");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("United india colony");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		WebElement ddrop4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select4 = new Select(ddrop4);
		select4.selectByVisibleText("California");

		driver.findElement(By.name("submitButton")).click();
		String txt = driver.getTitle();
		System.out.println(txt); 
	}

}
