package week2.day1;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leadcreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// set up chrome browser

		WebDriverManager.chromedriver().setup();

		// launch the chrome browser

		ChromeDriver driver = new ChromeDriver();

		// load the url (method -get- https)

		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser

		driver.manage().window().maximize();

		// get the title

		//createLeadForm_dataSourceId
		
		String title = driver.getTitle();

		System.out.println(title);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wifs");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selvakumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasamy");
		WebElement drop2 =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(drop2);
		select.selectByVisibleText("Employee");
	    driver.findElement(By.name("submitButton")).click();
		
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		// driver.quit();

	}

}

 