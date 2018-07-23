package com.co.Pa.auto;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MetaNequi {

		public static AppiumDriver<MobileElement> driver;
		        Dimension size;
		        String destDir;
		        DateFormat dateFormat;
		       
		        @Before
		             public void setUpAppium() throws MalformedURLException, InterruptedException{
		            String packagename = "com.nequi.MobileApp";
		            String URL="http://localhost:4726/wd/hub";
		            String activityname = "com.nequi.MobileApp.MobileApp";
		            DesiredCapabilities capabilities = new DesiredCapabilities();
		                                capabilities.setCapability("deviceName", "Moto");
		                                capabilities.setCapability("udid", "ZY22442LBS");
		                                capabilities.setCapability("platformVersion", "22");
		                                capabilities.setCapability("platformName", "Android");
		                                capabilities.setCapability("appPackage", packagename);
		                                capabilities.setCapability("appActivity", activityname);
		                                capabilities.setCapability("noReset", true);
		                                driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
		                                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		                    }
		   
		                  // @AfterTest
		                  // public void CleanUpAppium() {                       
		                  // driver.quit();}
		                 
		                  @Test
		                  public void Meta() throws InterruptedException {
		                  	
		                      Thread.sleep(1000);
		                      String celular = "3999948210";
		           
		                  try {
		                	  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Entra ']")));
			                      	driver.findElement(By.xpath("//*[@text='Entra ']")).click();
			                      	driver.findElement(By.xpath("//*[@text='1']")).click();
			                      	driver.findElement(By.xpath("//*[@text='2']")).click();
			                      	driver.findElement(By.xpath("//*[@text='3']")).click();
			                      	driver.findElement(By.xpath("//*[@text='4']")).click();
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){}
			                 	 	driver.findElement(By.xpath("//*[@text='Reconocimiento facial Tu cara es solo tuya y con ella evitas que alguien entre a tu cuenta. ']")).click();
			                 	 	driver.findElement(By.xpath("//*[@text='Ahora no ']")).click();
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                 	 	driver.findElement(By.xpath("//*[@text='Metas']")).click();
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                 	 	driver.findElement(By.xpath("//*[@text='']")).click();
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                 	 	driver.findElement(By.xpath("//*[@index='0' and @bounds='[201,405][777,510]' and @knownSuperClass='android.widget.EditText']")).sendKeys("");
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                 	 	driver.findElement(By.xpath("//*[@bounds='[201,549][837,654]' and @knownSuperClass='android.widget.EditText']")).sendKeys("10000");
			                 	 	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                     	driver.findElement(By.xpath("//*[@text='Selecciona la fecha límite']")).click();
			                     	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                     	driver.findElement(By.xpath("//*[@id='next']")).click();
			                     	try{Thread.sleep(5000);} catch(Exception ignore){} 
			                     	driver.findElement(By.xpath("//*[@id='next']")).click();
			                     	try{Thread.sleep(5000);} catch(Exception ignore){} 
				                    driver.findElement(By.xpath("//*[@text='9']")).click();
				                    try{Thread.sleep(5000);} catch(Exception ignore){} 
				                    driver.findElement(By.xpath("//*[@id='button1']")).click();
				                    try{Thread.sleep(5000);} catch(Exception ignore){} 
			                     	driver.findElement(By.xpath("//*[@bounds='[933,87][1065,189]']")).click();
			                     	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='a']")));
			           
		                  }catch (Exception e) {
		                      e.getMessage();
		                      System.out.println("error" + e);
		                     
		       }
		                  }

	}

