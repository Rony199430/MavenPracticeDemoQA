package comp.MavenPracticeDemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGannotationExample {
	WebDriver driver;

	@BeforeClass 

	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test 
	
	public void test_1_navigateToExercise () throws InterruptedException {
				
		driver.get("https://demoqa.com/"); 
		//text box 
		driver.findElement(By.xpath("(//div[@class='card-up']) [1]")).click();
		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();}
	
	@Test
	public void test_2_insertData () throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("Mohammed"); 
		driver.findElement(By.id("userEmail")).sendKeys("Mohammed@gmail.com"); 
		driver.findElement(By.id("currentAddress")).sendKeys("Brooklyn");
		driver.findElement(By.id("permanentAddress")).sendKeys("New York"); 
		Thread.sleep(2000);}
	
	@Test 
	public void test_3_scrolling() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); 
		Thread.sleep(2000);}
		
	@Test 
	public void test_4_submit() {
		driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']")).click(); }
	
	@AfterClass 
	public void Closewindow() {
		driver.close();
	}
	
}
