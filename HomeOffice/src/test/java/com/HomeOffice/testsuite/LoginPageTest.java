package com.parabank.testsuite;

import com.parabank.pages.Register;
import com.parabank.pages.LoginTest;
import com.parabank.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {

    //HomePage homePage = new HomePage();
    Register loginPage = new Register();

    LoginTest loginTest = new LoginTest();

    @Test
    public void regform1() {
        loginPage.registerform();
    }


}
