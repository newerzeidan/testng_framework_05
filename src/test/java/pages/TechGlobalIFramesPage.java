package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalIFramesPage extends TechGlobalBasePage{

    public TechGlobalIFramesPage(){
        super();
    }

    @FindBy(css = "#name_form > p")
    public WebElement inputHeader;

    @FindBy(css = "#form_frame")
    public WebElement iFrameId;

    /* This would be used in the loop in IFramesTest
    @FindBy(css = ".input")
    public List<WebElement> inputFields;
     */

    @FindBy(css = "#first_name")
    public WebElement firstNameInput;

    @FindBy(css = "#last_name")
    public WebElement lastNameInput;

    @FindBy(css = "#submit")
    public WebElement submitButton;

    @FindBy(css = "#result")
    public WebElement resultText;
}