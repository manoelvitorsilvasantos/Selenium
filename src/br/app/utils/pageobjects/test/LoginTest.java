/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils.pageobjects.test;

import br.app.utils.pageobjects.HomePage;
import br.app.utils.pageobjects.LoginPage;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author mvictor
 */
public class LoginTest extends BaseTest{
    
    private LoginPage   loginpage= new LoginPage();
    private HomePage homepage= new HomePage();
    
    public LoginTest()
    {
        super();
    }
    
    
    @Test
    public void realizarLogin() {

        // Tela inicial

        homepage.signin();

        // Tela login

        loginpage.fillEmail("manoelvitorsilvasantos@gmail.com");

        loginpage.fillpassword("vitor1234567890"); ;

        loginpage.setOnClickBtnLogin();

        assertTrue(getCurrentUrl().contains( "/index.php?controller=my-account")); 
        
    }
    
   
}
