package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
        Thread.sleep(12000);

    //Scroll down
		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,350)", "");
    		//single frame
    		
    		driver.switchTo().frame(driver.findElement(By.id("singleframe")));//--using webelement
    		//driver.switchTo().frame("SingleFrame");//---using id or name
    		//driver.switchTo().frame(1);//----using index
    		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demotesting");
    		
    		driver.switchTo().defaultContent();//--using bacck to iframe
    		
    //iframe with in an iframe
    		
    		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
    		driver.switchTo().frame(driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]//following::iframe[1]")));
    		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing Practice");
	}

}
