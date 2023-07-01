package com.HomeOffice.pages;

import com.HomeOffice.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class startPage extends Utility {
    By startNowButton = By.xpath("//section[@class='govuk-!-margin-bottom-6']/a");

    By nextStepButton = By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");

    By resultMessage = By.xpath("//span[contains(text(),'Check if you need a UK visa')]");
    By reasonForVisitList = By.xpath("//input[@id='response-0']");
    By nextStepButton1 = By.xpath("//div[@id='current-question']/button");
    By result = By.xpath("//h2[contains(text(),'You will not need a visa to come to the UK')]");
    By moreThanSixMonths = By.xpath("//div[@class='govuk-!-margin-bottom-6 govuk-!-margin-top-8']/div/fieldset/div/div[2]/input");
    By nextStepButton2 = By.xpath("//div[@id='current-question']/button");
    By planningToWork = By.xpath("//input[@id='response-0']");
    By nextStepButton3 = By.xpath("//div[@id='current-question']/button");
    By result1 = By.xpath("//h2[contains(text(),'You need a visa to work in health and care')]");
    public void clickStartNow(){
        clickOnElement(startNowButton);
    }
    public void selectNationality(String nationality){
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='response']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText(nationality);
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
    public String getResultMessage(){
      return getTextFromElement(resultMessage);
    }
    public void selectReasonForVisit(String reason){
        clickOnElement(reasonForVisitList);

    }
    public void clickNextStepButton1(){
        clickOnElement(nextStepButton1);
    }
    public String resultMessage(){
        return getTextFromElement(result);
    }
    public void selectLengthOfStay(String moreOrLess){
        clickOnElement(moreThanSixMonths);
    }
    public void clickNextStepButton2(){
        clickOnElement(nextStepButton2);
    }
    public void selectPlanningToWork(String field){
        clickOnElement(planningToWork);
    }
    public void clickNextStepButton3(){
        clickOnElement(nextStepButton3);
    }
    public String ResultMessage1(){
        return getTextFromElement(result1);
    }

    public void anAustralianCominToUKForTourism(){
        clickStartNow();
        selectNationality("Australia");
        clickNextStepButton();
        getResultMessage();
        selectReasonForVisit("Tourism or visiting family and friends");
        clickNextStepButton1();
        resultMessage();


    }
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        clickStartNow();
        selectNationality("Chile");
        clickNextStepButton();
        getResultMessage();
        selectReasonForVisit("Work, academic visit or business");
        clickNextStepButton1();
        selectLengthOfStay("longer than 6 months");
        clickNextStepButton2();
        selectPlanningToWork("Health and care professional");
        clickNextStepButton3();
        ResultMessage1();


    }
}
