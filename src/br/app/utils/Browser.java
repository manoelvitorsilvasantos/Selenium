/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author mvictor
 */
public class Browser {
    
    private static Browser instance = null;
    private static WebDriver driver;
    
    private Browser(){}
    
    public static Browser getInstance(){
        if(instance == null)
        {
            instance = new Browser();
        }
        return instance;
    }
    
    
    
    
    public static WebDriver getCurrentDriver()
    {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);	
            driver.get("http://automationpractice.com/index.php");
        }
        return driver; 
    }
    
    
    public static void close(){
        getCurrentDriver().quit();
        driver = null;
    }
    
    
    
}
