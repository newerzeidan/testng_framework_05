package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalFrontendTestingHomeTest extends TechGlobalBase{
    /*
    TEST TASK
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown
    Click on "Frontend Testing" option
    Validate below cards are displayed and their text is as below
        Locators
        Xpath-CSS Locators
        Dynamic Elements
        Waits
        Dropdowns
        Radio Buttons
        Checkboxes
        Alerts
        IFrames
        Multiple Windows
        Static Tables
        Dynamic Tables
        File Upload
        File Download
        Actions
        Login Form
        Forgot Password
        Sortable Tables
        Pagination
        Calendar
     */

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
    }

    @Test(priority = 1, description = "Validate Frontend Testing cards")
    public void validateFrontendTestingCards(){
        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();

        String[] cardTexts = {"Locators",
                "Xpath-CSS Locators",
                "Dynamic Elements",
                "Waits",
                "Dropdowns",
                "Radio Buttons",
                "Checkboxes",
                "Alerts",
                "IFrames",
                "Multiple Windows",
                "Static Tables",
                "Dynamic Tables",
                "File Upload",
                "File Download",
                "Actions",
                "Login Form",
                "Forgot Password",
                "Sortable Tables",
                "Pagination",
                "Calendar"};

        for (int i = 0; i < 20; i++) {
            Assert.assertTrue(techGlobalFrontendTestingHomePage.cards.get(i).isDisplayed());
            Assert.assertEquals(techGlobalFrontendTestingHomePage.cards.get(i).getText(), cardTexts[i]);
        }
    }

    @Test(priority = 2, description = "Validate URL")
    public void validateFrontendTestingURL(){
        /*
        Go to "https://techglobal-training.netlify.app/"
        Click on "Practices" dropdown
        Click on "Frontend Testing" option
        Validate the URL contains "frontend"
         */

        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();

        Assert.assertTrue(driver.getCurrentUrl().contains("frontend"));
    }
}