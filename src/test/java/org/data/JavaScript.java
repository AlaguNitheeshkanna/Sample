package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/index.html");
		WebElement trichy = driver.findElement(By.xpath("//span[text()='Greens Technologys Trichy ']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll Down to specific line
		js.executeScript("arguments[0].scrollIntoView(true)",trichy);
		Thread.sleep(2000);
		//Scroll Up to specific line
	    WebElement adyar = driver.findElement(By.xpath("//span[text()='Greens Technology Adyar']"));
	    js.executeScript("arguments[0].scrollIntoView(false)",adyar);

	}

}
