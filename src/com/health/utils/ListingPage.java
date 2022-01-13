package com.health.utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class ListingPage extends HomePage{
	
	public  void switchToOtherTab() {                          // for navigating to other tab
	String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
		    if (!handle.equals(mainWindow)) {
		          driver.switchTo().window(handle);
		          break;
		    }
		}
	}
	
		public void selectFourthProperty() throws InterruptedException {              //checks the property selection
		List<WebElement> l = driver.findElements(By.className("nb__2_XSE"));        
	      l.get(3).click();
	      Thread.sleep(3000);
}
	
		public void navigateToDescription() {                                            //check if description is written or not 
			System.out.println("title: "+driver.getTitle());
			WebElement description =  driver.findElement(By.className("nb__1Ci-P"));
			String str = description.getText();
			Assert.assertNotNull(str);
			System.out.println("PASSED");
		}
}
