package com.cdcsqa.jt;

import com.cdcsqa.jt.pageobject.calculator.CalculatorScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        System.out.println( "Hello World!" );
        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Vanilla4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        System.out.println("Success");
        
        CalculatorScreen cs = new CalculatorScreen(driver);

//        click(cs.getButton2());
//        click(cs.getButton1());

//        cs.clickButton1();
//        cs.clickButton2();
//        cs.clickPlus();
//        cs.clickButton2();
//        cs.clickEqual();
        
        System.out.println("OKEE");
        
    }
}
