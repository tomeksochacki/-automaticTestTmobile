package pl.tmobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class TMobileMainPage extends AbstractPage {
    //@FindBy(xpath = "//*[@id=\"navbar-top\"]/div/div[2]/ul[1]/li[1]/button/span[1]")
    //@FindBy(partialLinkText = "menu-dropdown-item-arrow noFocus" )
    //@FindBy(className = "menu-dropdown-item-arrow noFocus" )
    //@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[1]/nav/div/div[2]/ul[1]/li[1]/button/span[2]") //tu test przechodzi, ale nie widać żeby klikał
    //@FindBy(partialLinkText = "noFocus")
    //@FindBy(css = "span[class=noFocus]")
    //"//input[@id='email']"
    //@FindBy(xpath = "//span[@class='Urządzenia']")
    //@FindBy(xpath = ".//div[@class='menu-collapse pb-xs-only-64']//span[contains(@class, 'noFocus')]")
    //@FindBy(xpath = ".//div[@class='navBar']//a[contains(@class, 'change slide')]") PRZYKLAD OD LUKASZA
    //@FindBy(className = "button button--block button--block-primary noFocus")

    @FindBy(xpath = "//div[@class='container-fluid main-menu-component bg-base-primary-90 b2c-theme'")
    WebElement mainContainer;

    @FindBy(xpath = ".//div[@class='container']//span[contains(@class, 'noFocus')]")

    WebElement devices;

    public TMobileMainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(mainContainer), this);
    }

    public void clickSubMenu(){
        devices.click();
    }
}
