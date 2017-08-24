package com.cdcsqa.jt.pageobject.kittenui;

import com.cdcsqa.jt.event.EventAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class KittenMenuScreenTest {

    private AndroidDriver driver;

    private KittenMenuScreen cs;

    private final String PLATFORM_ANDROID = "Android";
    private final String PLATFORM_IOS = "iOS";

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext context) {
        String appiumUrl = context.getCurrentXmlTest().getParameter("appium.url");
        String deviceName = context.getCurrentXmlTest().getParameter("appium.deviceName");
        String platform = context.getCurrentXmlTest().getParameter("appium.platform");
        String platformVersion = context.getCurrentXmlTest().getParameter("appium.platformVersion");
        String appPackage = context.getCurrentXmlTest().getParameter("appium.appPackage");
        String appActivity = context.getCurrentXmlTest().getParameter("appium.appActivity");

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Vanilla4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);

        try {
            if(platform.equals(PLATFORM_ANDROID)) {
                driver = new AndroidDriver(new URL(appiumUrl), capabilities);
                cs = new KittenMenuScreen(driver);
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
        evt.click(cs.getSocialMenu());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.quit();
    }


}
