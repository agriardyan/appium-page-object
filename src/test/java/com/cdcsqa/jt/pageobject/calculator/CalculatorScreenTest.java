/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.pageobject.calculator;

import com.cdcsqa.jt.event.EventAppium;
import com.cdcsqa.jt.pageobject.calculator.CalculatorScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Agustinus_A7234
 */
public class CalculatorScreenTest {

    private AndroidDriver driver;

    private CalculatorScreen cs;

    private final String PLATFORM_ANDROID = "Android";
    private final String PLATFORM_IOS = "iOS";

    private final String APP_PACKAGE = "appPackage";
    private final String APP_ACTIVITY = "appActivity";

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext context) {
        String appiumUrl = context.getCurrentXmlTest().getParameter("appium.url");
        String deviceName = context.getCurrentXmlTest().getParameter("appium.deviceName");
        String platform = context.getCurrentXmlTest().getParameter("appium.platform");
        String platformVersion = context.getCurrentXmlTest().getParameter("appium.platformVersion");
        String appPackage = context.getCurrentXmlTest().getParameter("appium.appPackage");
        String appActivity = context.getCurrentXmlTest().getParameter("appium.appActivity");

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM, platform);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(APP_PACKAGE, appPackage);
        capabilities.setCapability(APP_ACTIVITY, appActivity);

        try {
            if(platform.equals(PLATFORM_ANDROID)) {
                driver = new AndroidDriver(new URL(appiumUrl), capabilities);
                cs = new CalculatorScreen(driver);
            } else {
              // TODO create handler for other platform
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sum() {
        EventAppium evt = new EventAppium();
        evt.click(cs.getButton1()).click(cs.getButtonPlus()).click(cs.getButton3());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.quit();
    }
    
}
