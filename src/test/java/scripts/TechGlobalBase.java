package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class TechGlobalBase {
    SoftAssert softAssert;
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalDynamicElementsPage techGlobalDynamicElementsPage;
    TechGlobalWaitsPage techGlobalWaitsPage;
    TechGlobalRadioButtonsPage techGlobalRadioButtonsPage;
    TechGlobalCheckBoxPage techGlobalCheckBoxPage;
    TechGlobalDropdownsPage techGlobalDropdownsPage;
    TechGlobalMultipleWindowsPage techGlobalMultipleWindowsPage;
    TechGlobalAlertsPage techGlobalAlertsPage;
    TechGlobalDynamicTablesPage techGlobalDynamicTablesPage;
    TechGlobalIFramesPage techGlobalIFramesPage;
    TechGlobalFileUploadPage techGlobalFileUploadPage;
    TechGlobalFileDownloadPage techGlobalFileDownloadPage;
    TechGlobalStaticTablesPage techGlobalStaticTablesPage;
    TechGlobalSortableTablesPage techGlobalSortableTablesPage;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        softAssert = new SoftAssert();
        driver.get(ConfigReader.getProperty("appURL"));

        techGlobalBasePage = new TechGlobalBasePage();
    }

    @AfterMethod
    public void teardown(){
        //We will quit driver and do all clean-ups
        softAssert.assertAll();
        Driver.quitDriver();
    }
}