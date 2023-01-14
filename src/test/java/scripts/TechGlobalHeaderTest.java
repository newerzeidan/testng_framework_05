package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TechGlobalHeaderTest extends TechGlobalBase{

    @Test(priority = 1)
    public void validateTechGlobalHeaderDropdown(){
        Assert.assertTrue(techGlobalBasePage.headerDropdown.isDisplayed());
        Assert.assertEquals(techGlobalBasePage.headerDropdown.getText(), "Practices");
    }

    @Test(priority = 2)
    public void validateTechGlobalHeaderDropdownOptions(){
        /*
        Go to TechGlobal Training Website
        Click on "Practices" dropdown
        Validate options below are displayed and enabled and their text is as below:
            Frontend Testing
            Backend Testing
            Java Exercises
         */

        techGlobalBasePage.headerDropdown.click();

        String[] optionTexts = {"Frontend Testing", "Backend Testing", "Java Exercises"};

        for (int i = 0; i < techGlobalBasePage.headerDropdownOptions.size(); i++) {
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isDisplayed());
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isEnabled());
            Assert.assertEquals(techGlobalBasePage.headerDropdownOptions.get(i).getText(), optionTexts[i]);
        }
    }
}