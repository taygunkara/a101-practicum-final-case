package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Represents the base page.
 */
public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Finding element with expected conditions.
     */
    public WebElement findElement(By locator){
        waitUntilItemShowsUp(locator);
        return driver.findElement(locator);
    }
    /**
     * Clicking element with expected conditions.
     * Expected condision is elementToBeClickable.
     */
    public void clickElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        findElement(locator).click();
    }

    /**
     * Wait until item is shows up with expected condition.
     * Expected contidion is visibilityOfElementLocated.
     */
    public void waitUntilItemShowsUp(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Mouse movement to the desired locator location.
     */
    public void mouseMovement(By locator){
        Actions action = new Actions(driver);
        action.moveToElement(findElement(locator)).perform();
    }

    /**
     * Fetch the text contained within the element.
     */
    public String getText(By locator){
        waitUntilItemShowsUp(locator);
        return findElement(locator).getText();
    }

    /**
     * Sending a key to the locator location.
     */
    public void type(By locator, String text){
        findElement(locator).sendKeys(text);
    }

    /**
     * Checking that an element is either visible or present.
     */
    public Boolean isDisplayed(By locator){
        return findElement(locator).isDisplayed();
    }

}
