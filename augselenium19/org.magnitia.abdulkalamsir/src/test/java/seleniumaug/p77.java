//Usage: to take screen shot of a webpage we use an interface TakesScreenShot.
//Steps to take screen shot of a web page.
//create reference of TakesScreenShot interface.
//Get the screen shot using getScreenShotAs(). By default it will store screen shots in temp folder.
//Create destination to store the file using File class.
//Copy the file from src to destination using copyFile() of FileUtils class.


package seleniumaug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class p77 
{


		public static void main(String[] args) throws IOException 
		{ WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver(); driver.get("https://www.facebook.com/"); driver.findElement(By.id("email")).sendKeys("Hello");
		//screenshot declaration
		TakesScreenshot tk=(TakesScreenshot) driver;
		File source= tk.getScreenshotAs(OutputType.FILE); File des=new File("F:/facebook.png"); FileUtils.copyFile(source,des );

		}


}
