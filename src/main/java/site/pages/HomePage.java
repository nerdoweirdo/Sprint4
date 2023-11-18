package site.pages;
import org.openqa.selenium.*;
import java.util.Set;
import static org.example.WebDrivers.driver;
import static org.example.WebDrivers.wait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class HomePage {

    private By labelYandex = By.xpath(" /symbol/path[2]");
    public By buttonOrderHead = By.xpath("//div[contains(@class,'Header_Nav')]/button");
    public By dzenElement = By.xpath("//div[@class='content']");
    private By buttonYandex = By.xpath("//img[@alt='Yandex']");
    private By buttonScooter = By.xpath("//img[@alt='Scooter']");
    public static By buttonOrderFoot = By.xpath("//div[contains(@class,'Home_FinishButton')]/button");
    public static By buttonStatusOrder = By.xpath(("//button[contains(text(),'Статус заказа')]"));
    private By elementListItem1 = By.xpath(("//div[@id='accordion__heading-0']"));
    private By openElementListItem1 = By.xpath("//p[contains(text(),'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]");
    private By elementListItem2 = By.xpath(("//div[@id='accordion__heading-1']"));
    private By openElementListItem2 = By.xpath("//p[contains(text(),'Пока что у нас так: один заказ — один самокат." +
            " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]");
    private By elementListItem3 = By.xpath(("//div[@id='accordion__heading-2']"));
    private By openElementListItem3 = By.xpath("//p[contains(text(),'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]");
    private By elementListItem4 = By.xpath(("//div[@id='accordion__heading-3']"));
    private By openElementListItem4 = By.xpath("//p[contains(text(),'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]");
    private By elementListItem5 = By.xpath(("//div[@id='accordion__heading-4']"));
    private By openElementListItem5 = By.xpath("//p[contains(text(),'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]");
    private By elementListItem6 = By.xpath(("//div[@id='accordion__heading-5']"));
    private By openElementListItem6 = By.xpath("//p[contains(text(),'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]");
    private By elementListItem7 = By.xpath(("//div[@id='accordion__heading-6']"));

    private By openElementListItem7 = By.xpath("//p[contains(text(),'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]");
    private By elementListItem8 = By.xpath(("//div[@id='accordion__heading-7']"));
    private By openElementListItem8 = By.xpath("//p[contains(text(),'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]");

    public void clickButtonOrderHead() {
        driver.findElement(buttonOrderHead).click();
    }

    public String getTitleYandexPage() {
        driver.findElement(buttonYandex).click();
        wait.until(numberOfWindowsToBe(2));
        Set<String> wind = driver.getWindowHandles();
        String[] wind1 = wind.toArray(new String[wind.size()]);
        driver.switchTo().window(wind1[1]);
        wait.until(visibilityOfElementLocated(dzenElement));
        String titleYandex = driver.getTitle();
        return titleYandex;
    }

    public void clickButtonScooter() {
        driver.findElement(buttonScooter).click();
    }

    public String findUrlScooterPage() {
        clickButtonScooter();
        String urlScooterPage = driver.getCurrentUrl();
        return urlScooterPage;
    }

    public void clickButtonOrderFoot() {
        scrollSearchElement(driver.findElement(buttonOrderFoot));
        driver.findElement(buttonOrderFoot).click();
    }

    public void clickButtonStatusOrder() {
        driver.findElement(buttonStatusOrder).click();
    }

    public void findFieldOrderStatus() {
        clickButtonStatusOrder();
        driver.findElement(By.xpath("//input[@placeholder='Введите номер заказа']"));
    }

    public String getTextElementListItem1() {
        scrollSearchElement(driver.findElement(elementListItem1));
        driver.findElement(elementListItem1).click();
        String textElementList1 = driver.findElement(openElementListItem1).getText();
        return textElementList1;
    }

    public String getTextElementListItem2() {
        scrollSearchElement(driver.findElement(elementListItem2));
        driver.findElement(elementListItem2).click();
        String textElementList2 = driver.findElement(openElementListItem2).getText();
        return textElementList2;
    }

    public String getTextElementListItem3() {
        scrollSearchElement(driver.findElement(elementListItem3));
        driver.findElement(elementListItem3).click();
        String textElementList3 = driver.findElement(openElementListItem3).getText();
        return textElementList3;
    }

    public String getTextElementListItem4() {
        scrollSearchElement(driver.findElement(elementListItem4));
        driver.findElement(elementListItem4).click();
        String textElementList4 = driver.findElement(openElementListItem4).getText();
        return textElementList4;
    }

    public String getTextElementListItem5() {
        scrollSearchElement(driver.findElement(elementListItem5));
        driver.findElement(elementListItem5).click();
        String textElementList5 = driver.findElement(openElementListItem5).getText();
        return textElementList5;
    }

    public String getTextElementListItem6() {
        scrollSearchElement(driver.findElement(elementListItem6));
        driver.findElement(elementListItem6).click();
        String textElementList6 = driver.findElement(openElementListItem6).getText();
        return textElementList6;
    }

    public String getTextElementListItem7() {
        scrollSearchElement(driver.findElement(elementListItem7));
        driver.findElement(elementListItem7).click();
        String textElementList7 = driver.findElement(openElementListItem7).getText();
        return textElementList7;
    }

    public String getTextElementListItem8() {
        scrollSearchElement(driver.findElement(elementListItem8));
        driver.findElement(elementListItem8).click();
        String textElementList8 = driver.findElement(openElementListItem8).getText();
        return textElementList8;
    }

    public void scrollSearchElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}