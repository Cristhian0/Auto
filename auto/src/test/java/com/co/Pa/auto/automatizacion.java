package com.co.Pa.auto;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import java.awt.Dimension;
import java.io.File;
import java.text.DateFormat;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class automatizacion {
		
	                  public static AppiumDriver<MobileElement> driver;
	                  Dimension size;
	                  String destDir;
	                  DateFormat dateFormat;
	                 
	                  @Before
	                            public void setUpAppium() throws MalformedURLException, InterruptedException{
	                      String packagename = "com.nequi.MobileApp";
	                      String URL="http://localhost:4724/wd/hub";
	                      String activityname = "com.nequi.MobileApp.MobileApp";
	                      DesiredCapabilities capabilities = new DesiredCapabilities();
	                                          capabilities.setCapability("deviceName", "Moto");
	                                          capabilities.setCapability("udid", "172.31.17.227:5678");//"ZY22442LBS");
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
	                            public void EnviarPayPat() throws InterruptedException {
	                            	
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
	                            	 driver.findElement(By.xpath("//*[@text='+']")).click();
	                            	 driver.findElement(By.xpath("//*[@text='PayPal' and @index='2']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Envía plata']")).click();
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Aceptar ']")).click();
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @index='0']")).sendKeys("1");
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='¿En qué vas a usar esa plata?']")).click();
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@class='android.view.View' and @index='0']")).click();
	                            	 driver.swipe(528, 1189, 610, 637, 636);
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Envía']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text=' Disponible Disponible $654.094,67']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Confirmar' and @index='0']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='a']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='a']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 
	                            	
                                }catch (Exception e) {
                                    e.getMessage();
                                    System.out.println("error" + e);
                                }
                     }
                    
	                            	 
	                            	 
	                            	 
//	                  @Test
//	     	          public void RecibirPayPal() throws InterruptedException {
//	     	        Thread.sleep(1000);
//	     	        String celular = "3999948210";
//	                            		 
//	                            		 
//	                            		 
//// recibe PAYPA
//	                            	 driver.findElement(By.xpath("//*[@text='+']")).click();
//	                            	 driver.findElement(By.xpath("//*[@text='PayPal']")).click();
//	                            	 try{Thread.sleep(9000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='De tu cuenta PayPal a Nequi' and @index='2']")).click();;
//	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='Aceptar ']")).click();
//	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @index='0']")).sendKeys("1");
//	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='¿En qué vas a usar esa plata?']")).click();
//	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@class='android.view.View' and @index='0']")).click();
//	                            	 driver.swipe(528, 1189, 610, 637, 636);
//	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='Recibe' and @index='4']")).click();
//	                            	 try{Thread.sleep(10000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='a' and @index='0']")).click();
//	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
//	                            	 driver.findElement(By.xpath("//*[@text='a' and @index='0']")).click();
//	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
//	                            	
//	                            	 
//	                            	 
//	                                          try {
//	                                                        //escribe la clave
//	                                                        Thread.sleep(1000);
//	                                                    
//	                                                       
//	                                                        driver.tap(1, 353,1079, 1000);  //0
//	                                                        driver.tap(1, 356,962, 1000);   //8
//	                                                        driver.tap(1, 364,745, 1000);   //2
//	                                                        driver.tap(1, 353,1079, 1000);  //0
//	                                                       
//	                                                       }catch (Exception e) {
//	                                                                       e.getMessage();
//	                                                                       System.out.println("error" + e);
//	                                                                      
//	                                                        }
//	                               } 
	                               
	                       
	                            public boolean takeScreenshot(final String name) {
	                                String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	                                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	                                return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	                            }
	                            
	                            
	}