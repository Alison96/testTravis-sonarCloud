import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testSelenium1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/alisonpetrilli/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html");
		
		driver.findElement(By.xpath("//*[@id=\"x\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"doc\"]/form/table/tbody/tr[2]/td[2]/button[1]")).click();
		
		WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"y\"]"));
		
		assertEquals((double)86,Double.parseDouble(TxtBoxContent.getAttribute("value")));
		
		System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
		
		driver.close();
		
	}
	
		
	

}
