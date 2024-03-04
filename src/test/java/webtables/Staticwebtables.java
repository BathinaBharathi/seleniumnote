package webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		// 1) Find total number of rows 
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows:" +rows);

		//2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns:" +cols);
		
		//3) Read specific row & column data
		
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();
		System.out.println(value);
		
		//4) Read data from all the rows & columns
		/*System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		for(int r=2;r<rows;r++) 
		{
			for(int c=1;c<cols;c++) 
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value1+"\t");
				
				
			}
			
			System.out.println();
		}*/
		
		//5) Print book names whose author is Amit
		/*for(int r=2;r<rows;r++) 
		{
			String author= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(author.equals("Mukesh")) 
			{
				String Bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(author+"     "+Bookname);
			}
		}*/
		int sum=0;
		for(int r=2;r<=rows;r++) 
		{
		String  price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		sum=sum+Integer.parseInt(price);
		}
		System.out.println("Total price of books:"+sum);

	}

}
