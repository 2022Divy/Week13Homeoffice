package com.parabank.testsuite;

import com.parabank.pages.HomePage;
import com.parabank.pages.Register;
import com.parabank.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    Register loginPage= new Register();



    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    homePage.clickOnLoginLink();
    //loginPage.loginToApplication(username,password);

    }

}
