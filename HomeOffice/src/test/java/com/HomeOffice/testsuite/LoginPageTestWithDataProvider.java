package com.HomeOffice.testsuite;

import com.HomeOffice.pages.HomePage;
import com.HomeOffice.pages.Register;
import com.HomeOffice.testbase.TestBase;
//import resources.testdata.TestData;


public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    Register loginPage= new Register();



  //  @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    homePage.clickOnLoginLink();
    //loginPage.loginToApplication(username,password);

    }

}
