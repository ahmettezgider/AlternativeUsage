package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WindowType;
import pages.BaseTest;
import pages.OpenCart;
import pages.OrangeHRM;
import utils.Utils;

public class Stepdefs extends BaseTest {

    @Given("user on Opencart homepage named as {string}")
    public void userOnOpencartHomepage(String winName) {
        open(OpenCart.url);
        System.setProperty(winName, getWindowHandler());
    }

    @Given("user opens Opencart homepage in new TAB named as {string}")
    public void userOpensOpencartHomepageInNewTab(String winName) {
        driver.switchTo().newWindow(WindowType.TAB).get(OpenCart.url);
        System.setProperty(winName, getWindowHandler());
    }

    @Given("user on OrangeHRM homepage named as {string}")
    public void userOnOrangeHRMHomepage(String winName) {
        open(OrangeHRM.url);
        System.setProperty(winName, getWindowHandler());
    }

    @Given("user opens OrangeHRM homepage in new TAB named as {string}")
    public void userOpensOrangeHRMHomepageInNewTab(String winName) {
        driver.switchTo().newWindow(WindowType.TAB).get(OrangeHRM.url);
        System.setProperty(winName, getWindowHandler());
    }

    @And("opencart, user clicks link {string}")
    public void opencartUserClicks(String text) {
        click(OpenCart.getLocator(OpenCart.Type.LINK,text));
    }

    @And("orangehrm, user clicks link {string}")
    public void orangehrmUserClicks(String text) {
        click(OrangeHRM.getLocator(OrangeHRM.Type.LINK, text));
    }
    
    @And("opencart, user sendkeys {string} to control {string}")
    public void opencartUserSendkeysToControl(String text, String locatorText) {
        sendkey(OpenCart.getLocator(OpenCart.Type.INPUT, locatorText), text);
    }

    @And("opencart, user clicks button {string}")
    public void opencartUserClicksButton(String buttonText) {
        click(OpenCart.getLocator(OpenCart.Type.BUTTON, buttonText));
    }

    @Then("opencart, the link {string} should be present")
    public void opencartTheLinkShouldBePresent(String linkText) {
        waitForPresence(OpenCart.getLocator(OpenCart.Type.LINK, linkText));
    }


    @And("orangehrm, user sendkeys {string} to control {string}")
    public void orangehrmUserSendkeysToControl(String text, String locatorText) {
        sendkey(OrangeHRM.getLocator(OrangeHRM.Type.INPUT, locatorText), text);
    }

    @And("orangehrm, user clicks button {string}")
    public void orangehrmUserClicksButton(String buttonText) {
        click(OrangeHRM.getLocator(OrangeHRM.Type.BUTTON, buttonText));
    }

    @Then("orangehrm, the link {string} should be present")
    public void orangehrmTheLinkShouldBePresent(String linkText) {
        waitForPresence(OrangeHRM.getLocator(OrangeHRM.Type.LINK, linkText));
    }

    @Then("user switch to window {string}")
    public void userSwitchToWindow(String winHandler) {
        driver.switchTo().window(System.getProperty(winHandler));
    }

    @And("wait {int} milis")
    public void waitMilis(int milis) {
        Utils.sleep(milis);
    }
}
