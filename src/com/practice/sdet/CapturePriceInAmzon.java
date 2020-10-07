package com.practice.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePriceInAmzon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerators");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		String x="//span[text()='Haier 181 L 2 Star Direct-Cool Single Door Refrigerator (HED-1812BKS-E, Black Brushline)']/ancestor::div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']/descendant::span[@class='a-price-whole']"; 
				
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println("Price of product is:"+price);
			
		
		

	}

}
