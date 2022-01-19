package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePage{
    public AddressPage(WebDriver driver) {
        super(driver);
    }

//    Elements
    By streetName = By.cssSelector("[id='streetname']");
    By streetNumber = By.cssSelector("[id='streetnumber']");
    By city = By.cssSelector("[id='city']");
    By country = By.cssSelector("[name='country']");
    By finish = By.cssSelector("[id='finish']");

//    Methods
    public void fillFormAddress(String streetName, Integer streetnumber, String city, String countryOfLive){
        fillStreetName(streetName);
        fillStreetNumber(streetnumber);
        fillCity(city);
        selectCity(countryOfLive);
    }

    public void fillStreetName(String streetname){
        fillText(driver.findElement(streetName), streetname);
    }

    public void fillStreetNumber(Integer streetnumber){
        fillTextNum(driver.findElement(streetNumber), streetnumber);
    }

    public void fillCity(String cityOfLive){
        fillText(driver.findElement(city), cityOfLive);
    }

    public void selectCity(String countryOfLive){
        WebElement selectElement = driver.findElement(country);
        Select select = new Select(selectElement);
        select.selectByValue(countryOfLive);
    }

    public void clickFinish(){
        clickElement(driver.findElement(finish));
    }
}
