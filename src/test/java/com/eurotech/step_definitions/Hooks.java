package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {    // Bu class testNG deki TestBase ile aynı işlevde.

    @Before      //Her senaryodan önce çalışır.
    public void setup(){
        System.out.println("\tThis is coming from Before method");

    }
    @After    //Her senaryodan sonra çalışır.
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[]screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@db")    //Data base'den veri çekmek için kullanılır.
    public void setupDb(){
        System.out.println("\tConnecting DB");
    }

    @After("@db")
    public void ClosedDB(){
        System.out.println("\t Disconnecting DB");

    }



}
