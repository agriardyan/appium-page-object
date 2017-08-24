/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.event;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

/**
 *
 * @author Agustinus_A7234
 */
public class EventAppium {

    public EventAppium click(MobileElement elem) {
        elem.click();
        return this;
    }
    
    public void pinch(MobileElement elem) {
        elem.pinch();
    }
    
    public void swipe(MobileElement elem, SwipeElementDirection direction, int duration) {
        elem.swipe(direction, duration);
    }
    
    public void swipe(MobileElement elem, SwipeElementDirection direction, int offsetFromStartBorder, int offsetFromEndBorder, int duration) {
        elem.swipe(direction, offsetFromStartBorder, offsetFromEndBorder, duration);
    }
    
}
