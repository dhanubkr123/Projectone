package dhanashri.newtest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class two {
	@Test
	public void loginGrotechmind() throws IOException
	{
		ChromeDriver driver=new ChromeDriver();
	     driver.get("https://grotechminds.com/registration/");
	     driver.manage().window().maximize();
	     driver.getTitle();
	     driver.findElement(By.id("fname")).sendKeys("Dhanashr");
	     driver.findElement(By.id("lname")).sendKeys("dtets");
	     driver.findElement(By.id("email")).sendKeys("dtest@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("fgstue12");
	     driver.findElement(By.xpath("//input[@class='Female form-check-input']")).click();
	  WebElement y=   driver.findElement(By.xpath("//select[@class='Skills ss form-control']"));
	  
	     Select sh=new Select(y);
	     sh.selectByIndex(1);
	  WebElement cb=   driver.findElement(By.id("Country"));
	  Select co=new Select(cb);
	  co.selectByValue("India");
	     driver.findElement(By.id("Present-Address")).sendKeys("Boriwali");
	     driver.findElement(By.name("Permanent-Address")).sendKeys("boriwali");
	     driver.findElement(By.id("Pincode")).sendKeys("400082");
	     WebElement K=driver.findElement(By.xpath("//select[@name='Relegion']"));
	     Select m=new Select(K);
	     m.selectByVisibleText("Hindu");
	     WebElement upload = driver.findElement(By.id("file"));
		upload.sendKeys("C:\\Users\\HP\\Desktop\\Batch39\\Assignmeet no31.txt");
	     
	     driver.findElement(By.xpath("//input[@class='relocate form-check-input']")).click();
	     driver.findElement(By.xpath("//button[@name='Submit']")).click();
	     
			/*
			 * TakesScreenshot t =driver;
			 * 
			 * File source=t.getScreenshotAs(OutputType.FILE); File destination=new
			 * File("C:\\Users\\HP\\eclipse-workspace\\seleniumproject\\screen\\tests.png");
			 * 
			 * FileHandler.copy(source, destination);
			 * 
			 */

	     
	}

}