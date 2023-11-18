import org.junit.Assert;
import org.junit.Test;
import site.pages.OrderStatusPage;

public class OrderStatusPageTests extends Annotation {
    @Test
    public void checkIncorrectOrderNumber(){
        OrderStatusPage orderStatusPage=new OrderStatusPage();
        orderStatusPage.openOrderStatusPage();
        orderStatusPage.getAttributeNotFoundPicture();
        Assert.assertEquals(orderStatusPage.getAttributeNotFoundPicture(),"Not found");


    }

}