package pl.tmobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TMobilePopupPage extends AbstractPage {
    //@FindBy(className = "using-mouse")
    //@FindBy(xpath = "//a[@class='yourcx_close noFocus'")

    @FindBy(xpath = ".//div[@id='yourcx_layer']//a[contains(@class, 'yourcx_close noFocus')]")
    WebElement buttonClose;

    public TMobilePopupPage(WebDriver driver) {
        super(driver);
    }

    public void closePopup(){
        buttonClose.click();
    }
}
