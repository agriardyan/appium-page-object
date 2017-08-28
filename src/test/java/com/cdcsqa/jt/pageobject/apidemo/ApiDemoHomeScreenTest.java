package com.cdcsqa.jt.pageobject.apidemo;

import com.cdcsqa.jt.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemoHomeScreenTest extends BaseTest {

    private AppiumDriver driver;
    private ApiDemoHomeScreen cs;

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext context) {

        DesiredCapabilities capabilities = init(context);

        try {
            if(platform.equals(PLATFORM_ANDROID)) {
                driver = new AndroidDriver(new URL(appiumUrl), capabilities);
                cs = new ApiDemoHomeScreen(driver);
            } else {
                // TODO create handler for other platform
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

//    @Test(description = "clicking Social menu")
//    public void sum() {
//        System.out.println("Size: " + cs.getMenuList().size());
//        for (MobileElement i : cs.getMenuList()) {
//            System.out.println("Id: " + i.getId() + " Text: " + i.getText());
//        }
//
//    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void clickMenuItem() {
        for (int i = 0; i < cs.getMenuList().size(); i++) {
            cs.clickMenuItem(i);
            cs.pressBackButton();
        }
    }

//    @Test
//    public void pressBackButton() {
//        return null;
//    }
}
