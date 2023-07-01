package com.HomeOffice.testsuite;

import com.HomeOffice.pages.HomePage;
import com.HomeOffice.pages.Register;
import com.HomeOffice.propertyreader.PropertyReader;
import com.HomeOffice.utility.Utility;
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
