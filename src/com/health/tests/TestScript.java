package com.health.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.health.utils.HomePage;
import com.health.utils.ListingPage;

public class TestScript extends HomePage{
         
	       ListingPage listingPage = new ListingPage();	
	
		@BeforeClass
		public void beforeClass() {
			driver = chrome();
		}
		
		@Test (priority=1)
		public void testBuyOption() {
			selectBuyPropertyOption();
		}
		
		@Test (priority=2)
		public void testCitySelection() throws InterruptedException {
			selectCity();
		}
		 @Test (priority=3)
		public void callLocality() throws Exception {
			selectLocality();
			Thread.sleep(5000);
		}
		
		@Test (priority=4)
		public void testBhkType() {
			selectApartmentType();
		}
		@Test (priority=5)
		public void testSearchButton() {
			clickSearchButton();
		}
		
		@Test (priority=6)
			public void testPropertySelection() throws InterruptedException {
				listingPage.selectFourthProperty();
			}
		
		@Test (priority=7)
			public void testOtherTabHandle() {
				listingPage.switchToOtherTab();
		}
		
		@Test (priority=8)
		public void checkDescription() {
			listingPage.navigateToDescription();
		}
          
		@AfterClass
		public void afterClass() {
			driver.quit();
		}
}
	

