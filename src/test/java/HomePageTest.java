import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest{
    Setup baseTest= new Setup();
    JavascriptExecutor js;
    @Test(priority = 1)
    public void verifyThatCloseCookiesButtonSuccessfully() {
        WebElement closeCookiesButton = Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        Setup.wait.until(ExpectedConditions.elementToBeClickable(closeCookiesButton));
        closeCookiesButton.click();
    }

    @Test(priority = 2)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement homeScreenIsOpened = Setup.driver.findElement(By.xpath("//body/div[@id='ml-body-container']/main[1]"));
        assertTrue(homeScreenIsOpened.isDisplayed());
    }
    @Test (priority = 4)
    public void verifyThatWishListButtonIsDisplayed() {
        WebElement wishListButton = Setup.driver.findElement(By.xpath("//body/div[@id='ml-body-container']/footer[@id='footer']/div[2]/div[4]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/div[3]/button[1]"));
        assertTrue(wishListButton.isDisplayed());
    }
    @Test (priority = 5)
    public void verifyThatAddEmailAddress() {
        WebElement addEmailAddress = Setup.driver.findElement(By.xpath("//*[@id='userEmail']"));
        assertTrue(addEmailAddress.isDisplayed());
    }
    @Test (priority = 6)
    public void verifyThatJoinNowIsDisplayed() {
        WebElement joinNow = Setup.driver.findElement(By.xpath("//div[@id='thCart']"));
        assertTrue(joinNow.isDisplayed());
    }
    @Test (priority = 8)
    public void verifyThatCartButtonIsDisplayed() {
        WebElement cartButton = Setup.driver.findElement(By.xpath("//body/div[@id='ml-body-container']/footer[@id='footer']/div[2]/div[4]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/div[3]/button[1]"));
        assertTrue(cartButton.isEnabled());
    }
    @Test(priority = 7)
    public void menu() {
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-decor-pillows-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-accessible-megamenu-furniture-1")).click();
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-furniture-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-outdoor-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) .subcategory-name")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-outdoor-1")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(6) img"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-rugs-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-decor-pillows-1")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-lighting-1")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-lighting-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-wall-decor-mirrors-1")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector(".ml-grid-view-item:nth-child(2) > .ml-thumb-image-mini img"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-accessible-megamenu-kitchen-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-dining-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-food-and-drink-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-accessible-megamenu-food-and-drink-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-gifts-1")).click();
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-holiday-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-accessible-megamenu-holiday-1")).click();
        Setup.driver.findElement(By.cssSelector(".subcategory-wrapper:nth-child(1) img")).click();
        {
            WebElement element = Setup.driver.findElement(By.id("ml-accessible-megamenu-sale-1"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-accessible-megamenu-sale-1")).click();
        Setup.driver.findElement(By.id("ml-accessible-megamenu-inspiration-1")).click();
    }
    @Test
    public void addtowishlist() {
        js.executeScript("window.scrollTo(0,1600)");
        Setup.driver.findElement(By.cssSelector(".col-sm-4:nth-child(1) a")).click();
        js.executeScript("window.scrollTo(0,14)");
        Setup.driver.findElement(By.cssSelector(".ml-grid-view-item > .mltw460685 > .ml-grid-item-info a")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector(".ml-grid-view-item > .mltw460685 > .ml-grid-item-info a"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.linkText("Justina Blakeney We Are The World Ivory Throw Pillow"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.linkText("Justina Blakeney We Are The World Ivory Throw Pillow")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector("#headingTwo .ml-custom-title > .ml-custom-title"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("addtoWishlist_460683")).click();
        Setup.driver.findElement(By.cssSelector(".ml-select-label")).click();
        Setup.driver.findElement(By.cssSelector(".ml-savedwishlist-container")).click();
        Setup.driver.findElement(By.cssSelector("label:nth-child(4)")).click();
        Setup.driver.findElement(By.name("addItemToList")).click();
        {
            WebElement element = Setup.driver.findElement(By.name("addItemToList"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.cssSelector("#headingTwo .ml-custom-title > .ml-custom-title"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
    }
    @Test
    public void addremovefromcart() {
        Setup.driver.findElement(By.cssSelector(".col-sm-4:nth-child(1) > #home_topnav_layout_15_fillslot-8 .ml-15slot-ctabuttonlinktext")).click();
        js.executeScript("window.scrollTo(0,500)");
        Setup.driver.findElement(By.cssSelector(".mltw460685 > .ml-grid-item-image img")).click();
        {
            WebElement element = Setup.driver.findElement(By.id("addToBasket460685"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("addToBasket460685")).click();
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        Setup.driver.findElement(By.linkText("View Cart (1)")).click();
        Setup.driver.findElement(By.cssSelector("#removeButton211944863 > .hidden-xs")).click();
    }
    @Test
    public void removfromwishlist() {
        js.executeScript("window.scrollTo(0,500)");
        js.executeScript("window.scrollTo(0,1400)");
        Setup.driver.findElement(By.id("showWishHeader")).click();
        Setup.driver.findElement(By.linkText("My Wish List (1)")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector(".ml-myaccount-wishlist-view-thumb img"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.id("ml-cart-remove-btn-"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        Setup.driver.findElement(By.id("ml-cart-remove-btn-")).click();
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        Setup.driver.findElement(By.cssSelector(".ml-button-set:nth-child(2) > .ml-button-submit-primary")).click();
        {
            WebElement element = Setup.driver.findElement(By.cssSelector(".ml-recommendation-carousel-view-item:nth-child(4) .ml-grid-item-image img"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = Setup.driver.findElement(By.tagName("body"));
            Actions builder = new Actions(Setup.driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }

}


