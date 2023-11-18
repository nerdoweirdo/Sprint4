package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.WebDrivers.driver;
import static org.example.WebDrivers.wait;
import static site.pages.Constants.STATUS_ORDER_INCORRECT;
import static site.pages.HomePage.buttonStatusOrder;

public class OrderStatusPage {
    public By fieldEnterOrderNumder = By.xpath("//input[@placeholder='Введите номер заказа']");
    public By buttonGo = By.xpath("//button[normalize-space()='Go!']");
    public By pictureNotFoundOrder = By.xpath("//div[contains(@class,'Track_NotFound')]//img");


    public void clickStatusOrderButton() {
        driver.findElement(buttonStatusOrder).click();
    }

    public void enterNumberOrder(String numberOrder) {
        driver.findElement(fieldEnterOrderNumder).sendKeys(numberOrder);

    }

    public void clickButtonGo() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(buttonGo));
        element.click();
    }

    public void openOrderStatusPage() {
        clickStatusOrderButton();
        enterNumberOrder(STATUS_ORDER_INCORRECT);
        clickButtonGo();
    }

    public String getAttributeNotFoundPicture() {
        String attribute;
        attribute = driver.findElement(pictureNotFoundOrder).getAttribute("alt");
        return attribute;
    }

}