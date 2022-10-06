package seleniumaug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p78 
{


public static void main(String[] args) { 
	WebDriver driver = new ChromeDriver(); driver.manage().window().maximize(); driver.get("http://www.greenstechnologys.com/");

	WebElement courses = driver.findElement(By.linkText("COURSES")); Actions a=new Actions(driver);
	a.moveToElement(courses).perform(); Thread.sleep(2000);
	WebElement devOpTraining = driver.findElement(By.xpath("//span[text()='DevOps Training']"));

	a.click(devOpTraining).perform();



}}
