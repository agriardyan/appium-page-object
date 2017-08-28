package com.cdcsqa.jt.pageobject.apidemo;

import com.cdcsqa.jt.pageobject.BasePageObjectScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;

import java.util.List;

public class ApiDemoHomeScreen extends BasePageObjectScreen implements IApiDemoHomeScreen<ApiDemoHomeScreen> {

    @AndroidFindBys({
            @AndroidFindBy(xpath = "//android.widget.ListView[@index='0']/android.widget.TextView")
    })
    @iOSFindBys({@iOSFindBy})
    private List<MobileElement> menuList;

    public ApiDemoHomeScreen(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public ApiDemoHomeScreen clickMenuItem(int index) {
        menuList.get(index).click();
        return this;
    }

    @Override
    public ApiDemoHomeScreen pressBackButton() {
        this.driver.navigate().back();
        return this;
    }


    public List<MobileElement> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MobileElement> menuList) {
        this.menuList = menuList;
    }

}
