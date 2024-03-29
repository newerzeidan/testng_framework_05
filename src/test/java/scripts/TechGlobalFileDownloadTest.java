package scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFileDownloadPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.Waiter;

public class TechGlobalFileDownloadTest extends TechGlobalBase{
    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalFileDownloadPage = new TechGlobalFileDownloadPage();
        techGlobalFrontendTestingHomePage.getFrontEndTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("File Download");
    }

    /*
    FILE DOWNLOAD
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "File Download" card
    Click on the "TechGlobal School.pptx" file
    MANUALLY TEST that the file is downloaded in your Downloads file
     */
    @Test(priority = 1, description = "Validate file download")
    public void validateFileDownload(){
        Waiter.pause(3);
        techGlobalFileDownloadPage.downloadLink.click();
    }
}