package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.AboutPage;
import pageObject.AccountPage;
import pageObject.AddressPage;
import pageObject.Urls;

public class FillNewCustomerTest {
    public static void main(String[] args) {
        
//        Create Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Urls.BASE_URL);

//        About page
        AboutPage aboutPage = new AboutPage(driver);
        aboutPage.sleep(2000);
        aboutPage.clickNext();
        Assert.assertEquals(aboutPage.getFirstNameError(), "This field is required.", "Error message is incorrect");
        Assert.assertEquals(aboutPage.getLastNameError(), "This field is required.", "Error message is incorrect");
        Assert.assertEquals(aboutPage.getEmailError(), "This field is required.", "Error message is incorrect");

        aboutPage.fillForm("Alex", "Komanov", "null@rtyu.by");

//        AccountPage
        AccountPage accountPage = new AccountPage(driver);
        Assert.assertTrue(accountPage.accountPageIsDisplayed(), "Account page was not displayed");
        accountPage.clickIcons();
        accountPage.clickNext();

//AddressPage
        AddressPage addressPage = new AddressPage(driver);
        addressPage.fillFormAddress("Gaia", 15, "Minsk", "Italy");
        addressPage.clickFinish();
        addressPage.sleep(2000);
        addressPage.tearDown();
    }
    
    
}
