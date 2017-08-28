package com.cdcsqa.jt;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected final String PLATFORM_ANDROID = "Android";
    protected final String PLATFORM_IOS = "iOS";

    private final String APP_PACKAGE = "appPackage";
    private final String APP_ACTIVITY = "appActivity";

    protected String appiumUrl;
    protected String deviceName;
    protected String platform;
    protected String platformVersion;
    protected String appPackage;
    protected String appActivity;

    public DesiredCapabilities init(ITestContext context) {

        appiumUrl = context.getCurrentXmlTest().getParameter("appium.url");
        deviceName = context.getCurrentXmlTest().getParameter("appium.deviceName");
        platform = context.getCurrentXmlTest().getParameter("appium.platform");
        platformVersion = context.getCurrentXmlTest().getParameter("appium.platformVersion");
        appPackage = context.getCurrentXmlTest().getParameter("appium.appPackage");
        appActivity = context.getCurrentXmlTest().getParameter("appium.appActivity");

        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Vanilla4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");
        capabilities.setCapability(APP_PACKAGE, appPackage);
        capabilities.setCapability(APP_ACTIVITY, appActivity);

        return capabilities;

    }

}
