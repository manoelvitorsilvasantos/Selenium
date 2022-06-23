/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils.pageobjects;

import br.app.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author mvictor
 */
public class LoginPage {
    
    
    @FindBy(id = "email")
    public WebElement usuario;

    @FindBy(id = "passwd")
    public WebElement senha;

    @FindBy(name = "SubmitLogin")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    public WebElement lostPasswordBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
    public WebElement errorLabel;
    
    
    //@FindBy(xpath = "html body#authentication.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6 form#login_form.box div.form_content.clearfix p.lost_password.form-group a");
    //public WebElement linkRecovery;
    
    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    
    public void setOnClickBtnLogin(){
        submitBtn.click();
    }

    public void fillEmail(String email) {
       this.usuario.sendKeys(email);
    }

    public void fillpassword(String passwd) {
        senha.sendKeys(passwd);
    }

  
    
}
