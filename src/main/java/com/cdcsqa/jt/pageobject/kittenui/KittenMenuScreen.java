package com.cdcsqa.jt.pageobject.kittenui;

import com.cdcsqa.jt.pageobject.BasePageObjectScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class KittenMenuScreen extends BasePageObjectScreen {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']")
    private AndroidElement socialMenu;

    public KittenMenuScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }
}
