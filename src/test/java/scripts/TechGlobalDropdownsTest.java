package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalDropdownsPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.DropdownHandler;
import utilities.Waiter;

public class TechGlobalDropdownsTest extends TechGlobalBase{

    @BeforeMethod
    public void setPages(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalDropdownsPage = new TechGlobalDropdownsPage();

        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Dropdowns");
    }

    @Test(priority = 1, description = "Select delivery option")
    public void selectDeliveryOption(){
        DropdownHandler.clickOnDropdownOption(techGlobalDropdownsPage.deliveryDropdown,
                techGlobalDropdownsPage.deliveryDropdownOptions, "Delivery");
    }

    @Test(priority = 2, description = "Select iPhone 14 Pro Max Option")
    public void selectProductOption(){
        DropdownHandler.selectByVisibleText(techGlobalDropdownsPage.productDropdown, "iPhone 14 Pro Max");
    }

    @Test(priority = 3, description = "Select Yellow Option")
    public void selectColorOption(){
        DropdownHandler.selectByIndex(techGlobalDropdownsPage.colorDropdown, 1);
    }

    /*
    Go to TechGlobal Training app
    Select Frontend Testing from Practices Dropdown
    Select Dropdowns card
    Select "MacBook Pro 13" option from product dropdown
    Select "Silver" option from the color dropdown
    Select "Delivery" option from delivery dropdown
    Click on SUBMIT button
    Validate "Your Silver MacBook Pro 13 will be delivered to you." message
     */

    @Test(priority = 4, description = "Validate the selected item message")
    public void validateTheItemsSelected(){
        DropdownHandler.selectByIndex(techGlobalDropdownsPage.productDropdown, 3);
        DropdownHandler.selectByVisibleText(techGlobalDropdownsPage.colorDropdown, "Silver");
        DropdownHandler.clickOnDropdownOption(techGlobalDropdownsPage.deliveryDropdown,
                techGlobalDropdownsPage.deliveryDropdownOptions, "Delivery");
        techGlobalDropdownsPage.submitButton.click();
        Assert.assertEquals(techGlobalDropdownsPage.resultMessage.getText(), "Your Silver MacBook Pro 13 will be delivered to you.");

        Waiter.pause(5);
    }
}