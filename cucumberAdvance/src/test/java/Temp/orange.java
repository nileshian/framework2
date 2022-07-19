package Temp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orange {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		Actions action = new Actions(driver);
		WebElement user = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
//		WebElement user = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		action.moveToElement(user).perform();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"] | //a[@id='menu_admin_viewSystemUsers']")).click();
//	        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]| /html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/ul/li/a")).click();

	}

}
