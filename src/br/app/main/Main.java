/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.main;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





/**
 *
 * @author mvictor
 */
public final class Main {
    
    
    private final WebDriver driver;
    private final String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    
    public Main(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        try{
            Thread.sleep(2000);
            setUsername("manoelvitorsilvasantos@gmail.com");
        }catch(InterruptedException ex){}
        try{
            Thread.sleep(2000);
            setPassword("vitor1234567890"); 
        }catch(InterruptedException ex){}
        try{
            Thread.sleep(2000);
            btnClickLogin();
        }catch(InterruptedException ex){}
        
        try{Thread.sleep(5000);}catch(InterruptedException ex){}
        this.driver.close();
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void setUsername(String username){
        //usernameCellphoneOrEmail
        WebElement usuario = driver.findElement(By.cssSelector("#email"));
        usuario.sendKeys(username);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void setPassword(String passwd){
        //password
        WebElement senha = driver.findElement(By.cssSelector("#passwd"));
        senha.sendKeys(passwd);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void btnClickLogin(){
        //button Entrar
        WebElement btnLogin = driver.findElement(By.cssSelector("#SubmitLogin"));
        btnLogin.click();
    }
    
    public static void main(String[] args){
        new Thread()
        {
            @Override
            public void run()
            {
                Main main;
                main = new Main();
            }
        }.start();
    }           
}
