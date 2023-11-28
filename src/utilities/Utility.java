package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    /**
     * method
     */
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    /**
     * The method will get text from element
     */
    public String getTextElement(By by){
        return driver.findElement(by).getText();

    }
    /**
     * This method will have actions on mouseHover
     */
    public void mouseHoverOnElements(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public void sendTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    public void selectByValueFromDropDown(By by, String value){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }

    //select By index from Dropdown
    public void selectByIndexFromDown(By by, int index){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
    }


    public void clearTextToElement(By by){
        driver.findElement(by).clear();

    }
    public void sendText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public void mouseHoverAndClick(By by) throws InterruptedException {
        WebElement desktops = driver.findElement(by);
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(desktops).click().build().perform();
    }
    public void verifyTwoTextMessage(int firstText, int secondText) {

        Assert.assertEquals(firstText, secondText);
    }
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }
    public void assertProduct(String expectedProduct, int index) {
        String expectedProduct1 = expectedProduct;
        String actualProduct1 = getTextElement(By.xpath("(//div[@class='product-thumb']//h4//a)[" + index + "]"));
        Assert.assertEquals(expectedProduct1, actualProduct1);
    }
    public void sendKeysToElement(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);

    }
    public void selectMyAccountOptions(String option) {
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='" + option + "']"));

    }


}

