package com.cdcsqa.jt.pageobject.kittenui;

import com.cdcsqa.jt.pageobject.BasePageObjectScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import lombok.Data;

@Data
public class KittenMenuScreenAndroid extends BasePageObjectScreen implements IKittenMenuScreen<KittenMenuScreenAndroid> {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='1']/android.view.View[@index='0']/android.view.View[@index='1']")
    @iOSFindBy
    private MobileElement socialMenu;

    public KittenMenuScreenAndroid(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getSocialMenu() {
        return socialMenu;
    }

    public void setSocialMenu(MobileElement socialMenu) {
        this.socialMenu = socialMenu;
    }

    @Override
    public KittenMenuScreenAndroid clickSocialMenu() {
        socialMenu.click();
        return this;
    }
}
