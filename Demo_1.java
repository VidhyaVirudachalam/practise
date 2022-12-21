package com.selenium.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_1 {

	public static void main(String[] args) throws InterruptedException  {
		//Browser launch;
			  System.setProperty("webdriver.chrome.driver",
					  "C:\\Users\\V.VIDHYA\\eclipse-workspace\\Selenium Java Project\\Driver\\chromedriver.exe");
	          WebDriver driver = new ChromeDriver();
	    //URL launch;
	          driver.get("https://adactinhotelapp.com/");
	    //windows maximize;
	          driver.manage().window().maximize();
	//Login page;
	    //passing values in name and password box; using sendKeys;
	          WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
			  name.sendKeys("nareshini");
			  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			  password.sendKeys("1234567");
	   //clicking login button; using click;
			  WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
			  login.click();
			  
			  
			//click and select location in the dropdown; using visibletext;
			  WebElement location =  driver.findElement(By.xpath("//select[@id='location']"));
			  location.click();
			  Select s = new Select(location);
			  s.selectByVisibleText("New York");
	    //click and select hotel in the dropdown; using visibletext;	  
			  WebElement hotel =  driver.findElement(By.xpath("//select[@id='hotels']"));
			  hotel.click();
			  Select s1 = new Select(hotel);
			  s1.selectByVisibleText("Hotel Sunshine");
		//click and select room_type in the dropdown; using value;	  	  
			  WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
			  room_type.click();
			  Select s2 = new Select(room_type);
			  s2.selectByValue("Super Deluxe");
		//passing in and out dates;	 using sendKeys; 
			  WebElement in_date =  driver.findElement(By.xpath("//input[@id='datepick_in']"));
			  in_date.clear();                 //clearing the predefined datas; using clear;
			  in_date.sendKeys("14/02/2022");
			  WebElement out_date =  driver.findElement(By.xpath("//input[@id='datepick_out']"));
			  out_date.clear();               //clearing the predefined datas; using clear;
			  out_date.sendKeys("18/02/2022");
	    //click and select count in the dropdown; using value;  
			  WebElement count =  driver.findElement(By.xpath("//select[@id='adult_room']"));
			  count.click();
			  Select s3 = new Select(count);
			  s3.selectByValue("2");
		//clicking search button; using click;	  
			  WebElement search =  driver.findElement(By.xpath("//input[@id='Submit']"));
			  search.click();
			  
			  
			//clicking select radio-button; using click;
			  WebElement select =  driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
			  select.click();
		//clicking continue button; using click;	  
			  WebElement continue_btn =  driver.findElement(By.xpath("//input[@id='continue']"));
			  continue_btn.click();
			  
			  
			//passing first and last names,address,cc number; using sendKeys; (cc number should be 16 digit);
			  WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
			  first_name.sendKeys("nareshini");
			  WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
			  last_name.sendKeys("v");
			  WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
			  address.sendKeys("no.14,peter colony,california");
			  WebElement credit_card = driver.findElement(By.xpath("//input[@id='cc_num']"));
			  credit_card.sendKeys("1234567890123456");
		//click and select card_type in the dropdown; using visibletext;
			  WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
			  card_type.click();
			  Select s4 = new Select(card_type);
			  s4.selectByVisibleText("Master Card");
		//click and select expiry_month in the dropdown; using visibletext;	  
			  WebElement expiry_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
			  expiry_month.click();
			  Select s5 = new Select(expiry_month);
			  s5.selectByVisibleText("February");
		//click and select expiry_year in the dropdown; using visibletext;	  
			  WebElement expiry_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
			  expiry_year.click();
			  Select s6 = new Select(expiry_year);
			  s6.selectByVisibleText("2022"); 
		//passing cvv number; using sendKeys;(cvv number should be 3 digit);	  
			  WebElement cvv_num = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			  cvv_num.sendKeys("123");
		//clicking booknow button; using click;
			  WebElement book_now =  driver.findElement(By.xpath("//input[@id='book_now']"));
			  book_now.click();
			  
			  
			//clicking booked_itinery button (on top);		
			  WebElement booked_itinery =  driver.findElement(By.xpath("//a[.='Booked Itinerary']"));
			  booked_itinery.click();
			  
			  
			  //WebElement table_check_box =  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
				//table_check_box.click();
			//clicking cancel button; using click;
				WebElement cancel =  driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
				cancel.click();
				//Alert box;
				//Switching to alert box;
					Alert a = driver.switchTo().alert();
					Thread.sleep(3000);
					a.accept();
					Thread.sleep(2000);
				//clicking log_out button; using click;	
					WebElement log_out =  driver.findElement(By.xpath("//input[@id='logout']"));
					log_out.click();
					System.out.println("successfully logged out");
			  
	}
}