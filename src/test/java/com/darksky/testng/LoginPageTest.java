package com.darksky.testng;


import com.darksky.base.BasePage;
import com.darksky.base.ConfigReader;
import com.darksky.pages.LoginPage;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.darksky.base.BasePage.driver;

public class LoginPageTest {

    @BeforeMethod
    public void setupBrowser() {

        BasePage.initializeDriver();
        LoginPage.enterLocation(ConfigReader.getProperty("location"));
        LoginPage.clickSearchBtn();

    }

    @Test(description = "This method checks if the highest and lowest temperature is displayed")
    public void verifyDisplayHighAndLowTempaerature(){
        Assert.assertTrue(LoginPage.verifyLowestTemp());
        Assert.assertTrue(LoginPage.verifyHighestTemp());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
