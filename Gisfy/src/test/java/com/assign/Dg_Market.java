package com.assign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dg_Market {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.dgmarket.com");
		System.out.println("Enter Url Successfully");
		// For Login
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.id("username")).sendKeys("azghar@gisfy.co.in");
		driver.findElement(By.id("password")).sendKeys("dgmarket");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Login Successfully");
		int count=0;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
		System.out.println(link.getText());
		count++;}
		System.out.println("Total link"+count);
		driver.findElement(By.partialLinkText("Bidding Documents")).click();
//		//For  normal Download
//		driver.findElement(By.linkText("REOI for Hiring a Communication Agency to implement the Communication and Visibility Strategy - Households Natural Gas connection Project -")).click();
//		driver.findElement(By.linkText("Bidding Documents (2)")).click();
//		driver.findElement(By.linkText("//table[@id='noticeFile']")).click();
//		driver.findElement(By.xpath("//td//a[text()='Invitation for Bids_SDP-RFB-08-RB_eng.docx']")).click();	
		
//		// Click on Information technology tenders
//		driver.findElement(By.xpath("//a[@title='Information technology tenders']")).click();
//        System.out.println("Click on Information technology tenders ");
//		// Click on Information technology tenders
//		
//
//		//driver.findElement(By.xpath("//a[text()='Bidding Package For Consumable Materials For Artificial Kidney In 2025-2026']")).click();
//		//System.out.println("Bidding Packer");
//		//driver.navigate().back();
//		driver.findElement(By.xpath("//a[text()='Buying Paper Glue']")).click();
//		//driver.findElement(By.linkText("Bidding Documents (8)")).click();
//		//String text = driver.findElement(By.xpath("//table[@id='noticeFile']")).getText();
//		//System.out.println(text);
//		driver.navigate().back();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[2]/table/tbody/tr/td/table[2]/tbody/tr/td/form/table/tbody/tr/td/div[2]/div/ul/li[3]/a[1]")).click();
////		driver.findElement(By.xpath("//a[text()='Radio Components In Assortment']")).click();
////		driver.findElement(By.linkText("Bidding Documents (11)")).click();
////		String tex = driver.findElement(By.xpath("//table[@id='noticeFile']")).getText();
////		String exact = driver.getTitle();
////		String actual = "Procurement Plan - dgMarket";
////		if (exact.equals(actual)) {
////			System.out.println("Download page");
////		} else {
////			System.out.println("No reached to download page");
////		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='logout']")).click();
//		System.out.println("Logout Successfully");
//		Thread.sleep(2000);
		driver.close();
		System.out.println("Close Browser");

	}

}
