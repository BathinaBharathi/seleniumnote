package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class Pagination1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		//using explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));//sel 4.x

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Close']"))).click();


		int pageCount = 1;
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Samsun']")).size() > 0) {
				selectCity1("Samsun");
				System.out.println("page count: " + pageCount);
				break;
			} else {
				// pagination logic:
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over....record is not found....");
					break;
				}
				next.click();
				Thread.sleep(1000);
				pageCount++;
			}

		}

	}

	public static void selectCity(String cityName) {
		driver.findElement(
				By.xpath("//td[text()='" + cityName + "']//preceding-sibling::td/child::input[@type='checkbox']"))
				.click();
	}

	public static void selectCity1(String cityName) {
		WebElement ele = driver.findElement(By.xpath("//td[text()='" + cityName + "']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();

	}

}
