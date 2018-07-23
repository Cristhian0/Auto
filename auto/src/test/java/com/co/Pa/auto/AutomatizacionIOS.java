package com.co.Pa.auto;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

class AutomatizacionIOS {
	
	
	
    private static AppiumDriver<IOSElement> driver;

    private WebElement row;

    @Before
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../../../apps/UICatalog/build/release-iphonesimulator");
        File app = new File(appDir, "UICatalog.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "9.3");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4726/wd/hub"), capabilities);
    }
    
	@Test
	public static void main(String[] args) {


    //first view in UICatalog is a table
    IOSElement table = driver.findElementByClassName("UIATableView");
    assertNotNull(table);
    //is number of cells/rows inside table correct
    List<MobileElement> rows = table.findElementsByClassName("UIATableCell");
    assertEquals(18, rows.size());
    //is first one about buttons
    assertEquals("Action Sheets", rows.get(0).getAttribute("name"));
    //navigationBar is not inside table
    WebElement nav_bar = null;
    try {
        nav_bar = table.findElementByClassName("UIANavigationBar");
    } catch (NoSuchElementException e) {
        //expected
    }
    assertNull(nav_bar);
     
    driver.getPageSource();
    nav_bar = driver.findElementByClassName("UIANavigationBar");
    assertNotNull(nav_bar);
}
	}


//paypal

// driver.findElement(By.xpath("//*[@text='¿En qué vas a usar esa plata?']")).click();
//driver.findElement(By.xpath("//*[@text='']")).click();
//driver.findElement(By.xpath("//*[@text='Pago otros conceptos']")).click();
//driver.findElement(By.xpath("//*[@text='Pago viajes de negocios y/o gastos educativos']")).click();
//driver.findElement(By.xpath("//*[@text='Pago servicios de turismo']")).click();
//driver.findElement(By.xpath("//*[@text='Compro mercancía que no es importación']")).click();
//driver.findElement(By.xpath("//*[@text='Envía']")).click();