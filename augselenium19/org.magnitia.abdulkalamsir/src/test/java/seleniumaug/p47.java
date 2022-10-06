//Usage: dropdown select by value

package seleniumaug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;
public class p47 
{


public static void main(String[] args)
{ 
	WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver(); 
 driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
 WebElement w = driver.findElement(By.name("coffee")); Select s=new Select(w);
			s.selectByValue("regular");
			}
			}

//Output: with cream and sugar selected
