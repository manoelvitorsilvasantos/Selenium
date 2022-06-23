/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils.pageobjects;

import br.app.utils.BaseActionElement;
import br.app.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author mvictor
 */
public class HomePage extends BaseActionElement{
    
    
    @FindBy(xpath = "//a[contains(text(),'Sign in') and @class=\"login\"]")
    public WebElement signin;

    @FindBy(id = "search_query_top")
    public WebElement search_query_top;

    @FindBy(name = "submit_search")
    public WebElement submit_search;

    public HomePage() {

         PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    public void clickmenuLogin() {

        signin.click();
    }

    public void signin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
