package comp.MavenPracticeDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		//text box 
		driver.findElement(By.xpath("(//div[@class='card-up']) [1]")).click();
		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click(); 
		driver.findElement(By.id("userName")).sendKeys("Mohammed"); 
		driver.findElement(By.id("userEmail")).sendKeys("Mohammed@gmail.com"); 
		driver.findElement(By.id("currentAddress")).sendKeys("Brooklyn");
		driver.findElement(By.id("permanentAddress")).sendKeys("New York"); 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']")).click(); 
		driver.close(); 

	}

}
