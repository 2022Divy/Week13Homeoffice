package com.HomeOffice.testsuite;

import com.HomeOffice.pages.Register;
import com.HomeOffice.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginTest extends TestBase {

    Register loginPage = new Register();

    com.HomeOffice.pages.LoginTest loginTest = new com.HomeOffice.pages.LoginTest();

    @Test
    public void loginform() {
        loginTest.loginform();
    }


}
