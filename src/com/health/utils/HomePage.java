package com.health.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

       public static WebDriver driver;
       public static String url = "https://www.nobroker.in/" ;
       
       public static WebDriver chrome() {                                                     //opens chrome browser      
    	   System.setProperty("webdriver.chrome.driver",
    			   System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.navigate().to(url);
   		driver.manage().window().maximize();
   		return driver;
	}
       
       public static void selectBuyPropertyOption() {                                          // select the buy option
       try {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[1]")).click(); 
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Radio button not found");
		}
       }
       
       public static void selectCity() throws InterruptedException {                                    //selects mumbai city
    			WebElement f =  driver.findElement(By.xpath("//*[@id=\"searchCity\"]/div/div[1]"));
    			f.click();
    			Actions keyDown = new Actions(driver);
    			keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    			//Thread.sleep(3000);
    			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
           }
       
       
       public static void selectLocality() throws Exception {               // select the east locality
        	   WebElement e = driver.findElement(By.id("listPageSearchLocality"));
        	   e.sendKeys(ExcelGetData.getFromValue());
        	   
        	   List<WebElement> lst = driver.findElements(By.className("form-control"));
        	   lst.get(0).click();
        	   
        	   /*Select s = new Select(e);
        	   s.selectByIndex(3);*/
   			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

           }
       
       
       public static void selectApartmentType() {                                   // selects the 1BHK and 2BHK option
    	    List<WebElement> l = driver.findElements(By.id("searchCity"));
    	    
    	      for(int j = 0; j< l.size(); j++) {
    	         l.get(1).click();
    	         Actions keyDown = new Actions(driver);
     			keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
    	         keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
    	      }
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
       }
       
       
       public static void clickSearchButton() {                                                            //clicks the search button     
    		   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[4]/button")).click();   
    		   driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
       }
       
       
       
       
}
