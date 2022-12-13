package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    @FindBy(xpath = "//input[@type='range']")
    public WebElement sliderBtn;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitBtn;


    public void selectMenu(String type){
        Select select=new Select(selectBox);
        select.selectByValue(type);

    }

    public void addInfo(String inputBoxName,String userInformation ){

        WebElement placeholder = Driver.get().findElement(By.name(inputBoxName));
        placeholder.clear();
        placeholder.sendKeys(userInformation);

    }
}
