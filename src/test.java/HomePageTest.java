import org.junit.Assert;
import org.junit.Test;
import site.pages.Constants;
import site.pages.HomePage;

public class HomePageTest extends Annotation {

    @org.junit.Test
    public void checkButtonYandex() {
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getTitleYandexPage(), Constants.YANDEX);

    }

    @org.junit.Test
    public void checkButtonScooter() {
        HomePage homePage = new HomePage();
        homePage.findUrlScooterPage();
        Assert.assertEquals(homePage.findUrlScooterPage(), Constants.URL_SCOOTER_SITE);

    }

    @org.junit.Test
    public void checkButtonStatusOrder() {
        HomePage homePage = new HomePage();
        homePage.findFieldOrderStatus();
    }

    @org.junit.Test
    public void checkFootButtonOrder() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderFoot();
    }

    @org.junit.Test
    public void checkHeadButtonOrder() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
    }

    @org.junit.Test
    public void checkElementListItem1() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem1();
        Assert.assertEquals(homePage.getTextElementListItem1(), Constants.TEXT_LIST_ITEM1);
    }

    @org.junit.Test
    public void checkElementListItem2() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem2();
        Assert.assertEquals(homePage.getTextElementListItem2(), Constants.TEXT_LIST_ITEM2);
    }

    @org.junit.Test
    public void checkElementListItem3() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem3();
        Assert.assertEquals(homePage.getTextElementListItem3(), Constants.TEXT_LIST_ITEM3);
    }

    @org.junit.Test
    public void checkElementListItem4() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem4();
        Assert.assertEquals(homePage.getTextElementListItem4(), Constants.TEXT_LIST_ITEM4);
    }

    @org.junit.Test
    public void checkElementListItem5() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem5();
        Assert.assertEquals(homePage.getTextElementListItem5(), Constants.TEXT_LIST_ITEM5);
    }

    @org.junit.Test
    public void checkElementListItem6() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem6();
        Assert.assertEquals(homePage.getTextElementListItem6(), Constants.TEXT_LIST_ITEM6);
    }

    @org.junit.Test
    public void checkElementListItem7() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem7();
        Assert.assertEquals(homePage.getTextElementListItem7(), Constants.TEXT_LIST_ITEM7);
    }

    @org.junit.Test
    public void checkElementListItem8() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem8();
        Assert.assertEquals(homePage.getTextElementListItem8(), Constants.TEXT_LIST_ITEM8);
    }

    @org.junit.Test
    public void checkButtonOrderHead() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
    }

    @org.junit.Test
    public void checkButtonOrderFoot() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderFoot();
    }

    @Test
    public void checkDropDownList() {
        checkElementListItem1();
        checkElementListItem2();
        checkElementListItem3();
        checkElementListItem4();
        checkElementListItem5();
        checkElementListItem6();
        checkElementListItem7();
        checkElementListItem8();

    }


}