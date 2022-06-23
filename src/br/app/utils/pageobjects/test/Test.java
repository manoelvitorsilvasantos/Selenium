/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.utils.pageobjects.test;


import br.app.utils.pageobjects.test.LoginTest;

/**
 *
 * @author mvictor
 */
public class Test {
    
    public Test()
    {
        LoginTest loginTest = new LoginTest();
        loginTest.realizarLogin();
    }
    
    public static void main(String[] args)
    {
        new Thread(){
            @Override
            public void run()
            {
                new Test();
            }
        }.start();
    }
}
