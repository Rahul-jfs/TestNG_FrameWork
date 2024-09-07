package com.automation.tests;

import com.automation.listeners.ExtentReportListener;
import com.automation.utils.ConfigReader;
import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        loginPage.openWebsite();
        loginPage.enterUsernameAndPassword(ConfigReader.getConfigValue("username"), ConfigReader.getConfigValue("password"));
        loginPage.clickLoginBtn();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        ExtentReportManager.attachScreenshot();
        ExtentReportManager.getTest().pass("Home Page displayed");
    }

}
