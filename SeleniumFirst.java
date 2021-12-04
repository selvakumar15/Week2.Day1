package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirst {

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
		
		driver.close();
	}
}