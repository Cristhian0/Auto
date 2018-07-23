
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

public class AppLaunche {
	

	 
	                  public static AppiumDriver<MobileElement> driver;
	                  Dimension size;
	                  String destDir;
	                  DateFormat dateFormat;
	                 
	                  @Before
	                            public void setUpAppium() throws MalformedURLException, InterruptedException{
	                      String packagename = "com.nequi.MobileApp";
	                      String URL="http://127.0.0.1:4723/wd/hub";
	                      String activityname = "com.nequi.MobileApp.MobileApp";
	                      DesiredCapabilities capabilities = new DesiredCapabilities();
//	                                          capabilities.setCapability("deviceName", "samsung");
//	                                          capabilities.setCapability("udid", "ZY22442LBS");
	                                          capabilities.setCapability("platformVersion", "22");
	                                          capabilities.setCapability("platformName", "Android");
	                                          capabilities.setCapability("appPackage", packagename);
	                                          capabilities.setCapability("appActivity", activityname);
	                                          capabilities.setCapability("noReset", true);
	                                          driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
	                                          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                              }
	             
	                            //@AfterTest
	                            // public void CleanUpAppium() {                       
	                            //          driver.quit();}
	                           
	                            @Test
	                            public void mytest() throws InterruptedException {
	                            	   Thread.sleep(1000);
		                                String celular = "3999948210";
		                     
		                            try {
		                            	
		                                MobileElement entrar = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[3]"));  
		                                entrar.tap(1, 100);
		                                                                                                                                                                                                                                                                                
		                                MobileElement numero = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]"));
		                                numero.sendKeys(celular);
		                                Thread.sleep(1000);
		                                entrar.tap(1, 100);
		                                new WebDriverWait(driver, 10);
	                            	 driver.findElement(By.xpath("//*[@text='399 994 8210' and @index='0']")).click();
	                            	 driver.findElement(By.xpath("//*[@text='Entra ']")).sendKeys("3999948210");
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
	                            	 driver.findElement(By.xpath("//*[@text='De Nequi a tu cuenta PayPal' and @index='2']")).click();
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Aceptar ']")).click();
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @index='0']")).sendKeys("1");
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@class='android.view.View' and @index='0']")).click();
	                            	 driver.swipe(528, 1189, 610, 637, 636);
	                            	 try{Thread.sleep(5000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Envía' and @index='4']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text=' Disponible Disponible $854.215,97']")).click();
	                            	 try{Thread.sleep(7000);} catch(Exception ignore){}
	                            	 driver.findElement(By.xpath("//*[@text='Confirmar' and @index='0']")).click();
	                                          try {
	                                         //solo sale de la aplicacion cuando se genera elcodigo mayor , recarga de paypal 
	                                                        //escribe la clave
	                                                        Thread.sleep(1000);
	                                                        //MobileElement cero = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[11]"));  
	                                                        //cero.tap(1,100);
	                                                        //MobileElement ocho = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[8]"));  
	                                                        //ocho.tap(1,100);
	                                                        //MobileElement dos = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]"));  
	                                                        //dos.tap(1,100)
	                                                        //cero.tap(1,100);
	                                                       
	                                                        driver.tap(1, 353,1079, 1000);  //0
	                                                        driver.tap(1, 356,962, 1000);   //8
	                                                        driver.tap(1, 364,745, 1000);   //2
	                                                        driver.tap(1, 353,1079, 1000);  //0
	                                                       
	                                                        //driver.tap(1,377,731,100);
	                                                       
	                                                        /*MobileElement mas = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
	                                                        mas.tap(1,100); */
	                                                       
	                           	                                                       
	                                                        driver.tap(1, 81, 1181, 11);
	                                                       
	                                                        //driver.tap(1,83,1183,1000);
	                                                        //Thread.sleep(1000);
	                                                       
	                                                       
	                                                        //hace la recarga
	                                                       
	                                                        //driver.tap(1,636,1194,100);
	                                                         
	                                                        //MobileElement recarga = (MobileElement) driver.findElement(By.xpath("  //android.view.View[@content-desc=\"Recarga\"]"));  
	                                                        //recarga.tap(1,100);
	                                                         
	                                         
	                                         
	                                                        }catch (Exception e) {
	                                                                       e.getMessage();
	                                                                       System.out.println("error" + e);
	                                                                      
	                                                        }
	                                         
	                           
	                               } catch (Exception e) {
	                           e.getMessage();
	                           System.out.println("error" + e);
	                               
	                               }  
	                            }
	                            
	                            public boolean takeScreenshot(final String name) {
	                                String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	                                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	                                return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	                            }
	                            
	                            
	}
	 
	 
	 
	 
	 
	 
	 
	 