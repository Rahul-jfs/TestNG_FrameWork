package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        loginPage.openWebsite();
        loginPage.enterUsernameAndPassword(ConfigReader.getConfigValue("username"), ConfigReader.getConfigValue("password"));
        loginPage.clickLoginBtn();
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

}
