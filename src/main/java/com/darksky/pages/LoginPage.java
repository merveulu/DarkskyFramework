package com.darksky.pages;

import com.darksky.base.ConfigReader;
import com.darksky.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.darksky.base.BasePage.driver;

public class LoginPage {

    @FindBy(xpath="//span[@class='high-temp-text']")
    public static WebElement highTemp;

    @FindBy(xpath="//span[@class='low-temp-text']")
    public static WebElement lowTemp;

    @FindBy(xpath="//*[@id='searchForm']/input")
    public static WebElement locationBox;

    @FindBy(xpath = "//*[@id='searchForm']/a[2]")
    public static WebElement searchBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public static String verifyTitle(){
        return HelperMethods.doGetPageTitle();
    }

    public static void enterLocation(String location){
        HelperMethods.sendText(locationBox, location);

    }

    public static void clickSearchBtn(){
        HelperMethods.doClick(searchBtn);
    }

    public static Boolean verifyLowestTemp(){
        return HelperMethods.doIsDisplayed(lowTemp);
    }

    public static Boolean verifyHighestTemp(){
        return HelperMethods.doIsDisplayed(highTemp);
    }


}
