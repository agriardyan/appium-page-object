package com.cdcsqa.jt.pageobject.kittenui;

import com.cdcsqa.jt.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class KittenMenuScreenAndroidTest extends BaseTest {

    private AppiumDriver driver;

    private IKittenMenuScreen cs;

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext context) {

        DesiredCapabilities capabilities = init(context);

        try {
            if(platform.equals(PLATFORM_ANDROID)) {
                driver = new AndroidDriver(new URL(appiumUrl), capabilities);
                cs = new KittenMenuScreenAndroid(driver);
            } else {
                // TODO create handler for other platform
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test(description = "clicking Social menu")
    public void clickSocialMenu() {
        cs.clickSocialMenu();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.quit();
    }


}
