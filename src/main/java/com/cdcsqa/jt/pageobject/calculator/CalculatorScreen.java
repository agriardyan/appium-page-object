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

    public AndroidElement getButton1() {
        return button1;
    }

    public void setButton1(AndroidElement button1) {
        this.button1 = button1;
    }

    public AndroidElement getButton2() {
        return button2;
    }

    public void setButton2(AndroidElement button2) {
        this.button2 = button2;
    }

    public AndroidElement getButton3() {
        return button3;
    }

    public void setButton3(AndroidElement button3) {
        this.button3 = button3;
    }

    public AndroidElement getButton4() {
        return button4;
    }

    public void setButton4(AndroidElement button4) {
        this.button4 = button4;
    }

    public AndroidElement getButton5() {
        return button5;
    }

    public void setButton5(AndroidElement button5) {
        this.button5 = button5;
    }

    public AndroidElement getButton6() {
        return button6;
    }

    public void setButton6(AndroidElement button6) {
        this.button6 = button6;
    }

    public AndroidElement getButton7() {
        return button7;
    }

    public void setButton7(AndroidElement button7) {
        this.button7 = button7;
    }

    public AndroidElement getButton8() {
        return button8;
    }

    public void setButton8(AndroidElement button8) {
        this.button8 = button8;
    }

    public AndroidElement getButton9() {
        return button9;
    }

    public void setButton9(AndroidElement button9) {
        this.button9 = button9;
    }

    public AndroidElement getButton0() {
        return button0;
    }

    public void setButton0(AndroidElement button0) {
        this.button0 = button0;
    }

    public AndroidElement getButtonPlus() {
        return buttonPlus;
    }

    public void setButtonPlus(AndroidElement buttonPlus) {
        this.buttonPlus = buttonPlus;
    }

    public AndroidElement getButtonEqual() {
        return buttonEqual;
    }

    public void setButtonEqual(AndroidElement buttonEqual) {
        this.buttonEqual = buttonEqual;
    }
}
