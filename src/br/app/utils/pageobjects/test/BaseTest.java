/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils.pageobjects.test;

import static br.app.utils.Browser.getCurrentDriver;
import static br.app.utils.Browser.close;
import org.junit.After;
import org.junit.Before;

/**
 *
 * @author mvictor
 */
class BaseTest{
    
   @Before
    public void startTest(){
        getCurrentDriver();
    } 
    
    @After
    public void finishTest(){ close();}
    
    public String getCurrentUrl(){return getCurrentDriver().getCurrentUrl();}
    
}
