package org.data;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/index.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//        //To Scroll using pixel
//		//To Scroll down
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
//		//To scroll Up
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);

		// To scroll specific Area
        
	}

}
