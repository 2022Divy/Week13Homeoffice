package com.parabank.testsuite;

import com.parabank.pages.Register;
import com.parabank.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginTest extends TestBase {

    Register loginPage = new Register();

    com.parabank.pages.LoginTest loginTest = new com.parabank.pages.LoginTest();

    @Test
    public void loginform() {
        loginTest.loginform();
    }


}
