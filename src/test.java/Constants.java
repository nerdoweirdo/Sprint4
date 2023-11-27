package site.pages;

public class Constants {


    public static final String TEXT_LIST_ITEM1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String TEXT_LIST_ITEM2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String TEXT_LIST_ITEM3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String TEXT_LIST_ITEM4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String TEXT_LIST_ITEM5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String TEXT_LIST_ITEM6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String TEXT_LIST_ITEM7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String TEXT_LIST_ITEM8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public static final String URL_SCOOTER_SITE="https://qa-scooter.praktikum-services.ru/";

    Faker faker = new Faker(new Locale("ru"));
    public static final String NAME_USER_1 = faker.name();
    public static final String SURNAME_USER_1 = faker.lastName();
    public static final String ADRESS_USER_1 = faker.streetAddress();
    public static final String PHONE_USER_1 = faker.phoneNumber().cellPhone();
    public static final String COMMENT ="Привезти после 14 часов";

    public static final String NAME_USER_2 = faker.name();
    public static final String SURNAME_USER_2 = faker.lastName();
    public static final String ADRESS_USER_2 = faker.address().streetAddress();
    public static final String PHONE_USER_2 = faker.phoneNumber().cellPhone();

    public static final String NAME_USER_INCORRECT ="Petr";
    public static final String SURNAME_USER_INCORRECT ="Ivanov";
    public static final String ADRESS_USER_INCORRECT ="Street ";
    public static final String PHONE_USER_INCORRECT ="111";
    public static final String STATUS_ORDER_INCORRECT ="000000";
    public static final String YANDEX = "Яндекс";

    public static final String ERROR_MESSAGE_FIELD_NAME ="Введите корректное имя";
    public static final String ERROR_MESSAGE_FIELD_SURNAME ="Введите корректную фамилию";
    public static final String ERROR_MESSAGE_FIELD_ADRESS ="Введите корректный адрес";
    public static final String ERROR_MESSAGE_FIELD_METRO_STATION ="Выберите станцию";
    public static final String ERROR_MESSAGE_FIELD_PHONE ="Введите корректный номер";

}