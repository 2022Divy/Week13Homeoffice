package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;


public class Register extends Utility {

    By reglink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    By fname = By.xpath("//input[@id='customer.firstName']");
    By lname = By.xpath("//input[@id='customer.lastName']");
    By add = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipcode = By.xpath("//input[@id='customer.address.zipCode']");
    By pnumber = By.xpath("//input[@id='customer.phoneNumber']");
    By ssn = By.xpath("//input[@id='customer.ssn']");
    By uname = By.xpath("//input[@id='customer.username']");

    By pass = By.xpath("//input[@id='customer.password']");
    By cpass = By.xpath("//input[@id='repeatedPassword']");
    By regbutton = By.xpath("//input[@value='Register']");


    public void regclick() {
        clickOnElement(reglink);
    }

    public void enterfname(String fname1) {
        sendTextToElement(fname, fname1);
    }

    public void enterlname(String lname1) {
        sendTextToElement(lname, lname1);
    }

    public void enteradd(String add1) {
        sendTextToElement(add, add1);
    }

    public void entercity(String city1) {
        sendTextToElement(city, city1);
    }

    public void enterstate(String state1) {
        sendTextToElement(state, state1);
    }

    public void enterzip(String zipcode1) {
        sendTextToElement(zipcode, zipcode1);
    }

    public void enterpnumber(String pnumber1) {
        sendTextToElement(pnumber, pnumber1);
    }

    public void enterssn(String ssn1) {
        sendTextToElement(ssn, ssn1);
    }

    public void enteruname(String uname1) {
        sendTextToElement(uname, uname1);
    }

    public void enterpass(String pass1) {
        sendTextToElement(pass, pass1);
    }

    public void entercpass(String cpass1) {
        sendTextToElement(pass, cpass1);
    }


    public void registerform() {
        regclick();
        enterfname("Vidhi");
        enterlname("Patel");
        enteradd("56");
        entercity("London");
        enterstate("UK");
        enterzip("HA3 5QY");
        enterpnumber("0778677889");
        enterssn("SX6688788G");
        enteruname("Vidhip");
        enterpass("vidhi1234");
        entercpass("vidhi1234");
        clickOnElement(regbutton);


    }

}
