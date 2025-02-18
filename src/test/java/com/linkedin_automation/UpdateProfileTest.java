package com.linkedin_automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdateProfileTest {
	
	@Test
	public void profileEdit() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.linkedin.com/");
		
		//Sign-in
		driver.findElement(By.xpath("//a[contains(@data-tracking-control-name,'signin')]")).click();
		driver.findElement(By.id("username")).sendKeys("zaherma2408@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hello123");
		driver.findElement(By.cssSelector("button[data-litms-control-urn*='login-submit']")).click();
		
		//Editing & saving the Info
		driver.findElement(By.cssSelector(".feed-identity-module__member-photo")).click();
		driver.findElement(By.xpath("//button[@aria-label='Edit intro']")).click();
		driver.findElement(By.cssSelector("button[data-view-name='profile-form-save'] span")).click();
		
		//Closing the browser
		driver.quit();

	}

}
