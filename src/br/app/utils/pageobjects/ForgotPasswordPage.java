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


public class ForgotPasswordPage extends BaseActionElement {

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    public WebElement retrievePasswordBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    public WebElement messageLabel;

    public ForgotPasswordPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickRetrievePasswordBtn() {
        retrievePasswordBtn.click();
    }

    public void sendKeysToEmailInput(String value) {
        emailInput.sendKeys(value);
    }

    public boolean messageLabelHasMessage(String message) {
        return messageLabel.getText().contains(message);
    }
}