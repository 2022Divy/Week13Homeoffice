package com.parabank.testsuite;

import com.parabank.pages.HomePage;
import com.parabank.pages.Register;
import com.parabank.propertyreader.PropertyReader;
import com.parabank.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTestWithParameterAndParallel extends Utility {

    HomePage homePage = new HomePage();
    Register loginPage = new Register();
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        selectBrowser(browser);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage(){

    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }


}
