package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BasePage{

//    Elements
    @FindBy (css = "[id = 'firstname']")
    WebElement firstName;
    @FindBy (css = "[id = 'lastname']")
    WebElement lastName;
    @FindBy (css = "[id = 'email']")
    WebElement emailTextField;
    @FindBy (css = "[id = 'firstname-error']")
    WebElement firstNameError;
    @FindBy (css = "[id = 'lastname-error']")
    WebElement lastNameError;
    @FindBy (css = "[id = 'email-error']")
    WebElement emailError;
    @FindBy (css = "[id = 'next']")
    WebElement nextButton;

//    By firstName = By.cssSelector("[id = 'firstname']");
//    By lastName = By.cssSelector("[id = 'lastname']");
//    By emailTextField = By.cssSelector("[name = 'email']");
//    By firstNameError = By.cssSelector("[id = 'firstname-error']");
//    By lastNameError = By.cssSelector("[id = 'lastname-error']");
//    By emailError = By.cssSelector("[id = 'email-error']");
//    By nextButton = By.cssSelector("#next");




    public AboutPage(WebDriver driver) {
        super(driver);
    }

//    Methods
    public void fillForm(String firstname, String lastname, String email){
        fillText(firstName, firstname);
        fillLastName(lastname);
        fillEmail(email);
        clickNext();
    }


    public void fillFirstName(String text){
        fillText(firstName, text);
    }

    public String getFirstNameError(){
        return getElementText(firstNameError);
    }

    public void fillLastName(String text){
        fillText(lastName, text);
    }

    public String getLastNameError(){
        return getElementText(lastNameError);
    }

    public void fillEmail(String text){
        fillText(emailTextField, text);
    }

    public String getEmailError(){
        return getElementText(emailError);
    }

    public void clickNext(){
        clickElement(nextButton);
    }

}
