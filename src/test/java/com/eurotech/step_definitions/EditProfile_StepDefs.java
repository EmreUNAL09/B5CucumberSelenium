package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.EditProfilePage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditProfile_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    EditProfilePage editProfilePage = new EditProfilePage();

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String module) {
        BrowserUtils.waitFor(1);
        dashboardPage.navigateToMenu(module);

    }

    @When("The user select status {string}")

    public void the_user_select_status(String type) {
        editProfilePage.selectMenu(type);

    }

    @When("The user add {string} {string}")
    public void the_user_add(String inputBoxName, String userInformation) {

        editProfilePage.addInfo(inputBoxName, userInformation);

    }

    @Then("The user click on the submit button")
    public void the_user_click_on_the_submit_button() {
        editProfilePage.submitBtn.click();

    }

    @And("The user slides the slider {int}")
    public void theUserSlidesTheSlider(int handleNum) {

        WebElement slider = Driver.get().findElement(By.xpath("//input[@type='range']"));

        for (int i = 0; i < 10; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i < handleNum; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }
}