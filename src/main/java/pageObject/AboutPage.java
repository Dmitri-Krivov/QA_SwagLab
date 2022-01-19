package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage{

//    Elements
    By firstName = By.cssSelector("[id = 'firstname']");
    By lastName = By.cssSelector("[id = 'lastname']");
    By emailTextField = By.cssSelector("[name = 'email']");
    By firstNameError = By.cssSelector("[id = 'firstname-error']");
    By lastNameError = By.cssSelector("[id = 'lastname-error']");
    By emailError = By.cssSelector("[id = 'email-error']");
    By nextButton = By.cssSelector("#next");

    public AboutPage(WebDriver driver) {
        super(driver);
    }

//    Methods
    public void fillForm(String firstname, String lastname, String email){
        fillText(driver.findElement(firstName), firstname);
        fillLastName(lastname);
        fillEmail(email);
        clickNext();
    }


    public void fillFirstName(String text){
        fillText(driver.findElement(firstName), text);
    }

    public String getFirstNameError(){
        return getElementText(driver.findElement(firstNameError));
    }

    public void fillLastName(String text){
        fillText(driver.findElement(lastName), text);
    }

    public String getLastNameError(){
        return getElementText(driver.findElement(lastNameError));
    }

    public void fillEmail(String text){
        fillText(driver.findElement(emailTextField), text);
    }

    public String getEmailError(){
        return getElementText(driver.findElement(emailError));
    }

    public void clickNext(){
        clickElement(driver.findElement(nextButton));
    }

}
