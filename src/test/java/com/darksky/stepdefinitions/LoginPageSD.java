package com.darksky.stepdefinitions;

import com.darksky.base.ConfigReader;
import com.darksky.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        String expectedTitle = "Dark Sky - 1 City Hall, New York, NY";
        Assert.assertEquals(expectedTitle, LoginPage.verifyTitle());
    }

    @When("I enter my location")
    public void iEnterMyLocation() {
        LoginPage.enterLocation(ConfigReader.getProperty("location"));
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        LoginPage.clickSearchBtn();
    }


    @Then("I see the lowest and highest temperature of my location")
    public void iSeeTheLowestAndHighestTemperatureOfMyLocation() {
        Assert.assertTrue(LoginPage.verifyLowestTemp());
        Assert.assertTrue(LoginPage.verifyHighestTemp());
    }
}
