package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalCheckBoxPage;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalCheckBoxTest extends TechGlobalBase {
    /*
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "Checkboxes" card
    Validate "Apple" and "Microsoft" checkboxes are displayed, enabled and not selected
    Select both and validate they are both selected
    Deselect both and validate they are deselected
     */

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalCheckBoxPage = new TechGlobalCheckBoxPage();
    }

    @Test(priority = 1, description = "Validate checkboxes")
    public void validateCheckboxes(){

        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isDisplayed());
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isEnabled());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel.get(i).click();
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel.get(i).click();
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput.get(i).isSelected());
        }
    }

    @Test(priority = 2, description = "Validate checkboxes of second group")
    public void validateCheckboxes2(){

        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput2.size(); i++) {
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput2.get(i).isDisplayed());
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput2.get(i).isSelected());
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput2.get(i).isEnabled());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput2.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel2.get(i).click();
            Assert.assertTrue(techGlobalCheckBoxPage.checkboxInput2.get(i).isSelected());
        }

        for (int i = 0; i < techGlobalCheckBoxPage.checkboxInput2.size(); i++) {
            techGlobalCheckBoxPage.checkboxLabel2.get(i).click();
            Assert.assertFalse(techGlobalCheckBoxPage.checkboxInput2.get(i).isSelected());
        }
    }
}