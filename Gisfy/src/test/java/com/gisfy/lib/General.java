package com.gisfy.lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {
	WebDriver driver;

	public void openbrowser() {
		System.out.println("Openbrowser");
		driver = new FirefoxDriver();

	}

	public void enterurl() {
		System.out.println("Enterurl");
		driver.navigate().to(url);

	}

	public void login() throws InterruptedException {
		driver.findElement(By.xpath(link_login)).click();
		driver.findElement(By.id(txt_username)).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id(txt_password)).sendKeys(password);
		driver.findElement(By.xpath(btn_login)).click();
		System.out.println("Login");
		Thread.sleep(4000);

	}

	public void informationtechnology() throws InterruptedException {
		driver.findElement(By.linkText(link_InformationTechnology)).click();
		Thread.sleep(4000);
		System.out.println("InformationTechnology");
	}
	
	
	
	
public void verifylinks() {
	List<WebElement> links=driver.findElements(By.tagName(a));
	int count=1;
	for(WebElement link:links) {
		System.out.println(link.getText());
		link.click();
		System.out.println("link"+count);
		
		count++;
	}
	driver.navigate().back();
	System.out.println(count);
}
	






public void logout() {
		//driver.findElement(By.xpath(link_logout)).click();
		System.out.println("Logout");

	}

	public void closebrowse() {
		System.out.println("Closebrowse");
		//driver.quit();
	}

}