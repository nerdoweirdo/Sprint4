import org.junit.After;
import org.junit.Before;

import static org.example.WebDrivers.*;
import static site.pages.Constants.URL_SCOOTER_SITE;

public class Annotation {

    @Before
    public void setUp() {
        // openBrowserChrome(URL_SCOOTER_SITE);
        openBrowserFireFox(URL_SCOOTER_SITE);


    }

    @After
    public void setOff() {
        driver.quit();

    }

}