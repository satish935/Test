package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WritingSeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver(new FirefoxProfile());
driver.manage().window().maximize();
driver.get("http://www.amazon.com");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");
driver.findElement(By.className("nav-input")).click();

Select dropdown = new Select(driver.findElement(By.id("sort")));
dropdown.selectByIndex(3);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.cssSelector("#result_0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
Assert.assertTrue(driver.findElement(By.id("productTitle")).getText().contains("Nikon D3X"));
driver.quit();
	}
}
