package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/iframe");
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		

		driver.manage().window().maximize();
        Thread.sleep(3000);

//        driver.switchTo().frame("mce_0_ifr");
//        driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
//        driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("demotesting");
        
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//a[text()='Description']")).click();
        
        //identify list of frames on webpage
        
        //System.out.println(frames.size());
        //driver.switchTo().frame(0);
        
        
	}

}
