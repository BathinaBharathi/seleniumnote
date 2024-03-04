package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open url
				WebDriver driver =new ChromeDriver();
						driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select specific checkbox
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		//total no of checkboxces
		//input[@type='checkbox']
		
		
	}

}
