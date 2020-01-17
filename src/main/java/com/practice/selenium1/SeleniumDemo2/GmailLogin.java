package com.practice.selenium1.SeleniumDemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailLogin {
	public WebDriver driver;

	String appUrl = "https://accounts.google.com";

	@Test
	public void gmailLogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://gmail.com");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.findElement(By.id("identifierId")).sendKeys("rosecaroline2017@gmail.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

		wait.until(ExpectedConditions.elementToBeClickable(password));

		password.sendKeys("philip92*");

	}
}
