/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils;

/**
 *
 * @author mvictor
 */


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class BaseActionElement {

    public boolean isElementExisting(WebElement element){
        try {
            element.isDisplayed();
            return true;
        } catch ( NoSuchElementException e){
            return false;
        }
    }
}
