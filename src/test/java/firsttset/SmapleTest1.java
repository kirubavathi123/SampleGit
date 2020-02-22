package firsttset;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SmapleTest1 {
	@Test
	public void sampleTest() throws IOException, InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement we = wd.findElement(By.name("q"));
		we.sendKeys("chennai");
		we.submit();
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\admin\\workspace\\GitHubTest\\Screenshot"));
		Thread.sleep(5000);
		wd.quit();
		
		
	}
}
