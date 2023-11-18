package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.example.WebDrivers.driver;
import static site.pages.Constants.COMMENT;

public class OrderFormPage {

    private By buttonNext = By.xpath("//button[contains(text(),'Далее')]");
    private By fieldName = By.xpath("//input[@placeholder='* Имя']");
    public By fieldNameError = By.xpath("//div[contains(text(),'Введите корректное имя')]");
    public By fieldSurnameError = By.xpath("//div[contains(text(),'Введите корректную фамилию')]");
    public By fieldAdressError = By.xpath("//div[contains(text(),'Введите корректный адрес')]");
    public By fieldMetroStationError = By.xpath("//div[contains(@class,'MetroError')]");
    public By fieldPhoneError = By.xpath("//div[contains(text(),'Введите корректный номер')]");
    public By fieldSurname = By.xpath("//input[@placeholder='* Фамилия']");
    public By fieldAdress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    public By fieldMetroStation = By.xpath("//input[@placeholder='* Станция метро']");
    public By metroLihoboru = By.xpath("//button[@value='237']");
    public By metroCherkizovskaya = By.xpath("//button[@value='2']");
    public By fieldPhoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    public By fieldDateOrder = By.xpath("//div[@class='react-datepicker__input-container']/input");
    public By HeaderOrder = By.xpath("//div[contains(@class,'Order_Header')]");
    public By dayStartOrderUser1 = By.xpath("//div[@aria-label='Choose воскресенье, 1-е октября 2023 г.']");


    private By fieldRentalPeriod = By.xpath("//span[@class='Dropdown-arrow']");
    private By daysRentalPeriod1 = By.xpath("//div[@class='Dropdown-menu']/div[1]");
    private By daysRentalPeriod2 = By.xpath("//div[@class='Dropdown-menu']/div[2]");
    private By daysRentalPeriod3 = By.xpath("//div[@class='Dropdown-menu']/div[3]");
    private By daysRentalPeriod4 = By.xpath("//div[@class='Dropdown-menu']/div[4]");
    private By daysRentalPeriod5 = By.xpath("//div[@class='Dropdown-menu']/div[5]");
    private By daysRentalPeriod6 = By.xpath("//div[@class='Dropdown-menu']/div[6]");
    private By daysRentalPeriod7 = By.xpath("//div[@class='Dropdown-menu']/div[7]");
    private By colorBlack = By.xpath("//input[@id='black']");
    private By colorGrey = By.xpath("//input[@id='grey']");
    private By fieldComment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private By buttonOrderMiddle = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Заказать']");
    private By screenCompletOrder = By.xpath("//div[contains(@class,'ModalHeader')]");
    private By buttonBack = By.xpath("//button[contains(text(),'Назад')]");
    private By buttonYes = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Да']");
    private By orderLocator = By.xpath("//div[@class='Order_Header__BZXOb']");
    public By buttonCookiesOn = By.xpath("//*[@id='rcc-confirm-button']");


    public String openOrderFormButtonHead() {
        String textOrderLocator;
        HomePage homePage = new HomePage();
        driver.findElement(homePage.buttonOrderHead).click();
        textOrderLocator = (driver.findElement(HeaderOrder).getText());
        return textOrderLocator;
    }

    public String openOrderFormButtonFoot() {
        HomePage homePage = new HomePage();
        String textOrderLocator;
        homePage.clickButtonOrderFoot();
        textOrderLocator = (driver.findElement(HeaderOrder).getText());
        return textOrderLocator;
    }

    public void sendName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    public void sendSurname(String surnameUser1) {
        driver.findElement(fieldSurname).sendKeys(surnameUser1);
    }

    public void sendAdress(String adress) {
        driver.findElement(fieldAdress).sendKeys(adress);
    }

    public void sendPhoneNumber(String phone) {
        driver.findElement(fieldPhoneNumber).sendKeys(phone);
    }

    public void chooseMetroStation(By.ByXPath element) {
        HomePage homePage = new HomePage();
        driver.findElement(buttonCookiesOn).click();
        driver.findElement(fieldMetroStation).click();
        homePage.scrollSearchElement(driver.findElement((By) element));
        driver.findElement((By) element).click();
    }

    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void orderScooterHeadButtonSuccessful() {
        openOrderFormButtonHead();
        sendName(Constants.NAME_USER_1);
        sendSurname(Constants.SURNAME_USER_1);
        sendAdress(Constants.ADRESS_USER_1);
        chooseMetroStation((By.ByXPath) metroLihoboru);
        sendPhoneNumber(Constants.PHONE_USER_1);
        clickButtonNext();
        chooseDate(dayStartOrderUser1);
        chooseRentalPeriod(daysRentalPeriod7);
        chooseColorScooter(colorGrey);
        sendComment(COMMENT);
        clickButtonOrderMiddle();
        clickButtonYes();
        getTextScreenComplietOrder();

    }

    public void orderScooterFootButtonSuccessful() {
        openOrderFormButtonFoot();
        sendName(Constants.NAME_USER_2);
        sendSurname(Constants.SURNAME_USER_2);
        sendAdress(Constants.ADRESS_USER_2);
        chooseMetroStation((By.ByXPath) metroCherkizovskaya);
        sendPhoneNumber(Constants.PHONE_USER_2);
        clickButtonNext();
        enterDate("23.11.2023");
        chooseRentalPeriod(daysRentalPeriod3);
        chooseColorScooter(colorBlack);
        sendComment("");
        clickButtonOrderMiddle();
        clickButtonYes();
        getTextScreenComplietOrder();

    }

    public void chooseDate(By element) {
        driver.findElement(fieldDateOrder).click();
        driver.findElement(element).click();
    }

    public void enterDate(String date) {
        driver.findElement(fieldDateOrder).click();
        driver.findElement(fieldDateOrder).sendKeys(date);
        driver.findElement(fieldDateOrder).sendKeys(Keys.ENTER);


    }

    public void chooseRentalPeriod(By element) {
        driver.findElement(fieldRentalPeriod).click();
        driver.findElement(element).click();
    }

    public void chooseColorScooter(By element) {
        driver.findElement(element).click();
    }

    public void sendComment(String comment) {
        driver.findElement(fieldComment).click();
        driver.findElement(fieldComment).sendKeys(comment);
    }

    public void clickButtonOrderMiddle() {
        driver.findElement(buttonOrderMiddle).click();
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public String getTextScreenComplietOrder() {
        String orderText;
        orderText = driver.findElement(screenCompletOrder).getText();
        return orderText;
    }

    public void findErrorMessageName() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
        clickButtonNext();
        driver.findElement(fieldNameError);
    }

    public void findErrorMessageSurname() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
        clickButtonNext();
        driver.findElement(fieldSurnameError);
    }

    public void findErrorMessageAdress() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
        clickButtonNext();
        driver.findElement(fieldAdress).sendKeys("1");
        driver.findElement(fieldAdressError);
    }

    public void findErrorMessageMetroStation() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
        clickButtonNext();
        driver.findElement(fieldMetroStationError);
    }

    public void findErrorMessagePhone() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
        clickButtonNext();
        driver.findElement(fieldPhoneError);
    }
}