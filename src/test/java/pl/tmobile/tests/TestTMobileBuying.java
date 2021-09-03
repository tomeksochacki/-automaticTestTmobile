package pl.tmobile.tests;

import org.junit.jupiter.api.Test;

public class TestTMobileBuying extends TestBase {

    @Test
    public void buyingAPhone() throws InterruptedException{
        tMobileMainPage.clickSubMenu();
        tMobilePopupPage.closePopup();
    }
}
