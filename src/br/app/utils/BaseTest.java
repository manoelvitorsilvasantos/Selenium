/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils;

import static br.app.utils.Browser.getCurrentDriver;
import org.junit.Before;
import org.junit.Test;




/**
 *
 * @author mvictor
 */

public class BaseTest {

    @Before
    public void startTest() {
        getCurrentDriver();
    }

    public String  getCurrentUrl(){
        return  getCurrentDriver().getCurrentUrl();
    }
}