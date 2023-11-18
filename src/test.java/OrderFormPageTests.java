import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import site.pages.OrderFormPage;

public class OrderFormPageTests extends Annotation {
    @Test
    public void openOrderFormHeadButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        Assert.assertEquals(orderFormPage.openOrderFormButtonHead(), "Для кого самокат");
    }

    @Test
    public void openOrderFormFootButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        Assert.assertEquals(orderFormPage.openOrderFormButtonFoot(), "Для кого самокат");
    }

    @Test
    public void successfulOrderScooterHeadButtonTest() {
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.orderScooterHeadButtonSuccessful();
        orderFormPage.getTextScreenComplietOrder();
        Assert.assertEquals(orderFormPage.getTextScreenComplietOrder().startsWith("Заказ оформлен"), true);

    }
    @Test
    public void successfulOrderScooterFootButtonTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.orderScooterFootButtonSuccessful();
        orderFormPage.getTextScreenComplietOrder();
        Assert.assertEquals(orderFormPage.getTextScreenComplietOrder().startsWith("Заказ оформлен"), true);

    }
    @Test
    public void ErrorNameTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.findErrorMessageName();
        Assert.assertTrue(String.valueOf(ExpectedConditions.visibilityOfElementLocated( orderFormPage.fieldNameError)),true);

    }
    @Test
    public void ErrorSurnameTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.findErrorMessageSurname();
        Assert.assertTrue(String.valueOf(ExpectedConditions.visibilityOfElementLocated( orderFormPage.fieldSurnameError)),true);

    }
    @Test
    public void ErrorAdressTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.findErrorMessageAdress();
        Assert.assertTrue(String.valueOf(ExpectedConditions.visibilityOfElementLocated(orderFormPage.fieldAdressError)),true);

    }
    @Test
    public void ErrorMetroStationTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.findErrorMessageMetroStation();
        Assert.assertTrue(String.valueOf(ExpectedConditions.visibilityOfElementLocated(orderFormPage.fieldMetroStationError)),true);

    }
    @Test
    public void ErrorPhoneNumberTest(){
        OrderFormPage orderFormPage = new OrderFormPage();
        orderFormPage.findErrorMessagePhone();
        Assert.assertTrue(String.valueOf(ExpectedConditions.visibilityOfElementLocated(orderFormPage.fieldPhoneError)),true);

    }



}