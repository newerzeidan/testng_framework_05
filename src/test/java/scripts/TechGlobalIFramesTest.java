package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalIFramesPage;
import utilities.Waiter;

public class TechGlobalIFramesTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalIFramesPage = new TechGlobalIFramesPage();
        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("IFrames");
    }

    /*
    TEST 1
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "IFrames" card
    Validate the "Please fill out your information below" text
     */
    @Test(priority = 1, description = "Validating input header text")
    public void validateInputText(){
        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);
        Assert.assertTrue(techGlobalIFramesPage.inputHeader.isDisplayed());
        Assert.assertEquals(techGlobalIFramesPage.inputHeader.getText(), "Please fill out your information below");
        Waiter.pause(3);
    }

    /*
    TEST 2
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "IFrames" card
    Enter "John" to first name input box
    Enter "Doe" to last name input box
    Click on "SUBMIT" button
    Validate the result equals "You entered: John Doe"
     */
    @Test(priority = 2, description = "Enter user input and validate the result")
    public void userInput(){
        driver.switchTo().frame(techGlobalIFramesPage.iFrameId); //puts you in the iFrame
        techGlobalIFramesPage.firstNameInput.sendKeys("John");
        techGlobalIFramesPage.lastNameInput.sendKeys("Doe");
        techGlobalIFramesPage.submitButton.click();
        driver.switchTo().defaultContent(); //takes you back to the parent frame
        Assert.assertEquals(techGlobalIFramesPage.resultText.getText(), "You entered: John Doe");

        /* Utilizing Loop Way (Check IFramesPage)
        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);
        String[] credentials = {"John", "Doe"};
        for (int i = 0; i < credentials.length; i++) {
            techGlobalIFramesPage.inputFields.get(i).sendKeys(credentials[i]);
        }
        techGlobalIFramesPage.submitButton.click();
        driver.switchTo().defaultContent();
        Assert.assertEquals(techGlobalIFramesPage.resultText.getText(), "You entered: " + credentials[0] + " " + credentials[1]);
         */
    }
}