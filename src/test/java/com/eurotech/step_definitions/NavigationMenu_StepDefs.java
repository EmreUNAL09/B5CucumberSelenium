package com.eurotech.step_definitions;
import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class NavigationMenu_StepDefs {

    DashboardPage dashboardPage=new DashboardPage();

    @Then("The user should be able to sees welcome message")
    public void the_user_should_be_able_to_sees_welcome_message() {

        System.out.println("I verified that welcome text is here ");

    }
    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("user navigates to developers menu ");

    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {

        System.out.println("I verified that developer text is here ");

    }
    @Then("The user navigates to All Post menu")
    public void the_user_navigates_to_all_post_menu() {
        System.out.println("user navigates to All Post menu");
    }
    @Then("The user able to see Posts text")
    public void the_user_able_to_see_posts_text() {
        System.out.println("I verified that All Post text is here ");
    }

    @And("The user navigates to My Account menu")
    public void theUserNavigatesToMyAccountMenu() {
        System.out.println("user navigates to My Account menu");
    }

    @Then("The user able to see dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println("I see dashboatrd text");
    }

    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        dashboardPage.navigateToMenu(menuName);
    }

    @Then("The user should be able to see header as {string}")
    public void theUserShouldBeAbleToSeeHeaderAs(String headerName) {
        BrowserUtils.waitFor(1);
        String actualHeader=dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is display",headerName,actualHeader);
    }
}
