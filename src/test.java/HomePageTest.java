import org.junit.Assert;
import org.junit.Test;
import site.pages.Constants;
import site.pages.HomePage;

@RunWith(Parameterized.class)
public class HomePageTest extends BaseTest {

    private final String name;
    private final String lastName;
    private final String city;
    private final String metro;
    private final String phone;
    protected WebDriver driver;

    public OrderTest(String name, String lastName, String city, String metro, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.metro = metro;
        this.phone = phone;
    }

    @Parameterized.Parameters
    public static Object[][] getQue() {
        return new Object[][]{
                {"Василий", "Петров","Москва","Черкизовская","+79515553344"},
                {"Иван", "Петров","Москва","Сокольники","+79517775544"}


        };
    }

    @Test
    public void checkButtonYandex() {
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.getTitleYandexPage(), Constants.YANDEX);

    }

    @Test
    public void checkButtonScooter() {
        HomePage homePage = new HomePage();
        homePage.findUrlScooterPage();
        Assert.assertEquals(homePage.findUrlScooterPage(), Constants.URL_SCOOTER_SITE);

    }

    @Test
    public void checkButtonStatusOrder() {
        HomePage homePage = new HomePage();
        homePage.findFieldOrderStatus();
    }

    @Test
    public void checkFootButtonOrder() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderFoot();
    }

    @Test
    public void checkHeadButtonOrder() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
    }

    @Test
    public void checkElementListItem1() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem1();
        Assert.assertEquals(homePage.getTextElementListItem1(), Constants.TEXT_LIST_ITEM1);
    }

    @Test
    public void checkElementListItem2() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem2();
        Assert.assertEquals(homePage.getTextElementListItem2(), Constants.TEXT_LIST_ITEM2);
    }

    @Test
    public void checkElementListItem3() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem3();
        Assert.assertEquals(homePage.getTextElementListItem3(), Constants.TEXT_LIST_ITEM3);
    }

    @Test
    public void checkElementListItem4() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem4();
        Assert.assertEquals(homePage.getTextElementListItem4(), Constants.TEXT_LIST_ITEM4);
    }

    @Test
    public void checkElementListItem5() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem5();
        Assert.assertEquals(homePage.getTextElementListItem5(), Constants.TEXT_LIST_ITEM5);
    }

    @Test
    public void checkElementListItem6() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem6();
        Assert.assertEquals(homePage.getTextElementListItem6(), Constants.TEXT_LIST_ITEM6);
    }

    @Test
    public void checkElementListItem7() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem7();
        Assert.assertEquals(homePage.getTextElementListItem7(), Constants.TEXT_LIST_ITEM7);
    }

    @Test
    public void checkElementListItem8() {
        HomePage homePage = new HomePage();
        homePage.getTextElementListItem8();
        Assert.assertEquals(homePage.getTextElementListItem8(), Constants.TEXT_LIST_ITEM8);
    }

    @Test
    public void checkButtonOrderHead() {
        HomePage homePage = new HomePage();
        homePage.clickButtonOrderHead();
    }

    @Test
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