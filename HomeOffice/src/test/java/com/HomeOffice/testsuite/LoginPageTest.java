package com.HomeOffice.testsuite;

import com.HomeOffice.pages.Register;
import com.HomeOffice.pages.startPage;
import com.HomeOffice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {

    //HomePage homePage = new HomePage();
    Register loginPage = new Register();

    LoginTest loginTest = new LoginTest();
    startPage start = new startPage();
    @BeforeMethod
    public void inIt(){
        start = new startPage();
    }

    //@Test
    //public void regform1() {
     //   loginPage.registerform();
    //}
    @Test
    public void anaus(){
    start.anAustralianCominToUKForTourism();
    }
    @Test
    public void aClile(){
        start.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths();
    }

}
