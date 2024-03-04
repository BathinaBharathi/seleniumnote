package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Diffxpath {

	
//	private static final String Select  = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys("Allex");
		
		//htmltag[@attr1 = 'value' or @attr2 = 'value']
		//driver.findElement(By.xpath("//input[@type='text' or @placeholder='Last Name']")).sendKeys("dort");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("dort");
		//contains():----//htmltag[contains(@attr,'value')]
		driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adress')]")).sendKeys("Telegana");
		
		//contains() with multiple attributes:--//htmltag[contains(@attr1,'value') and contains(@attr2='value')]
		driver.findElement(By.xpath("//input[contains(@type,'email') and contains(@ng-model,'EmailAdress')]")).sendKeys("allex.dart@yopmail.com");
		
		//one attr with contains and one without contains:---//input[contains(@id,'email') and @type='text']
		driver.findElement(By.xpath("//input[contains(@type,'tel') and @ng-model='Phone']")).sendKeys("8725282628");
		
		driver.findElement(By.xpath("//label[contains(text(),'Gender*')]//following:: input[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Croatian')]")).click();
		
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//dropdown
		WebElement ele2 =driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select =new Select(ele2);
		select.selectByValue("Adobe Photoshop");
		//select.selectByVisibleText("Android");
		//select.selectByIndex(2);
		
		//dropdown
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Denmark']")).click();
		//dropdown
		WebElement ele3 =driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select select3 =new Select(ele3);
		select3.selectByValue("1930");
		
		//dropdown
				WebElement ele4 =driver.findElement(By.xpath("//select[@placeholder='Month']"));
				Select select4 =new Select(ele4);
				select4.selectByValue("March");
				
		//dropdown
				WebElement ele5 =driver.findElement(By.xpath("//select[@id='daybox']"));
				Select select5 =new Select(ele5);
				select5.selectByIndex(5);
				
				driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Testing@123");		
				driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Testing@123");
				driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		

	}

}
