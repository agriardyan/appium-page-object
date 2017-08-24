/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.pageobject.calculator;

import com.cdcsqa.jt.pageobject.BasePageObjectScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.util.concurrent.TimeUnit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Builder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Agustinus_A7234
 */
@Data
@EqualsAndHashCode
public class CalculatorScreen extends BasePageObjectScreen {
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit1")
    private AndroidElement button1;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit2")
    private AndroidElement button2;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit3")
    private AndroidElement button3;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit4")
    private AndroidElement button4;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit5")
    private AndroidElement button5;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit6")
    private AndroidElement button6;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit7")
    private AndroidElement button7;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit8")
    private AndroidElement button8;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit9")
    private AndroidElement button9;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit0")
    private AndroidElement button0;
    
    @AndroidFindBy(id = "com.android.calculator2:id/plus")
    private AndroidElement buttonPlus;
    
    @AndroidFindBy(id = "com.android.calculator2:id/equal")
    private AndroidElement buttonEqual;

    public CalculatorScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }
    
}
