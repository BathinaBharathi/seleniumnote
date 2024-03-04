package testNGsessions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataProviderTest {
	
	WebDriver driver;

    // Path to your Excel file
    private static final String FILE_PATH = "C:\\Users\\saikrishna.vandanapu\\Testdata.xlsx";

    // Method to read data from Excel
    private Object[][] readDataFromExcel() throws IOException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1); // Skip header row
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue(); // Assuming all data is strings
            }
        }
        workbook.close();
        fis.close();
        return data;
    }

    // Data provider method
    @DataProvider(name = "excelData")
    public Object[][] provideData() throws IOException {
        return readDataFromExcel();
    }

    // Test method using data provider
    @Test(dataProvider = "excelData")
    public void testDataFromExcel(String data1, String data2, String data3, String data4, String data5) {
        System.out.println("Data from Excel: " + data1 + ", " + data2);
        // Your test logic using the provided data
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://qbank.accelq.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.xpath("//input[@id='qb-username']")).sendKeys(data1);
//        driver.findElement(By.xpath("//input[@id='qb-password']")).sendKeys(data2);
        registartion(data1, data2);
        
        System.out.println("the excel data is "+data1+" "+data2+" "+data3+" "+data4+" "+data5 );
        
    }
    
    public void registartion(String username, String passsowrd) {
      driver.findElement(By.xpath("//input[@id='qb-username']")).sendKeys(username);
      driver.findElement(By.xpath("//input[@id='qb-password']")).sendKeys(passsowrd);
    }
}

